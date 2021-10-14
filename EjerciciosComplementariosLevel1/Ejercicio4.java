package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías.*/

public class Ejercicio4 {
    public static void main(String[] args) {
        Integer numero;
        int factorial = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();
        sc.close();
        for (Integer i=1; i<=numero; i++) {
            factorial *=i;
        }
        System.out.println("Factorial de " + numero + ": " + factorial);

    }
}
