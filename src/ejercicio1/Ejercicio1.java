package ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

    public ArrayList<String> agregarNombres(ArrayList<String> nombres) {
        Scanner sc1 = new Scanner(System.in);
        String name;
        int i = 1;
        while (i < 6) {
            System.out.println(i+".-Escriba un nombre: ");
            name = sc1.next();
            nombres.add(name);
            i++;
        }
        return nombres;
    }
     public void mostraNombres(ArrayList<String> nombres) {
         int i = 1;
         for(String e : nombres){
             System.out.println(i+".-Nombre: "+e);
             i++;
         }
     }
}
