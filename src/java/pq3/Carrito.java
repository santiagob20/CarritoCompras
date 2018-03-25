/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pq3;

import java.util.List;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author santiagob20
 */
@ManagedBean
public class Carrito {
    private String nombreP;
    private int precio;
    private int cantidad;
    private String tipoProducto;

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
    
    public String guardarCarrito(Producto p)
    {
        setNombreP(p.getNombreP());
        setCantidad(p.getCantidad());
        setPrecio(p.getPrecio());
        setTipoProducto(p.getTipoProducto());
        return "guardado";
    }
    
    public Carrito verCarrito(){
        Carrito car = new Carrito();
        String[] c = new String[4];
        c[0] = car.getNombreP();
        c[1] = String.valueOf(car.getCantidad());
        c[2] = String.valueOf(car.getPrecio());
        c[3] = car.getTipoProducto();

        return car;
    }
}
