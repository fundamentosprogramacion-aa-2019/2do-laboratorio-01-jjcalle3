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
public class Ciudad {
    private String nombre;
    private int poblacion;
    private Provincia provincia;
    
    public Ciudad  (String n, int p, Provincia pr){
        establecerNombre(n);
        establecerPoblacion(p);
        establecerProvincia(pr);
    }
     public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerPoblacion(int p){
        poblacion = p;
    }
    public void establecerProvincia(Provincia pr){
        provincia = pr;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerPoblacion(){
        return poblacion;
    }
    public Provincia obtenerProvincia(){
        return provincia;
    }
     public String toString(){
        String cadena = String.format ("---------------------------------o-----"
                + "-------------------\n"
                + "Ciudad:\n\tNombre: %s\n\tpoblación: "
                + "%d\n\t Provincia:%s"
                 ,obtenerNombre(), obtenerPoblacion(), 
                 obtenerProvincia().obtenerNombre());        
        return cadena;
    }
}
