/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioUno;

/**
 *
 * @author COMPUMARS
 */
public class Provincia {
     private String nombre;
     private Region region;
    
    public Provincia  (String m,  Region p){
        establecerNombre(m);        
        establecerRegion(p);
    }
    public void establecerNombre(String m){
        nombre = m;
    }
     public void establecerRegion(Region g){
        region = g;
     }
     
    public String obtenerNombre(){
        return nombre;
    }
    public Region obtenerRegion(){
        return region;
    }
    public String toString(){
        String cadena = String.format("Provincia:\n\tNombre:%s\n\tCiudad"
                + ":\n", obtenerNombre());
        return cadena;
    }
}   

