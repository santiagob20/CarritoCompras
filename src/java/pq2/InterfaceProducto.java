/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq2;

import beans.registrarBean;
import java.util.List;
import pq3.Producto;


/**
 *
 * @author santiagob20
 */
public interface InterfaceProducto {
    public void insertar(registrarBean p);
    public Producto consultar();
    public void editar(registrarBean p);
    public void eliminar(registrarBean p);
}
