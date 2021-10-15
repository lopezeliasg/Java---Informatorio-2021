package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;

/*Cargar un arrayList con 12 nombres de estudiantes (String), 
luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
*/

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList listaEstudiantes = new ArrayList();

        listaEstudiantes.add("Cosme Fulanito");
        listaEstudiantes.add("Elber Galarga");
        listaEstudiantes.add("Sevelindo Parado");
        listaEstudiantes.add("Elba Surero");
        listaEstudiantes.add("Dolores Delano");
        listaEstudiantes.add("Lola Mento");
        listaEstudiantes.add("Elvis Tek");
        listaEstudiantes.add("Pere Gil");
        listaEstudiantes.add("Al-Bajad Mamad");
        listaEstudiantes.add("Elsa Pito");
        listaEstudiantes.add("Solomeo Paredes");
        listaEstudiantes.add("Lola Meraz");

        System.out.println("- Estudiantes: " + listaEstudiantes);
        System.out.println("");
        
        List<String> cursoEstudiantes1 = listaEstudiantes.subList(0, 4);
        System.out.println(" - Curso 1: " + cursoEstudiantes1);
        List<String> cursoEstudiantes2 = listaEstudiantes.subList(4, 8);
        System.out.println(" - Curso 2: " + cursoEstudiantes2);
        List<String> cursoEstudiantes3 = listaEstudiantes.subList(8, 12);
        System.out.println(" - Curso 3: " + cursoEstudiantes3);
    }
}
