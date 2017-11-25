package edu.utim.ticsi4b;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        //declaracion de variables para el menù
        int menu,num;
        //creamos una instancia de la clase SimpleList
        SimpleList lista = new SimpleList();
        //declaramos una variable de tipo objeto, para los datos que se ingresaran.
        Object el;
        System.out.println("Listas enlazado simple.");
        //inicia ciclo do/while.
        do {
            //SE manda a imprimir el menù

            System.out.println("\n:::::::::::::Menu:::::::::::::\n" +
                    "1.Insertar\n" +
                    "2.Mostrar\n" +
                    "3.Buscar\n"+
                    "4.Eliminar\n"+
                    "5.Contar\n"+
                    "6.Terminar\n"
            );
            //Se pide un numero
            System.out.println("Del menú anterior elija la opción a realizar.");
            //se lee el numero
            menu = sc.nextInt();

            //Inicia el switch
            switch (menu) {
                case 1:
                    //se pasa el objeto al metodo para que lo agregue al inicio de la lista.
                    System.out.println("teclee el valor a insertar");
                        lista.agregarAlinicio(sc.next());
                    break;
                case 2:
                    //mètodo para verificar que la lista no este vacìa
                    if (!lista.estaVacio()) {
                        //Mètodo para mostrar el valor de cada nodo que esta en la lista.
                        lista.mostrarLista();
                    }else{
                        System.out.println("La Lista se encuentra vacía");
                    }

                    break;
                case 3:
                    if(lista.estaVacio()) {
                        System.out.println("La Lista se encuentra vacía");

                    }else {
                        System.out.println("teclee el valor a buscar");
                        el = sc.next();
                        //Mètodo para verificar si un valor esta en la lista
                        if (lista.IsInLista(el)) {
                            //si el valor esta en la lista, se llama el metodo buscar para indicar en que posiciòn esta.
                            lista.buscar(el);
                        } else {
                            System.out.println(el + " No se encuentra en la lista");
                        }
                    }
                    break;
                case 4:
                    if(lista.estaVacio()) {
                        System.out.println("La Lista se encuentra vacía");

                    }else {
                        System.out.println("teclee el valor a eliminar");
                        el = sc.next();
                        //Verifivar si el valor ingresado esta en la lista.
                        if (lista.IsInLista(el)) {
                            // si se encuentra, el nodo que tenga ese valor se eliminarà
                            lista.eliminar(el);
                            System.out.println("El elemento [" + el + "] ha sido eliminado");
                        } else {
                            System.out.println(el + " No se encuentra en la lista");
                        }
                    }

                    break;
                case 5:
                    //verificar si la lista esta vacìa
                    if(lista.estaVacio()) {
                        System.out.println("La Lista se encuentra vacía");
                    }else{
                        //sino esta vacìa imprime la cantidad de nodos que tiene la lista.
                        System.out.println("Cantidad de nodos en la lista: ["+lista.numNodos()+"]");

                    }
                    break;
                case 6:
                    //salir del proograma
                    System.out.println("Haz salido del programa");
                    break;
                default:
                    System.out.println("Opción ingresada no es  valida");
                    break;
            }
        }while(menu!=6);

    }
}
