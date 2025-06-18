package ejercicio1;

import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

    public List<String> agregarNombres(List<String> nombres) {
        Scanner sc1 = new Scanner(System.in);
        //String name;
        int i = 1;
        while (i < 6) {
            System.out.println(i+".-Escriba un nombre: ");
            nombres.add(sc1.next());
            i++;
        }
        return nombres;
    }
     public static void mostraNombres(List<String> nombres) {
         int i = 1;
         for(String e : nombres){
             System.out.println(i+".-Nombre: "+e);
             i++;
         }
     }
}
