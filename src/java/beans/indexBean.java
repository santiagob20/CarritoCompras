/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import pq3.Usuario;

/**
 *
 * @author santiagob20
 */
@ManagedBean
public class indexBean {
    private String usuario;
    private String password;
    
    Usuario user = new Usuario();

    public indexBean(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String validarLogin()
    {
        String result="";
        if(usuario.equals(user.getUser()) && password.equals(user.getPassword()))
        {
         result= "Principal.xhtml";
        }
        return result; 
    }
    
}
