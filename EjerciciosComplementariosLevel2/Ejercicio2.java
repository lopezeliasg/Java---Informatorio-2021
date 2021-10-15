package EjerciciosComplementariosLevel2;

/*Crear un ArrayList, agregar 5 números enteros. 
Luego, agregar un número entero al principio de la lista y otro al final. 
Por último, iterar e imprimir los elementos de la lista 
y el tamaño de la misma (antes y después de agregar a en la primera y última posición).
*/

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList listaEnteros = new ArrayList();
        ArrayList listaAgregar = new ArrayList();

        for (Integer n = 0; n < 5; n++) {
            listaEnteros.add(n);
        }
        System.out.println("Números:" + listaEnteros);
        System.out.println("Tamaño: " + listaEnteros.size());

        listaAgregar = listaEnteros;
        
        listaEnteros.add(0, 5);      
        listaEnteros.add(6);
        System.out.println("Números: " + listaAgregar);
        System.out.println("Tamaño: " + listaAgregar.size());
    }
}