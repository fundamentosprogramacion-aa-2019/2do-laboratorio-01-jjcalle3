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
public class Equipo {
    private String nombre;
    private Federacion federacion;
    private int numeroCampeonatos;
    
    public Equipo(String n, Federacion f, int numCamp){
        establecerNombre(n);
        establecerFederacion(f);
        establecerNumeroCampeonatos(numCamp);
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }        
    public void establecerFederacion(Federacion f){
        federacion = f;
    }
     public void establecerNumeroCampeonatos(int numCamp){
        numeroCampeonatos = numCamp;
    }
     
     
    public int obtenerNumeroCampeonatos(){
        return numeroCampeonatos;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public Federacion obtenerFederacion(){
        return federacion;
    }
    public String toString(){
        String cadena = String.format("----------------------------------------"
                + "--------------------\n"
                + "EQUIPO:\n\t"
                + "- Nombre: %s\n\t"
                + "- Numero de campeonatos: %d\n"
                + "FEDERACIÓN: \n\t"
                + "- Nombre de la federacion: %s\n\t"
                ,
                obtenerNombre(),
                obtenerNumeroCampeonatos(),
                obtenerFederacion().obtenerNombres());
        return cadena;
    }
}
