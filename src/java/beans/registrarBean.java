/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import pq1.OperProductos;
import pq3.Producto;


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

    OperProductos op = new OperProductos();
    Producto p = new Producto();
 
    public String registrarP(){
        boolean result=false;
       
            result=op.insertar(p);
        
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
