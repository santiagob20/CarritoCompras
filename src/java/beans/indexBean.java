/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.faces.bean.ManagedBean;
import pq1.OperUser;
import pq3.Usuario;

/**
 *
 * @author santiagob20
 */
@ManagedBean
public class indexBean {
    private String user;
    private String password;
    
    OperUser op = new OperUser();




    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
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
        if(op.consultar(indexBean.this))
        {
         result= "login";
        }
        return result; 
    }
    
}
