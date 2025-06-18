package ejercicio4;

import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {

    Scanner sc = new Scanner(System.in);

    //Metodo que nos hara llenar la lista con numeros enteros
    public int llenarLista(List<Integer> numeros) {
        System.out.println("********* Aqui llenaremos la lista con numeros **********");
        System.out.println("Con cuantos numeros quieres que sea el limite para llenar esta lista?");
        int limite = sc.nextInt(); //Leemos la la respuesta del usuario
        int i = 0; //Iniciamos el indice
        while (i < limite) { //Repetimos pedir el numero, el numero de veces que se indico
            System.out.println(i + 1 + ".-Ingrese el numero");
            numeros.add(sc.nextInt()); //Lo agregamos a la lista
            i++; //incrementamos para evitar bucle infinito
        }
        return sumarLista(numeros); //retornamos lo que el metodo sumar lista nos de de valor
    }

    private int sumarLista(List<Integer> numeros) {
        int suma = 0; //Declaramos nuestro acumulador

        for (Integer num : numeros) { //Iteramos toda la lista 
            suma += num; //aqui acumulamos cada valor de la lista en el acumulador
        }
        return suma; //Retornamos todo lo sumado, que al final sera el retorno del metodo llenar lista
    }
}
