package practica1;
import java.lang.Math;

public class Ejercicios {
    
    public void ejercicio1 (){

    }

    public void ejercicio2 (){
        
    }

    public void ejercicio3 (int numero){

        /*--- Programación Imperativa ---*/
        System.out.println("Módulo en Programación Imperativa: ");
        int modulo = numero % 2;  
        System.out.println( "El módulo de " + numero + " es " + modulo );

        
        /*--- Programación Declarativa ---*/
        System.out.println("Módulo en Programación Declarativa: ");
        System.out.println( "El módulo de " + numero + " es " + Math.floorMod(numero, 2) );

    }
}
