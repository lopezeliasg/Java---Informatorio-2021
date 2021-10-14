package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Realizar un programa que solicite por consola 2 números enteros. 
Para luego imprimir el resultado de la suma, resta, multiplicación, división 
y módulo (resto de la división) de ambos números.*/

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a, b, resultadoSuma, resultadoResta, resultadoMultiplicacion, resultadoDivision, resultadoModulo;

        System.out.println("Dado 2 numeros enteros se imprimira el resultado de la Suma - Resta - Multipplicación - División y Módulo de ambos números.");

        System.out.print("Dame un número: ");
        a = sc.nextInt();
        System.out.print("Ahora otro número: ");
        b = sc.nextInt();

        sc.close();

        resultadoSuma = a + b;
        resultadoResta = a - b;
        resultadoMultiplicacion = a*b;
        resultadoDivision = a / b;
        resultadoModulo = a % b;
    
        System.out.println("Resultado de la Suma: " + resultadoSuma);
        System.out.println("Resultado de la Resta: " + resultadoResta);
        System.out.println("Resultado de la Multiplicación: " + resultadoMultiplicacion);
        System.out.println("Resultado de la División: " + resultadoDivision);
        System.out.println("Resultado del Módulo: " + resultadoModulo);
    }
}

