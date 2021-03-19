package practica1;
import java.lang.Math;
import java.util.List; //Biblioteca para primer y segundo ejercicio

public class Ejercicios {
    
    public void ejercicio1 (){
        List<Integer> numeros = List.of(18,6,4,15,55,78,12,9,8);
        
        Long result = numeros.stream().filter(num -> num > 10).count();
        System.out.println("Hay " + result + " números mayores a 10");
    }

    public void ejercicio2 (){
        List<String> colors = List.of("rojo","azul","verde","morado","naranja","amarillo");
        
        System.out.println("¿El color es rojo?: " + colors.contains("rojo"));
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
