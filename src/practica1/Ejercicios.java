package practica1;
import java.lang.Math;
import java.util.List; //Biblioteca para primer y segundo ejercicio

public class Ejercicios {
    
    public void ejercicio1 (){
        List<Integer> numeros = List.of(18,6,4,15,55,78,12,9,8);
        int contador = 0;
        
        for(int numero : numeros){
            if(numero > 10){
                contador++;
            }
        }
        System.out.println(contador);
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
