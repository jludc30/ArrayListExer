package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    
        public ArrayList<Integer> agregarNumeros(ArrayList<Integer> numeros) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("**********************Agregando numeros**********************");
        int i = 1;
        while (i <= 10) {
            System.out.println(i+".-Agrega un numero: ");
            int numero = sc2.nextInt();
            numeros.add(numero);
            i++;
        }
        return devolverPares(numeros);
    }
    
    public ArrayList devolverPares(ArrayList<Integer> numeros){
        System.out.println(numeros.size());
        
        for(int i = numeros.size()-1; i >= 0; i--){
            if(numeros.get(i)%2 != 0){
                numeros.remove(i);
            }            
        }
        return numeros;
    }
}
