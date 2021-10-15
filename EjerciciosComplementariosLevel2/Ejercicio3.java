package EjerciciosComplementariosLevel2;
/*Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa 
(solo los valores, no figuras). Se deberá cargar el ArrayList (en orden), imprimir, 
imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList numsCartas = new ArrayList();
        
        numsCartas.add("As");
        numsCartas.add("2");
        numsCartas.add("3");
        numsCartas.add("4");
        numsCartas.add("5");
        numsCartas.add("6");
        numsCartas.add("7");
        numsCartas.add("8");
        numsCartas.add("9");
        numsCartas.add("10");
        numsCartas.add("J");
        numsCartas.add("Q");
        numsCartas.add("K");

        System.out.print("||| Ordenado |||");
        
        for (Integer c = 0; c < numsCartas.size(); c++) {
            System.out.print(" - " + numsCartas.get(c));
        }
        System.out.println("");

        Collections.reverse(numsCartas);
        System.out.print("||| Reverso  |||");

        for (Integer r = 0; r < numsCartas.size(); r++) {
            System.out.print(" - " + numsCartas.get(r));
        }
        System.out.println("");

        Collections.shuffle(numsCartas);
        System.out.print("||| Mezclado |||");

        for (Integer s = 0; s < numsCartas.size(); s++) {
            System.out.print(" - " + numsCartas.get(s));
        }
        System.out.println("");

    }    
}