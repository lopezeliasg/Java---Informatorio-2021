package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Dado un String de entrada (frase, texto, etc) 
calcular la cantidad de veces que aparece una letra dada.*/

public class Ejercicio9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String deEntrada = "";
    String caracter = "";
    Integer contador = 0;
    
    System.out.print("Ingrese su texto aquí: ");
    deEntrada = sc.nextLine();
    deEntrada = deEntrada.toLowerCase();

    System.out.print("Caracter a contar: ");
    caracter = sc.nextLine();
    caracter = caracter.toLowerCase();
    sc.close();
    for (Integer i = 0; i < deEntrada.length(); i++) {
        if (deEntrada.charAt(i) == caracter.charAt(0)) {
            contador++;
        }
    }
    if (contador != 0) {
        System.out.println(caracter.charAt(0)+" : se repite ---> " + contador);
        } else {
            System.out.println("No existe caracter");
        }
    }

}
