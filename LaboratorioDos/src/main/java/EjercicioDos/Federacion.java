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
public class Federacion {
    private String nombre;
    private String deporte;
    private Confederacion confederacion;

    public Federacion(String n, Confederacion c, String d) {
        establecerNombres(n);
        establecerDeporte(d);
        establecerConfederacion(c);
    }

    public void establecerNombres(String n) {
        nombre = n;
    }

    public void establecerDeporte(String d) {
        deporte = d;
    }

    public void establecerConfederacion(Confederacion c) {
        confederacion = c;
    }

    public String obtenerNombres() {
        return nombre;
    }

    public String obtenerdeporte() {
        return deporte;
    }

    public Confederacion obtenerConfederacion() {
        return confederacion;
    }
}

