package ejercicio3;

import java.util.ArrayList;

public class Ejercicio3 {
    public ArrayList<String> renombrar(ArrayList<String> nombres, String nuevoNombre, String viejoNombre){
        //Buscaremos el nombre que queremos cambiar
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Nombres de la lista: "+nombres.get(i));
        }
//        if(nombres.contains(viejoNombre)){
//            System.out.println("El nombre: "+viejoNombre+" si existe: ");
//        }
        return nombres;
    }
}
