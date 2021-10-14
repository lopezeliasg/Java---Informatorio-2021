package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*e desea una aplicación que solicite 2 números enteros 
y realice la operación de multiplicación por sumas sucesivas 
(sin uso de librerías).*/


public class Ejercicio5 {
    public static void main(String[] args) {

     Integer numeroUno, numeroDos, multi=0;
     Scanner sc = new Scanner(System.in);
     System.out.print("Ingrese número 1: ");
     numeroUno = sc.nextInt();
     System.out.print("Ingrese número 2: ");
     numeroDos = sc.nextInt();

     sc.close();

     while (numeroDos!=0) {
       multi = multi + numeroUno;
       numeroDos = numeroDos - 1;
         }
    System.out.println("El resultado es: " + multi);
    }
}
