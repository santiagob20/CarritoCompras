/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq2;

import beans.indexBean;


/**
 *
 * @author santiagob20
 */
public interface InterfaceUsuarios {
    public boolean consultar(indexBean us);
    public void insertar(indexBean us);
    public void editar(indexBean us);
    public void eliminar(indexBean us);
}
