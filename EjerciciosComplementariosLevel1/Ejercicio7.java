package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Realizar un programa que dado un String de entrada 
en minúsculas lo convierta por completo a mayúsculas. 
Sin uso de métodos o librerías que realicen toUppercase().*/

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textoUsuario;

        System.out.print("Ingrese texto aquí: ");
        textoUsuario = sc.nextLine();
        sc.close();
        char[] letraTexto = textoUsuario.toCharArray();

        for (char i: letraTexto) {
            int valor = (int) i;
            if (valor >= 97 && valor <122) {
                valor = valor-32;
                System.out.print((char) valor);
            } else {
                System.out.print((char) valor);
            }
        }
    }
}