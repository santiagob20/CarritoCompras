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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pq2.InterfaceProducto;
import pq3.Producto;

/**
 *
 * @author santiagob20
 */
public class OperProductos implements InterfaceProducto {

    @Override
    public void insertar(Producto p) {
        Conexion cn = new Conexion();
        
        if(cn!=null){
            
        try
        {
            cn.conectarseX();
            System.out.println("conectado!");
            PreparedStatement st = cn.conectarseX().prepareStatement("INSERT INTO producto(nombre,precio) VALUES(?,?)");
            st.setString(1,p.getNombreP());
            st.setInt(2,p.getPrecio());
            st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(OperUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
     
    }

    @Override
    public List<Producto> consultar(Producto p) {
        return null;
    }

    @Override
    public void editar(Producto p) {
    
    }

    @Override
    public void eliminar(Producto p) {
    
    }
    
}
