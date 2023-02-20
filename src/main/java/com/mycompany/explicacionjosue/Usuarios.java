/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.explicacionjosue;
import java.util.ArrayList;
/**
 *
 * @author bruce
 */
public class Usuarios {
    private ArrayList<Usuario> usuarios;
    
    public Usuarios(){
        this.usuarios= new ArrayList();
    }
    
    public void addUsuarios(Usuario usuario){
        usuarios.add(usuario);
        
    }
    
    public Boolean validacion(String correo, String contraseña){
        Boolean validacion=false;
        for (int i = 0; i < usuarios.size(); i++) {
            if(usuarios.get(i).getCorreo().equals(correo) && usuarios.get(i).getContraseña().equals(contraseña) ){
                validacion=true;
            }
        }
        return validacion;
    }
    
}
