/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.explicacionjosue;

/**
 *
 * @author bruce
 */
public class Persona {
    private String nombre, apellido, dpi, fechaNacimiento, genero, nacionalidad, telofono;
    
    public Persona(){
        nombre="";
        apellido="";
        dpi="";
    }
    
    public Persona(String nombre, String apellido, String dpi, String fechaNacimiento, String genero, String nacionalidad, String telofono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dpi = dpi;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.telofono = telofono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelofono() {
        return telofono;
    }

    public void setTelofono(String telofono) {
        this.telofono = telofono;
    }
    
    
}
