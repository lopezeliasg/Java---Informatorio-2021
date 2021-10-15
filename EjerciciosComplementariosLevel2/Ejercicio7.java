package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Scanner;

/*Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), 
nos devuelva un array de Strings. Con la secuencia de números enteros de principio a final. 
Pero si el número es multiplo de 2 colocara el valor “Fizz”, si es múltiplo de 3 “Buzz” 
y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
Observacion: Los 2 argumentos indican con que valor se arranca a calcular 
y el segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 */
public class Ejercicio7 {
    public static void main(String[] args) {
        ArrayList secuenciaFizzBuzz = new ArrayList<>();
        Integer numeroUno, numeroDos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número siendo este menor al segundo: ");
        numeroUno = sc.nextInt();

        System.out.print("Ingrese el segundo número tal que sea mayor al primero: ");
        numeroDos = sc.nextInt();

        for (int i = numeroUno; i < numeroDos ; i++) {
            if (numeroUno % 2 == 0 && numeroUno % 3 == 0) {
                secuenciaFizzBuzz.add(i + " FizzBuzz");
            } else if (numeroUno % 3 == 0) {
               secuenciaFizzBuzz.add(i + " Buzz");
            } else if (numeroUno % 2 == 0) {
                secuenciaFizzBuzz.add(i + " Fizz");
            } else {
                System.out.println("No hay caso...");
            }
            for (int j = 0; j < secuenciaFizzBuzz.size(); j++) {
                System.out.println(secuenciaFizzBuzz.get(j));
            }
        }
    }
}
