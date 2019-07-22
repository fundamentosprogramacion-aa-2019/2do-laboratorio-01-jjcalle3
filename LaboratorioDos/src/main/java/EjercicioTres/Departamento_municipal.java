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
public class Departamento_municipal {
    private String nombre;
    private AreaMunicipal area;
    private double presupuesto;
    private Persona jefe;
    
    
    public Departamento_municipal(String n, Persona p, AreaMunicipal a, 
            double pr){
        establecerNombre(n.toUpperCase());
        establecerJefe(p);
        establecerArea(a);
        establecerPresupuesto(pr);
        
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerJefe(Persona p) {
        jefe = p;
    }

    public void establecerArea(AreaMunicipal a) {
        area = a;
    }

    public void establecerPresupuesto(double pr) {
        presupuesto = pr;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public Persona obtenerJefe() {
        return jefe;
    }

    public AreaMunicipal obtenerArea() {
        return area;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
    @Override
    public String toString(){
        String cadena = String.format("Departamento Municipal: \n\tNombre: "
                + "%s\n\t"
                + "Area Municipal: %s\n\tPresupuesto: %s\n\t"
                + "Jefe: %s %s\n\t",
               obtenerNombre(), 
               obtenerArea().obtenetNombre(),
               obtenerPresupuesto(),
               obtenerJefe().obtenerNombre(),obtenerJefe().obtenerApellido());
        
        return cadena;
   }
}
