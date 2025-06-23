package ejercicio7;

import java.util.List;
import java.util.Scanner;

public class Tareas {
    Scanner sc = new Scanner(System.in);
    
    private String descripcion; //Descripcion de que trata la tarea
    
    public Tareas(String descripcion){
        this.descripcion = descripcion;
    }
    
    //Metodo para poder agregar tareas a la lista de tareas
    public void agregarTarea(List<Tareas> tareas, Tareas tarea){
        tareas.add(tarea);
        System.out.println("**********Tarea agregada exitosamente**********");
    }
    
    //Metodo que solo sirve para mostrar 
    public static void mostrarTareas(List<Tareas> tareas){
        int i = 1;
        System.out.println("Contenido de la lista tareas: ");
        for(Tareas tarea : tareas){
            System.out.println(i+".-"+tarea.descripcion);
            i++;
        }
    }
}
