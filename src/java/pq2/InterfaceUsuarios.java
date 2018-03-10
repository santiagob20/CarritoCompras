/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq2;

import pq3.Usuario;

/**
 *
 * @author santiagob20
 */
public interface InterfaceUsuarios {
    public boolean consultar(Usuario us);
    public void insertar(Usuario us);
    public void editar(Usuario us);
    public void eliminar(Usuario us);
}
