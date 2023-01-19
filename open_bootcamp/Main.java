package com.open_bootcamp;
    
public class Main{
    
 
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();

        System.out.println(" el numero de puertas es:" + miCoche.puertas);
    }

    public static void suma (int a, int b, int c) {
      
    }
}

class Coche{
   public int puertas = 0 ; 
   
   /**
 * 
 */
public void agregarPuertas() {
        this.puertas ++;
   }
}