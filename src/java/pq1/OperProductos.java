/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq1;

import beans.registrarBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import org.primefaces.model.DualListModel;
import pq2.InterfaceProducto;
import pq3.Producto;

/**
 *
 * @author santiagob20
 */
public class OperProductos implements InterfaceProducto {

    Conexion cn = new Conexion();
    @Override
    public void insertar(registrarBean p) {
        
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
    public List<registrarBean> consultar(registrarBean p) {
        List<String> lista = new ArrayList<String>();
 
        try
        {
            cn.conectarseX();
            PreparedStatement st = cn.conectarseX().prepareStatement("SELECT * FROM producto");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) 
            {
                lista.add("pan");
                lista.add("Jugo");
                lista.add("Huevos");
            }     
        } 
        catch(SQLException ex)
        {
            System.out.println(ex);
        }
        finally
        {
           cn.desconectarse();
       }
        return null; //lista;
    }

    @Override
    public void editar(registrarBean p) {
    
    }

    @Override
    public void eliminar(registrarBean p) {
    
    }
    
}
