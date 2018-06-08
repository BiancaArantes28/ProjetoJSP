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
    
    public void cadastrar(MetaBean meta) {
        String sql = "insert into meta(tipometa,objetivo) values(?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, meta.getTipometa());
            ps.setFloat(2, meta.getObjetivo());
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MetaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
