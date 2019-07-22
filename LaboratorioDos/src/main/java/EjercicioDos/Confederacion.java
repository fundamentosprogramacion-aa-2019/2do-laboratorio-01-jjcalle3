/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioDos;

/**
 *
 * @author COMPUMARS
 */
public class Confederacion {
    private String nombre;
    private String siglas;
    
    public Confederacion(String n, String s){
        establecerNombre(n);
        establecerSiglas(s);
    }
    
    public void establecerNombre(String m){
        nombre = m;
    }
    
    public void establecerSiglas(String s){
        siglas = s;
    }
    
    public String obtenerNombre(){
        return nombre;
    }    
    
    public String obtenerSiglas(){
        return siglas;
    }    
}

