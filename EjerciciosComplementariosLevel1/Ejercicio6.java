package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Se desea una aplicación que solicite 2 números enteros
 y realice la operación de potencia (sin uso de librerías).*/

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer numeroBase, numeroExponente;

        System.out.print("Ingrese número BASE: ");
        numeroBase = sc.nextInt();

        System.out.print("Ingrese número EXPONENTE: ");
        numeroExponente = sc.nextInt();
        
        sc.close();

        System.out.println("Potencia = " + Potencia(numeroBase, numeroExponente));
    }

    public static Integer Potencia(Integer numeroBase, Integer numeroExponente) {
        if (numeroExponente == 0) {
            return 1;
        } else {
            return numeroBase * Potencia(numeroBase, numeroExponente - 1);
        }
    }

}
