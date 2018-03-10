/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pq3.Usuario;
import pq2.InterfaceUsuarios;

/**
 *
 * @author santiagob20
 */
public class OperUser implements InterfaceUsuarios {
 
    
    @Override
    public boolean consultar(Usuario us){
        Conexion cn = new Conexion();
        
        Connection c = cn.conectarseX();
        
        boolean auth = false;
        System.out.println(us.getUser()+"----"+us.getPassword());
        
        if(c!=null){
            
        try
        {
            cn.conectarseX();
            System.out.println("conectado!");
            PreparedStatement st = c.prepareStatement("SELECT * FROM usuario WHERE user = ? AND password = ?");
            st.setString(1,us.getUser());
            st.setString(2,us.getPassword());
            ResultSet rs = st.executeQuery();
            System.out.println(rs.toString());
            while(rs.next())
            {
                auth = true;
            }
            System.out.println(us.getUser());
            System.out.println(us.getPassword());
            
            
        
        } catch (SQLException ex) {
            Logger.getLogger(OperUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(auth);
       
        }
         return auth;
    }

    @Override
    public void insertar(Usuario us) {
        
    }

    @Override
    public void editar(Usuario us) {
        
    }

    @Override
    public void eliminar(Usuario us) {
        
    }
}

