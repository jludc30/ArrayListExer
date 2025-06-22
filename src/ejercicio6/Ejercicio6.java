package ejercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio6 {

    Scanner sc = new Scanner(System.in);

    //Metodo para poder llenar una lista con 20 numeros
    public List<Integer> llenarLista(List<Integer> numeros) {
        //Recorremos la lista con un for, que tiene como limite 20 veces para iterarse
        for (int i = 0; i < 20; i++) {
            System.out.println((i + 1) + ".-Ingresa un numero: "); //Preguntamos al usuario por un numero
            numeros.add(sc.nextInt()); //Leemos y agregamos a la lista
        }

        return numeros; //Retornamos la lista
    }
    
    //Metodo para poder quitar numeros impares
    public List<Integer> eliminarImpares(List<Integer> numeros) {
        List<Integer> pares = new ArrayList<>(); //Creamos una nueva lista donde estaran los valores, pero de los valores pares
        for (Integer numero : numeros) { //Recorremos toda ls lista de numeros, la original
            if ((numero % 2) == 0) { //Si el numero es diferente de 0 en su modulo, o sea impar
                pares.add(numero);
            }
        }
        return pares; //Retornamos la nueva lista con solo pares, para que se sobre escriba la lista original
    }
    
    //Metodo para mostrar el contenido de la lista
    public static void mostrarLista(List<Integer> numeros){
        int i = 1;
        for(Integer numero : numeros){
            System.out.println(i+".-"+numero);
            i++;
        }
    }
}
