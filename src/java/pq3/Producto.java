/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq3;

import java.util.List;
import javax.faces.bean.ManagedBean;
import pq1.OperProductos;

/**
 *
 * @author santiagob20
 */
@ManagedBean
public class Producto {
    private String nombreP;
    private int precio;
    int cantidad;
    String tipoProducto;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    

    /**
     * @return the nombreP
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * @param nombreP the nombreP to set
     */
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    /**
     * @return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public String registrarP(){
        OperProductos op = new OperProductos();
        boolean result=false; 
        result= op.insertar(this);
        
        if(result)
        {
            return "insertado";    
        }else
        {
            return "no insertado";
        }
    }
    
    
    
    public List<Producto> mostrarProductos()
    {
        OperProductos oper = new OperProductos();
        return oper.consultar();
    }
}
