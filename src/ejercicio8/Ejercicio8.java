package ejercicio8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio8 {

    Scanner sc = new Scanner(System.in);

    public List<String> llenarLista(List<String> palabras) {
        System.out.println("Que palabra quieres ingresar?");
        palabras.add(sc.next());
        System.out.println("Palabra agregada con exito");
        return palabras;
    }

    public static void mostrarLista(List<String> palabras) {
        int i = 0;
        for (String palabra : palabras) {
            System.out.println(i + ".-" + palabra);
            i++;
        }
        
    }

    public List<String> eliminarRepetidos(List<String> palabras) {
        List<String> sinRepetidos = new ArrayList<>();
        for (String palabra : palabras) {
            if (!sinRepetidos.contains(palabra)) {
                sinRepetidos.add(palabra);
            }
        }
        return sinRepetidos;
    }
}
