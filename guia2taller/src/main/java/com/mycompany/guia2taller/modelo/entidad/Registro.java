package com.mycompany.guia2taller.modelo.entidad;


import java.io.Serializable;

/**
 *
 * @author Luis Camacho
 */
public class Registro implements Serializable{
    private String nombre;
    private String Correo;
    private Integer edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    
    public int getTamanio(){
        return nombre.length()*2+Correo.length()*2+4;
    }
    
    
    
}
