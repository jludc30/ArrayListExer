package ejercicio7;

import java.util.List;
import java.util.Scanner;

public class Tareas {
    Scanner sc = new Scanner(System.in);
    
    private String descripcion; //Descripcion de que trata la tarea
    
    public Tareas(){
        
    }
    
    //Metodo para poder agregar tareas a la lista de tareas
    public void agregarTarea(List<Tareas> tareas, Tareas tarea){
        tareas.add(tarea); //agregamos la tarea a la lista
        System.out.println("**********Tarea agregada exitosamente**********");
    }
    
    //Eliminar tareas por indice de la lista de tareas
    public List<Tareas> eliminarTarea(List<Tareas> listaTareas, int indice){
        System.out.println("El indice pertenece a la tarea: "+listaTareas.get(indice-1).getDescripcion()); //imprimomos el ind
        System.out.println("Estas seguro que deseas eliminar esa tarea?, presiona 1 para si, presiona 0 para no");
        int opEliminar = sc.nextInt();
        while((opEliminar < 0)||(opEliminar > 1)){
            System.out.println("numero incorrecto, seleccione un numero valido");
            opEliminar = sc.nextInt();
        }
        if(opEliminar == 1){
            listaTareas.remove(indice-1); //eliminamos la tarea de la lista
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("Se cancelo eliminar");
        }
        
        return listaTareas; //Devolvemos la lista actualizada, sin el nombre
    }
    
    //Metodo que solo sirve para mostrar 
    public static void mostrarTareas(List<Tareas> tareas){
        int i = 1; //Contador que solo sirve para imprimir pantalla un orden
        System.out.println("Contenido de la lista tareas: ");
        for(Tareas e : tareas){ //Recorremos toda la lista
            System.out.println(i+".-"+e.getDescripcion()); // por cada elemento, imprimimoa l descripcion de la tarea
            i++; // incrementamos contador
        }
    }
    
    //Getter y setter de descripcion
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
}
