package testArrayList;

import ejercicio1.Ejercicio1;
import ejercicio2.Ejercicio2;
import ejercicio3.Ejercicio3;
import ejercicio4.Ejercicio4;
import ejercicio5.Ejercicio5;
import ejercicio6.Ejercicio6;
import ejercicio7.Tareas;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testColecciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Creamos el objeto de scanner
        List<String> nombres = new ArrayList(); //Creamos la lista para los ejercicios 1 y 3 de basicos
        Ejercicio1 ej1 = new Ejercicio1(); //Creamos el objeto para el ejercicio 1

        int rep = 1;
        do { //Hacemos un do while para todo el programa, para hacerlo repetitivo
            System.out.println("Repasemos colecciones en java");
            System.out.println("1.-Ejercicios basicos");
            System.out.println("2.-Ejercicios intermedios");
            System.out.println("3.-Ejercicios avanzados");
            int op = sc.nextInt(); // Leemos la variable que escogio el usuario
            switch (op) { //Hacemos el switch para poder hacer la eleccion del primer menu
                case 1 -> {
                    int rep1 = 0; //Variable para poder repetir el apartado de ejercicios basicos
                    do { //Do-While para poder repetir los ejercicios basicos
                        if (!nombres.isEmpty()) { //Verificamos que la lista de los nombres no este vacia
                            System.out.println("****************************************************");
                            System.out.println("Lista de nombres, para ejercicio 1 y 3"); //Si no esta vacia, entonces mostramos la lista de nombres
                            Ejercicio1.mostraNombres(nombres); //Mostramos la lista 
                        } else {
                            System.out.println("****************************************************");
                            System.out.println("Lista de nombres para ejercicio 1 y 3 esta vacia"); //Si esta vacia entonces mostramos mensaje de que esta vacia
                        }
                        //sub menu, el cual este pertenece al ejercicio 1 de basicos
                        System.out.println("*********************************");
                        System.out.println("Ejercicios Basicos de ArrayList");
                        System.out.println("+++++++++++++++++++++++++++++++++");
                        System.out.println("1.-Agregar 5 nombres a un arrayList");
                        System.out.println("2.-Agregar 10 numeros a un arrayList e imprimir pares");
                        System.out.println("3.-Modificar un registro y eliminar el ultimo nombre de la lista"
                                + "y mostrar el nuevo contenido de la lista");
                        System.out.println("4.-Salir");
                        int op1 = sc.nextInt(); //leemos la opcion del submenu de ejercicios basicos
                        while ((op1 < 1) || (op1 > 4)) { //Validacion para que el usuario ingrese un dato correcto
                            System.out.println("Ingresaste un numero incorrecto");
                            System.out.println("Por favor ingresa un numero valido entre las opciones indicadas");
                            op1 = sc.nextInt(); //Si no ingresa un valor valido, no saldra del bucle
                        }
                        switch (op1) {
                            case 1 -> {
                                System.out.println("****************************");
                                System.out.println("Aqui agregaremos 5 nombres");
                                System.out.println("****************************");
                                if (nombres.size() > 4) { //Aqui estamos validando que la lista de nombres ya esta llena, para no agregar mas de 5 nombres
                                    System.out.println("Ya no se pueden agregar mas nombres,"
                                            + "solo estan permitidos 5, si quieres actualizar mas nombres, ve a la seccion 3");
                                    break; //Si ya esta llena la lista con 5 nombres, entonces salimos del caso 1 o ejercicio 1 y no permitimos que se llenen nombres en la lista
                                }
                                nombres = ej1.agregarNombres(nombres); //Si la lista no esta llena, entonces agregamos nombres a la lista
                                System.out.println("********************Nombres**********************");
                                Ejercicio1.mostraNombres(nombres); //Una vez llenos, los mostramos
                                System.out.println("***************Regresando al menu principal***********************");
                            }
                            case 2 -> {
                                System.out.println("********************************");
                                System.out.println("Agregar 10 numeros e imprimir numeros pares");
                                System.out.println("********************************");
                                List<Integer> numeros = new ArrayList<>(); //Creamos nuestra lista
                                Ejercicio2 ej2 = new Ejercicio2(); //Creamps nuestro objeto para poder hacer el ejercicio
                                numeros = ej2.agregarNumeros(numeros); //Actualizamos la lista numero con el metodo que estamos llamando
                                Ejercicio2.imprimirLista(numeros); //Imprimimos la lista con los numeros
                            }
                            case 3 -> {
                                //Entramos al caso 3
                                Ejercicio3 ej3 = new Ejercicio3(); //Declaramos nuestro objeto para poder usar sus metodos del ejercicio3
                                System.out.println("************************************************");
                                System.out.println("Modificar los elementos de la lista del ejercicio 1");
                                System.out.println("*************************************************");
                                if (!nombres.isEmpty()) {
                                    //Verificamos si la lista esta vacia
                                    System.out.println("¿Cual es el nombre que quieres quitar de la lista?"); //Pedimos el nombre en la lista por cambiar
                                    String viejoNombre = sc.next(); //Leemos el nombre

                                    boolean nameExist = ej3.verifyName(nombres, viejoNombre); //Creamos una variable booleana que recibe el valor de una funcion
                                    //Funcion la cual valida si el nombre se encuentra en la lista

                                    if (nameExist) { //validamos si el nombre existe en la lista
                                        System.out.println("¿Cual es el nuevo nombre por el cual quieres poner?"); //Pedimos el nuevo nombre para ponerlo en la lista
                                        String nuevoNombre = sc.next(); //Leemos ese nombre
                                        nombres = ej3.renombrar(nombres, nuevoNombre, viejoNombre); //Asignamos la lista que ya teniamos, pero en este nuevo cambio
                                    } else {
                                        System.out.println("El nombre no exite en la lista, asegurese de ingresar un nombre que este en la lista"); //Si no se encuentra el nombre en la lista, solo se manda mensaje y se sale
                                    }
                                } else {
                                    System.out.println("La lista esta vacia, primero llenela en el apartado 1 para "); //Si la lista esta vacia, entonces solo mandamos mensaje y salimos
                                }
                                //salimos del caso 3
                            }
                            case 4 -> {
                                //Salimos de los casos del ejercio 1 de basicos
                                System.out.println("*********************************************");
                                System.out.println("Adios de ejercicios basicos");
                                System.out.println("*********************************************");
                                rep1 = 1;
                            }
                        }
                    } while (rep1 == 0); //condicion para validar si se repite este apartado de ejercicios basicos
                    break; //Si el usuario quiere salir de ejercicios basicos, entrara el brake y saldra del caso 1
                }
                case 2 -> {
                    int rep2 = 1;
                    do {
                        //sub menu, el cual este pertenece al ejercicio 2 de INTERMEDIOS
                        System.out.println("*********************************");
                        System.out.println("2.-Ejercicios Intermedios de ArrayList");
                        System.out.println("+++++++++++++++++++++++++++++++++");
                        System.out.println("1.-Suma de todos los numeros");
                        System.out.println("2.-Buscar un elemento");
                        System.out.println("3.-Eliminar todos los impares");
                        System.out.println("4.-Salir");
                        int op2 = sc.nextInt(); //Leemos la variable del menu de ejercicios intermedios
                        while ((op2 < 0) && (op2 > 5)) {
                            System.out.println("por favor ingrese un numero dentro de lo pedido");
                            op2 = sc.nextInt();
                        }
                        switch (op2) {
                            case 1 -> {
                                List<Integer> numeros = new ArrayList<>(); //Creamos el array list que ocuparemos en este ejercicio
                                Ejercicio4 ej4 = new Ejercicio4();
                                System.out.println("****************************Ejercicio 1:*********************");
                                System.out.println("-Llena un ArrayList<Integer> con números enteros.");
                                System.out.println("-Suma todos los elementos.");
                                System.out.println("-Muestra el resultado.");
                                int suma = ej4.llenarLista(numeros); //Le pasamos el valor a la variable suma, de lo que nos da el metodo llenar lista
                                System.out.println("El resultado es: " + suma); //imprimimos valor 
                                break;//Salimos del caso 1, de ejercicios intermedios
                            }
                            case 2 -> {
                                List<String> nombres2 = new ArrayList<>();
                                Ejercicio5 ej5 = new Ejercicio5();
                                System.out.println("****************************Ejercicio 2:*********************");
                                System.out.println("-Llena un ArrayList<String> con 6 nombres ");
                                System.out.println("-Pregunta al usuario (por consola) un nombre.");
                                System.out.println("-Verifica si existe en el ArrayList.");
                                System.out.println("-Muestra un mensaje si lo encontró o no.");
                                System.out.println("**************************************************************");
                                System.out.println("Vamos a llenar una lista con 6 nombres");
                                nombres2 = ej5.llenarListaNombres(nombres2); //Vamos a llenar la lista con lo que nos retorne el metodo
                                if (!nombres2.isEmpty()) { //Verificamos si la lista no esta vacia
                                    //Si no esta vacia entonces hacemos lo siguiente:
                                    Ejercicio5.mostrarLista(nombres2); //Mostramos el contenido de la lista
                                    System.out.println("Cual es el nombre que buscas en la lista?"); //Preguntamos por el nombre
                                    String nombre = sc.next(); //Leemos el nombre
                                    boolean existeNombre = ej5.buscarNombre(nombres2, nombre); //verificamos si esta en la lista y guardamos el resultado en esta variable
                                    System.out.println(existeNombre);
                                    if (existeNombre) { //Si existe el nombre
                                        System.out.println("El nombre: " + nombre + " si esta en la lista"); //Entonces decimos que si esta
                                    } else {
                                        System.out.println("El nombre: " + nombre + " no esta en la lista"); //Si no, entonces decimos que no esta
                                    }
                                }
                                //Si la lista esta vacia entonces salimos del caso
                                break;

                            }
                            case 3 -> {
                                Ejercicio6 ej6 = new Ejercicio6(); //Creamos el objeto para poder usar sus metodos
                                List<Integer> numeros6 = new ArrayList<>(); //Creamos una arraylist, en el cual la llenaremos para el ejercicio
                                System.out.println("****************************Ejercicio 3:*********************");
                                System.out.println("-Llena una lista con los números del 1 al 20.");
                                System.out.println("-Elimina todos los números impares");
                                System.out.println("-Imprime el resultado..");
                                System.out.println("**************************************************************");
                                System.out.println("Vamos a llenar una lista con 20 numeros.");
                                numeros6 = ej6.llenarLista(numeros6); //Llenamos la lista con el metodo 
                                if (!numeros6.isEmpty()) { //Verificamos que no este vacia la lista
                                    //Si no esta vacia, entonces
                                    System.out.println("--------------------Contenido de la lista--------------------------");
                                    Ejercicio6.mostrarLista(numeros6);//Imprimimos su contenido
                                    numeros6 = ej6.eliminarImpares(numeros6);//Llenamos la lista con todos los numeros impares
                                    System.out.println("--------------------Contenido de la lista con solo pares--------------------------");
                                    Ejercicio6.mostrarLista(numeros6);//Imprimimos su nuevo contenido
                                }
                                break;//Salimos del caso 3
                            }
                            case 4 -> {
                                System.out.println("******************* Adios *************************");
                                rep2 = 0; //Lo convertimos en 0, para que en la condicion del do while, haga que se salga
                                break;
                            }

                        }
                    } while (rep2 == 1);
                    break;//Breake del caso de 2 de intermedios
                }
                case 3 -> {
                    Tareas tarea; //Creamos nuestro objeto para poder usar sus metodos
                    List<Tareas> listaTareas = new ArrayList<>(); //Creamos nuestra lista para poder meter tareas
                    int rep3 = 0; //Variable para poder ciclar el caso 3 de ejercicios avanzados
                    do {
                        System.out.println("*******************************************");
                        System.out.println("Ejercicios avanzados de arraylist");
                        System.out.println("*******************************************");
                        System.out.println("En este ejercicio haremos otro submenu: ");
                        System.out.println("1.-Agregar una tarea");
                        System.out.println("2.-Ver tareas");
                        System.out.println("3.-Eliminar tareas por indice");
                        System.out.println("4.-Salir");
                        int op3 = sc.nextInt();
                        switch (op3) {
                            case 1:
                                System.out.println("**********Agregar tarea**********");
                                System.out.println("¿Que tarea quieres agregar?");
                                String tar = sc.next();
                                tarea = new Tareas(tar);
                                tarea.agregarTarea(listaTareas, tarea);
                                
                                break;
                            case 2:
                                System.out.println("********Ver tareas***************");
                                Tareas.mostrarTareas(listaTareas);
                                break;
                            case 3:
                                System.out.println("*********Eliminar tarea por indice**********");
                                break;
                            case 4:
                                System.out.println("********************Salir*******************");
                                rep3 = 1;
                                break;
                            default:
                                System.out.println("Creo que escogiste otra opcion");
                        }
                    } while (rep3 == 0);
                    break;
                }
                case 4 -> {
                    System.out.println("*********************************************************");
                    System.out.println("*********************Salir*******************************");
                    break;
                }
            }
            System.out.println("Quieres repetir todo el programa?, presiona 1 si, presiona 0 no");
            rep = sc.nextInt();
        } while (rep == 1);
    }
}
