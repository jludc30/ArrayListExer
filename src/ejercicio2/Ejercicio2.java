package ejercicio2;

import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {

    public List<Integer> agregarNumeros(List<Integer> numeros) { //Metodo para poder agregar numeros a la lista
        Scanner sc2 = new Scanner(System.in); //Para leer las entradas del usuario
        System.out.println("**********************Agregando numeros**********************");
        int i = 1; //Variable solo para iterar las entradas de numeros
        while (i <= 10) { //Ciclo para poder llenar la lista
            System.out.println(i + ".-Agrega un numero: ");
            //int numero = sc2.nextInt();
            numeros.add(sc2.nextInt()); //leemos la entrada y la agregamos a la lista
            i++;
        }
        return devolverPares(numeros); //Una vez llenada la lista, mandamos llamar devolverPares para que devolvamos lo que nos devuelve 
    }

    //Metodo que nos ayuda a solo mostrar los pares
    public List<Integer> devolverPares(List<Integer> numeros) {

        for (int i = numeros.size() - 1; i >= 0; i--) { //Recorremos todo el array
            if ((numeros.get(i) % 2) != 0) { //Pero si el elemento del array en su modulo es diferente de cero
                numeros.remove(i); //Entonces lo quitamos de la lista
            }
        }
        return numeros; //Al final regresamor la lista entera
    }

    //Metodo para poder imprimir la lista
    public static void imprimirLista(List<Integer> numeros) { //Lo declaramos static, para poder acceder a el sin crear un objeto
        System.out.println("Los numeros de la lista, son los siguientes: ");
        int counter = 1;
        for (Integer num : numeros) {
            System.out.println(counter + ".-" + num);
            counter++;
        }
    }
}
