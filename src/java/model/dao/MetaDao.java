/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import static java.time.Clock.system;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.MetaBean;
import model.factory.ConnectionFactory;
/**
 *
 * @author internet
 */
public class MetaDao {
    
    private Connection con;

    public MetaDao(){
        this.con = new ConnectionFactory().getConnection();
    }
    public boolean alterarMeta(MetaBean meta){
        boolean retorno;
        
        try{
             
             String teste = "UPDATE meta " + "SET tipometa = ?, objetivo = ?, status = ?" + " WHERE id = ?";
             
             PreparedStatement update = con.prepareStatement(teste);
             System.out.print("cai aqui");
             update.setString(1,meta.getTipometa());
             update.setFloat(2, meta.getObjetivo());
             update.setString(3,meta.getStatus());
             update.setInt(4, meta.getId());
             update.executeUpdate();
             update.close();
             retorno = true;
        }catch (SQLException ex) {
            Logger.getLogger(MetaDao.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }
    public boolean cadastrar(MetaBean meta) {
        boolean retorno;
        Date data_atual = new Date(System.currentTimeMillis());
        String status = "em andamento";
        String sql = "insert into meta(tipometa,objetivo,dataini,status) values(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, meta.getTipometa());
            ps.setFloat(2, meta.getObjetivo());
            ps.setDate(3, data_atual);
            ps.setString(4, status);
            ps.executeUpdate();
            ps.close();
            retorno = true;
        } catch (SQLException ex) {
            Logger.getLogger(MetaDao.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }
    
    public boolean excluirMeta(int id){
        boolean retorno;
        try{
            String sql = "DELETE FROM meta WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            retorno = true;
        }catch (SQLException ex) {
            Logger.getLogger(MetaDao.class.getName()).log(Level.SEVERE, null, ex);
            retorno = false;
        }
        return retorno;
    }
    
    public List<MetaBean> buscaMetas(){
        List<MetaBean> listMeta = new ArrayList();
        String sql = "SELECT * FROM meta";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                MetaBean meta = new MetaBean(rs.getString("tipometa"), rs.getFloat("objetivo"));
                meta.setId(rs.getInt("id"));
                meta.setStatus(rs.getString("status"));
                listMeta.add(meta);
            }
            rs.close();
            ps.close();
            
        }catch (SQLException ex) {
            Logger.getLogger(MetaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print(listMeta);
        return listMeta;
    }
    
    
    
    public MetaBean buscaMetaporId(int id){
        MetaBean meta = null;
        try{
            String sql = "SELECT * FROM meta WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                meta = new MetaBean(rs.getString("tipometa"), rs.getFloat("objetivo"));
                meta.setId(rs.getInt("id"));
                
            }
            rs.close();
            ps.close();
        }catch (SQLException ex) {
            Logger.getLogger(MetaDao.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return meta;
    }
    
    public List<MetaBean> buscaMetasPorStatus(String status){
        List<MetaBean> listMeta = new ArrayList();
        String sql = "SELECT * FROM meta WHERE status = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, status);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                MetaBean meta = new MetaBean(rs.getString("tipometa"), rs.getFloat("objetivo"));
                meta.setId(rs.getInt("id"));
                meta.setStatus(rs.getString("status"));
                listMeta.add(meta);
            }
            rs.close();
            ps.close();
            
        }catch (SQLException ex) {
            Logger.getLogger(MetaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print(listMeta);
        return listMeta;
    }
    
}
