package testArrayList;

import ejercicio1.Ejercicio1;
import ejercicio2.Ejercicio2;
import ejercicio3.Ejercicio3;
import java.util.ArrayList;
import java.util.Scanner;

public class testColecciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList();
        Ejercicio1 ej1 = new Ejercicio1();
        int op;
        //las listas guardan en orden los objetos que se le van agregando
        System.out.println("Repasemos colecciones en java");
        System.out.println("1.-Ejercicios basicos");
        System.out.println("2.-Ejercicios intermedios");
        System.out.println("3.-Ejercicios avanzados");
        op = sc.nextInt();
        switch (op) {
            case 1 -> {
                int rep1 = 0; //Variable para poder repetir el apartado de ejercicios basicos
                do {
                    if (!nombres.isEmpty()) { //Verificamos que la lista de los nombres no este vacia
                        System.out.println("****************************************************");
                        System.out.println("Lista de nombres, para ejercicio 1 y 3"); //Si no esta vacia, entonces mostramos la lista de nombres
                        ej1.mostraNombres(nombres); //Mostramos la lista 
                    } else {
                        System.out.println("****************************************************");
                        System.out.println("Lista de nombres para ejercicio 1 y 3 esta vacia"); //Si esta vacia entonces mostramos mensaje de que esta vacia
                    }

                    int op1;
                    System.out.println("*********************************");
                    System.out.println("Ejercicios Basicos de ArrayList");
                    System.out.println("+++++++++++++++++++++++++++++++++");
                    System.out.println("1.-Agregar 5 nombres a un arrayList");
                    System.out.println("2.-Agregar 10 numeros a un arrayList e imprimir pares");
                    System.out.println("3.-Modificar un registro y eliminar el ultimo nombre de la lista"
                            + "y mostrar el nuevo contenido de la lista");
                    System.out.println("4.-Salir");
                    op1 = sc.nextInt();
                    while ((op1 < 1) || (op1 > 4)) { //Validacion para que el usuario ingrese un dato correcto
                        System.out.println("Ingresaste un numero incorrecto");
                        System.out.println("Por favor ingresa un numero valido entre las opciones indicadas");
                        op1 = sc.nextInt();
                    }
                    switch (op1) {
                        case 1:
                            System.out.println("****************************");
                            System.out.println("Aqui agregaremos 5 nombres");
                            System.out.println("****************************");
                            if(nombres.size() > 4 ){
                                System.out.println("Ya no se pueden agregar mas nombres,"
                                        + "solo estan permitidos 5, si quieres actualizar mas nombres, ve a la seccion 3");
                                break;
                            }
                            nombres = ej1.agregarNombres(nombres);
                            System.out.println("********************Nombres**********************");
                            ej1.mostraNombres(nombres);
                            System.out.println("***************Regresando al menu principal***********************");
                            break;
                        case 2:
                            System.out.println("********************************");
                            System.out.println("Agregar 10 numeros e imprimir numeros pares");
                            System.out.println("********************************");
                            ArrayList<Integer> numeros = new ArrayList<>();
                            Ejercicio2 ej2 = new Ejercicio2();
                            numeros = ej2.agregarNumeros(numeros);
                            for (int i : numeros) {
                                System.out.print(i + ", ");
                            }
                            break;
                        case 3:
                            //Entramos al caso 3
                            Ejercicio3 ej3 = new Ejercicio3(); //Declaramos nuestro objeto para poder usar sus metodos del ejercicio3
   
                            System.out.println("************************************************");
                            System.out.println("Modificar los elementos de la lista del ejercicio 1");
                            System.out.println("*************************************************");

                            if (!nombres.isEmpty()) { //Verificamos si la lista esta vacia
                                System.out.println("¿Cual es el nombre que quieres quitar de la lista?"); //Pedimos el nombre en la lista por cambiar
                                String viejoNombre = sc.next(); //Leemos el nombre
                                
                                boolean nameExist = ej3.verifyName(nombres, viejoNombre); //Creamos una variable booleana que recibe el valor de una funcion
                                                                                          //Funcion la cual valida si el nombre se encuentra en la lista
                                
                                if (nameExist) { //validamos si el nombre existe en la lista
                                    System.out.println("¿Cual es el nuevo nombre por el cual quieres poner?"); //Pedimos el nuevo nombre para ponerlo en la lista
                                    String nuevoNombre = sc.next(); //Leemos ese nombre
                                    nombres = ej3.renombrar(nombres, nuevoNombre, viejoNombre); //Asignamos la lista que ya teniamos, pero en este nuevo cambio
                                }else{
                                    System.out.println("El nombre no exite en la lista, asegurese de ingresar un nombre que este en la lista"); //Si no se encuentra el nombre en la lista, solo se manda mensaje y se sale
                                }
                                
                            } else {
                                System.out.println("La lista esta vacia, primero llenela en el apartado 1 para "); //Si la lista esta vacia, entonces solo mandamos mensaje y salimos
                            }
                            break; //salimos del caso 3
                        case 4:
                            System.out.println("*********************************************");
                            System.out.println("Adios de ejercicios basicos");
                            System.out.println("*********************************************");
                            rep1 = 1;
                            break;
                    }
                } while (rep1 == 0); //condicion para validar si se repite este apartado
                break;
            }
            case 2 -> {
                System.out.println("*******************************************");
                System.out.println("Ejercicios intermedios");
                System.out.println("*******************************************");
                break;
            }
            case 3 -> {
                System.out.println("*******************************************");
                System.out.println("Ejercicios Avanzados");
                System.out.println("*******************************************");
                break;
            }
            default -> {
            }
        }

    }
}
