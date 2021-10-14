/*Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina,
 luego imprimir por pantalla el ranking
*/ 
package EjerciciosComplementariosLevel2;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String listaCiudad[] = new String[3];

        System.out.println("Ingrese su TOP#3 de Ciudades Favoritas");
        System.out.print("Ciudad #1: ");
        listaCiudad[0] = sc.nextLine();
        System.out.print("Ciudad #2: ");
        listaCiudad[1] = sc.nextLine();
        System.out.print("Ciudad #3: ");
        listaCiudad[2] = sc.nextLine();

        System.out.println("----------------");
        System.out.println("Sus ciudades son");
        System.out.println("----------------");

        System.out.println("#1 - " + listaCiudad[0]);
        System.out.println("#2 - " + listaCiudad[1]);
        System.out.println("#3 - " + listaCiudad[2]);        
    }

}
