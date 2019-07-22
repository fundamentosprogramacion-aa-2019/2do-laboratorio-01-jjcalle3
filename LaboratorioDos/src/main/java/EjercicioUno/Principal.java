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
public class Principal {
    
public static void main(String[] args){
        
      Region r1 = new Region ("Costa");
      Region r2 = new Region ("Sierra");
      Region r3 = new Region ("Oriente");
     
      Provincia pr1 = new Provincia ("Loja", r2);
      Provincia pr2 = new Provincia ("Imbabura", r2);
      Provincia pr3 = new Provincia ("Chimborazo", r2);
      Provincia pr4 = new Provincia ("Pichincha", r2);
      Provincia pr5 = new Provincia ("Guayas", r1);
      Provincia pr6 = new Provincia ("Esmeraldas", r1);
      Provincia pr7 = new Provincia ("Santa Elena", r1);
      Provincia pr8 = new Provincia ("Napo", r3);
      Provincia pr9 = new Provincia ("Orellana", r3);
      Provincia pr10 = new Provincia ("Pastaza", r3);
      
      Ciudad c1 = new Ciudad("Loja", 245800, pr1);
      Ciudad c2 = new Ciudad("Guayaquil",2386000, pr5);
      Ciudad c3 = new Ciudad("Quito",2140000, pr4);
      Ciudad c4 = new Ciudad("Esmeraldas", 174590, pr6);
      Ciudad c5 = new Ciudad("Puyo", 32770, pr8);
      
        
        Ciudad [] ciudades = new Ciudad [5];
        ciudades [0] = c1;
        ciudades [1] = c2;
        ciudades [2] = c3;
        ciudades [3] = c4;
        ciudades [4] = c5;
        
        
        for (int i = 0; i < ciudades.length; i++) {
            System.out.printf("%s\n", ciudades[i]);
        }
        
        int suma = 0; //para almacenar el numero de ciudades
        for (int i = 0; i < ciudades.length; i++) {
            suma = ciudades[i].obtenerPoblacion() + suma;
        }
        double promedio;
        promedio = (double) suma / ciudades.length; //promedio población
        System.out.printf("-----------------------o"
                + "------------------------------\n"
                + "El promedio de número de habitantes es: %.2f\n", promedio);
    }
    
}
