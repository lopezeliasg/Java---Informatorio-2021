package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Solicitar por consola el nombre del usuario 
e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”*/ 

public class Ejercicio1 {
    public static void main(String[] args) {
        String usuarioNombre;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre o nombre de usuario: ");
        usuarioNombre = sc.nextLine();
        sc.close();
        System.out.println("HOLA " + usuarioNombre + " !!!");
    }
}


