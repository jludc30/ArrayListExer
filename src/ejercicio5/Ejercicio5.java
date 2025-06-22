package ejercicio5;

import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    Scanner sc = new Scanner(System.in);
    
    //Metodo para poder llenar una lista de nombres con 6 nombres
    public List<String> llenarListaNombres(List<String> nombres){
        
        if(nombres.size() < 5){ //Preguntamos si la lista tiene mas de 6 elementos
            for (int i = 0; i < 6; i++) { //iteramos 6 veces para llenar la lista
                System.out.println((i+1)+".- Ingresa un nombre: "); //Preguntamos
                nombres.add(sc.next()); //Leemos y agregamos a la lista
            }
        }
        return nombres;
    }
    
    public boolean buscarNombre(List<String> nombres, String nombre){
        return nombres.contains(nombre);
    }
    
    //Metodo que solo imprime el contenido de la lista
    public static void mostrarLista(List<String> nombres){
        int i = 1;
        for(String nom : nombres){
            System.out.println(i+".-"+nom);
            i++;
        }
    }
}
