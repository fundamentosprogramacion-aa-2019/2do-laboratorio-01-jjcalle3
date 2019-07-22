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
public class Operacion_departamento {

    public double obtenerSumaPresupuestos(Departamento_municipal[] 
            departamentos) {
        double sumaPresupuestos = 0;

        for (int i = 0; i < departamentos.length; i++) {
            sumaPresupuestos = (double) departamentos[i].obtenerPresupuesto() 
                    + sumaPresupuestos;
        }
        return sumaPresupuestos;
    }

    public double obtenerPromedioEdades(Departamento_municipal[] 
            departamentos) {
        double sumaEdades = 0;
        double promedio;
        for (int i = 0; i < departamentos.length; i++) {
            sumaEdades = (double) departamentos[i].obtenerJefe().obtenerEdad()
                    + sumaEdades;
        }

        promedio = sumaEdades / departamentos.length;
        return promedio;
    }
}
