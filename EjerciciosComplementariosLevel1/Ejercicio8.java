package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}*/

public class Ejercicio8 {        
    public static void main(String[] args) {
        String personaNombreApellido, personaEdad, personaDireccion, personaCiudad;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los siguientes datos: ");

        System.out.print("Nombre y Apellido: ");
        personaNombreApellido = sc.nextLine();
        System.out.print("Edad: ");
        personaEdad = sc.nextLine();
        System.out.print("Dirección: ");
        personaDireccion = sc.nextLine();
        System.out.print("Ciudad: ");
        personaCiudad = sc.nextLine();
        sc.close();
        System.out.println("Datos: "+personaCiudad+" - "+personaDireccion+" - "+personaEdad+" - "+personaNombreApellido);

    }
}
