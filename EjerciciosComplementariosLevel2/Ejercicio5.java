package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

/*Dados 2 ArrayList que contienen horas-trabajadas (array1)
 y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. 
 Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horasTrabajadas = new ArrayList<>();
        List<Integer> valorPorHora = new ArrayList<>();
        List<Integer> listaTotales = new ArrayList<>();
        Integer sueldito;
        horasTrabajadas.add(8);
        horasTrabajadas.add(5);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(6);
        horasTrabajadas.add(2);

        System.out.println("Horas Trabajadas: " + horasTrabajadas);

        valorPorHora.add(70);
        valorPorHora.add(65);
        valorPorHora.add(60);
        valorPorHora.add(100);
        valorPorHora.add(100);
        valorPorHora.add(65);

        System.out.println("Valor por Hora: " + valorPorHora);

        for (int j = 0; j < horasTrabajadas.size(); j++) {
            int calculo = horasTrabajadas.get(j) * valorPorHora.get(j);
            listaTotales.add(calculo);
        }

        System.out.println("Totales: " + listaTotales);

        sueldito = listaTotales.get(0) + listaTotales.get(1) + listaTotales.get(2) + listaTotales.get(3)  + listaTotales.get(4) + listaTotales.get(5);
        
        System.out.println("A cobrar: U$ " + sueldito);
    }    
}

