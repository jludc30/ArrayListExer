package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {

    //Metodo que valida si el nombre existe en la lista
    public boolean verifyName(List<String> nombres, String viejoNombre) {
        //En este loop validaremos si se encuentra el nombre viejo
//        for (String nombre : nombres) { //Recorreremos toda la lista 
//            if(nombre.equals(viejoNombre) ){ //Como condicion debe estar el nombre que buscamos y si es igual al elemento de ese momento
//                return true; //Si esta se encuentra retornamos true
//            }
//        }
//        //Si no se encuentra, retornaremos falso
//        return false;

        //Me di cuenta que podia ahorrarme todo el codigo anterior con solo una linea de codigo, que es la siguiente
        //Que nos dice que si el nombre si esta en la lista, este nos retorna verdadero, en caso contrario, nos retorna falso.
        //Creo que lo que hice en comentarios es como funciona el metodo contains
        return nombres.contains(viejoNombre);
    }

    //Metodo que se dedica a actualizar un nombre de la lista
    public List<String> renombrar(List<String> nombres, String nuevoNombre, String viejoNombre) {

        int indice = encontrarIndice(nombres, viejoNombre); //Recibimos el indice del metodo que nos ayuda a ver cual es el indice del nombre

        nombres.set(indice, nuevoNombre); //Cambiamos el nombre de la lista

        return nombres; //Retornamos ls lista actualizados
    }

    //Metodo que nos ayuda a encontrar el indice el cual tiene el nombre que queremos cambiar
    private int encontrarIndice(List<String> nombres, String viejoNombre) {
        int index = 0; //Declaramos una variable la cual nos ayudaa almacenar el indice

        for (int i = 0; i < nombres.size(); i++) { //recorremos todo la lista
            if (nombres.get(i).equals(viejoNombre)) { //Buscamos que el nombre que queremos cambiar coincida con el nombre del indice de ese momento
                index = i; //Si lo encontramos lo almacenamos en la variable index
                break; //Y cortamos el ciclo, para evitar que siga buscando
            }
        }
        return index; //Retornamos el indice
    }
}
