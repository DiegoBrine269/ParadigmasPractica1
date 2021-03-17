package practica1;

public class Ejercicios {
    
    public void ejercicio1 (){

    }

    public void ejercicio2 (){
        
    }

    public void ejercicio3 (int numero){

        System.out.println("Módulo en Programación Imperativa: ");
        int modulo = numero % 2;  
        System.out.println( "El módulo de " + numero + " es " + modulo );


        System.out.println("Módulo en Programación Declarativa: ");
        System.out.println( "El módulo de " + numero + " es " + modulo(numero) );


    }

    public static int modulo (int numero){
        return numero % 2;
    }

}
