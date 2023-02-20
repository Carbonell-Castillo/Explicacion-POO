/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.explicacionjosue;

/**
 *
 * @author bruce
 */
public class Usuario extends Persona{
    private String correo, contraseña, fotografia, rol;

    public Usuario(){
        correo="";
        contraseña="";
        fotografia="";
        rol="";
    }
    
    public Usuario(String correo, String contraseña, String fotografia, String rol) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.fotografia = fotografia;
        this.rol = rol;
    }

    public Usuario(String correo, String contraseña, String fotografia, String rol, String nombre, String apellido, String dpi, String fechaNacimiento, String genero, String nacionalidad, String telofono) {
        super(nombre, apellido, dpi, fechaNacimiento, genero, nacionalidad, telofono);
        this.correo = correo;
        this.contraseña = contraseña;
        this.fotografia = fotografia;
        this.rol = rol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
}
