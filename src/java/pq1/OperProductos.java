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
    public boolean insertar(Producto p) {
        boolean result=true;
        if(cn!=null){
            
        try
        {
            
            cn.conectarseX();
            System.out.println("conectado!");
            PreparedStatement st = cn.conectarseX().prepareStatement("INSERT INTO producto VALUES(?,?,?,?,?,?)");
            st.setString(1,p.getNombreP());
            st.setInt(2,p.getPrecio());
            st.setInt(3, p.getCantidad());
            st.setString(4, p.getTipoProducto());
            st.setString(5,p.getMarca());
            st.setString(6, p.getDescripcion());
            st.executeUpdate();
            result=true;
        } catch (SQLException ex) {
            Logger.getLogger(OperUser.class.getName()).log(Level.SEVERE, null, ex);
            result=false;
        }
        }
     return result;
    }

    @Override
    public List<Producto> consultar() {
        ArrayList<Producto> lista = new ArrayList();
        try {
            cn.conectarseX();
            PreparedStatement st = cn.conectarseX().prepareStatement("SELECT * FROM producto");
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setNombreP(rs.getString("nombre"));
                p.setPrecio(rs.getInt("precio"));
                p.setCantidad(rs.getInt("cantidad"));
                p.setTipoProducto(rs.getString("tipoProducto"));
                p.setMarca(rs.getString("marca"));
                p.setDescripcion(rs.getString("descripcion"));
                lista.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(OperProductos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cn.desconectarse();
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
