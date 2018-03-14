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
    String nombreP;
    int precio;
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
        op.insertar(registrarBean.this);

        return "insertado";
    }
    
}
