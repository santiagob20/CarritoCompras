/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import pq1.OperProductos;


/**
 *
 * @author santiagob20
 */
@ManagedBean
public class registrarBean {

    String insert;

    public void setInsert(String insert) {
        this.insert = insert;
    }

    public String getInsert() {
        return insert;
    }
    private String nombreP;
    int precio;
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

    public OperProductos getOp() {
        return op;
    }

    public void setOp(OperProductos op) {
        this.op = op;
    }
    
    OperProductos op = new OperProductos();
    
    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public String registrarP(){
        boolean result=false;
        if(getNombreP()!=""||getPrecio()!=0||getPrecio()!=0)
        {
            result=op.insertar(registrarBean.this);
        }
        
        if(result==true){
           insert="insertado";
           return insert;
        }else
        {
        insert="no insertado";
        return insert;
        }
    }
    
}
