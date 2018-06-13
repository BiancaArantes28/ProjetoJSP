/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.UsuarioBean;
import model.factory.ConnectionFactory;

/**
 *
 * @author HélioFerreira
 */
public class UsuarioDao {
    
    private Connection con;

    public UsuarioDao() {
        this.con = new ConnectionFactory().getConnection();
    }
    
    public UsuarioBean autenticar(String nome, String senha) {
        UsuarioBean usuario = null;
        String sql = "select * from usuario where usuario = ? and senha = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                usuario = new UsuarioBean();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setPeso(rs.getFloat("peso"));
                usuario.setUsuario(rs.getString("usuario"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }
    
}
