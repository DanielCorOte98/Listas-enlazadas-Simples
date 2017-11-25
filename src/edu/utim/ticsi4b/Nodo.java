package edu.utim.ticsi4b;

/**
 * Created by Ulises on 23/10/2017.
 */
public class Nodo {
    //Declaramos la clase del nodo.

        protected Object dato;//valor
        protected Nodo siguiente;//puntero
        //Declaramos el constructor
       public Nodo(){
        }
        //Declaramos un constructor que requiere un paràmetro.
        public Nodo(Object val){
             siguiente= null;
             dato=val;
        }
        //para obtener el valor del dato
        public Object getDato(){
            return dato;
        }
        //para obtener el siguiente de un nodo
        public Nodo getSiguiente(){
            return siguiente;
        }
    }

