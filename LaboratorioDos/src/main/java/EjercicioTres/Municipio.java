/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioTres;

/**
 *
 * @author COMPUMARS
 */
public class Municipio {
    private String nombre;
    private Ciudad ciudad;

    
    public Municipio(String n, Ciudad c) {
        establecerNombre(n);
        establecerCiudad(c);

    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(Ciudad c) {
        ciudad = c;
    }

    public String obtenerNombres() {
        return nombre;
    }

    public Ciudad obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Municipio: \n\tNombre: %s\n\t"
                + "Ciudad: %s\n\t",
                obtenerNombres(),
                obtenerCiudad().obtenerNombre());

        return cadena;
    }
}
