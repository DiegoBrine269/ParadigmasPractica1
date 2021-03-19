package practica1;
import java.lang.Math;
import java.util.List; //Biblioteca para primer y segundo ejercicio

//"java.util.List, represents an ordered sequence of objects. 
//The elements contained in a Java List can be inserted, accessed,
//iterated and removed according to the order in which they 
//apear internally in the Java List. The ordering of the elements 
//is why this data structure is called a List."

public class Ejercicios {
    
    public void ejercicio1 (){
        List<Integer> numeros = List.of(18,6,4,15,55,78,12,9,8);
        
        Long result = numeros.stream().filter(num -> num > 10).count();
        /*--------Stream()-------*/
        //"Toda colección tiene un método stream() 
        //que transformará dicha estructura en Stream."
        //Sintaxis:
        //[java]
        //List<String> strings = …;
        //Stream<String> streangs = strings.stream();
        //[/java]
        //
        /*--------Filter()-------*/
        //"Devuelve un Stream que contiene los datos una vez se 
        //ejecute el filtro especificado por el Lambda del 
        //predicado. Es una operación intermedia."
        //Sintaxis: Stream<T> filter(Predicate<? super T> predicate)
        //
        /*--------Count()-------*/
        //"Returns the count of elements in the stream."
        //Syntax: long count()

        System.out.println("Hay " + result + " números mayores a 10");
    }

    public void ejercicio2 (){
        List<String> colors = List.of("rojo","azul","verde","morado","naranja","amarillo");
        
        System.out.println("¿El color es rojo?: " + colors.contains("rojo"));
        /*--------Contains()-------*/
        //"The contains() method checks whether a string 
        //contains a sequence of characters. Returns true if the 
        //characters exist and false if not."
        //Syntax: public boolean contains(CharSequence char)
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
