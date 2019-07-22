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
public class Region {
    private String nombre;
    
    public Region (String n){
        establecerNombre(n);
    }
    public void establecerNombre(String e) { //para establecer la variable
        nombre = e;
    }

    public String obtenerNombre() { //para devolver el valor de la variable
        return nombre;
    }/*
     public String toString(){
        String cadena = String.format("Region:\n\tNombre:%s\n"
                + obtenerNombre());
        return cadena;
    }*/
}
