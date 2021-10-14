package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Confeccionar un programa que dado un número entero 
como dato de entrada imprima la secuencia de números 
(incrementos de 1) */

public class Ejercicio3 {
    public static void main(String[] args){
        Integer i, j, n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dado un número n imprimirá la secuencia: ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    } 
}