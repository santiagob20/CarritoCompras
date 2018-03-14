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
import javax.faces.bean.ManagedBean;
import javax.swing.table.DefaultTableModel;
import org.primefaces.model.DualListModel;
import pq2.InterfaceProducto;
import pq3.Producto;

/**
 *
 * @author santiagob20
 */
@ManagedBean
public class OperProductos implements InterfaceProducto {

    Conexion cn = new Conexion();
    Producto p = new Producto();
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
    public List<OperProductos> consultar() {
        ArrayList<OperProductos> lista = null;
        try
        {
            cn.conectarseX();
            PreparedStatement st = cn.conectarseX().prepareStatement("SELECT * FROM producto");
            lista = new ArrayList();
            ResultSet rs = st.executeQuery();
            DefaultTableModel dfBuscar = new DefaultTableModel();
            //JFVerEquipo.jTable.setModel(dfBuscar);
            dfBuscar.setColumnIdentifiers(new Object[]{"nombre","precio"});
            while (rs.next()) 
            {
                dfBuscar.addRow(new Object[]{rs.getString("nombre"), rs.getInt("precio")});
                //lista.add(this)
            }                    
       } 
        catch (SQLException ex) {        
            Logger.getLogger(OperProductos.class.getName()).log(Level.SEVERE, null, ex);
        }        
        finally
        {
           cn.desconectarse();
       }
        for (int i = 0; i < lista.size(); i++) 
        {
            System.out.println(lista.get(i));
        }
        return lista;
    }

    @Override
    public void editar(registrarBean p) {
    
    }

    @Override
    public void eliminar(registrarBean p) {
    
    }
    
}
