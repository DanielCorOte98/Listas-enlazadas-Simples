package edu.utim.ticsi4b;

/**
 * Created by Ulises on 23/10/2017.
 */
public class SimpleList {
    //Instancia del nodo.
   private Nodo cabeza ;

//constructor
    public SimpleList(){

    }
    //Mètodo para saver si la lista esta vacìa
   public boolean estaVacio(){
       return cabeza==null;
   }
   //mètodo para agrgar un nodo al principio de la lista.
    public void agregarAlinicio(Object valor) {
        Nodo nuevo = new Nodo(valor);
        if ( cabeza== null) {
             cabeza=nuevo;
        }else{
            nuevo.siguiente=cabeza;
            cabeza=nuevo;
        }

    }
    //Mètodo para mostrar por pantalla los valores que tiene cada nodo de la lista.
    //recorrera nodo por nodo y lo irà imprimiendo.
   public void mostrarLista(){
        Nodo recorrer = cabeza;
       while (recorrer != null) {
           System.out.print("[" + recorrer.dato + "]-->");
           recorrer = recorrer.siguiente;
       }
       System.out.println();
   }
  /* public int buscar(Object val){
           int pos=0;
           Nodo temporal = cabeza;
           while (temporal!=null && !temporal.dato.equals(val)){
               temporal=temporal.siguiente;
               pos++;
           }
           return  pos;

   }*/
  //mètodo para buscar un nodo por valor.
    //recorrerà la lista buscando coincidencia, si la encuentra imprimira el mensaje de encontrado.

    public void buscar(Object val) {
        int pos=1;
        Nodo recorrer = cabeza;
        while (recorrer != null) {
            if (val.equals( recorrer.dato)) {
                System.out.println("El elemento: " + val + " está en la posición " + pos + " de la lista");
                break;
            }
            recorrer= recorrer.siguiente;
            pos++;
        }
    }
    //mètodo para saber cuantos nodos tiene la lista.
    //Recorrerà la lista y en cada iteraciòn aumentara en uno el contador...
    public int numNodos(){
        Nodo aux ;
        int cont=0;
        aux = cabeza;
        while (aux != null){
            aux = aux.siguiente;
            cont++;
        }
        return  cont;
    }
    //Mètodo que recorrerà la lista comparando el valor del parametro, si encuentra coincidencia manda verdadero
    //sino encuentra coincidencia manda false
    public boolean IsInLista(Object valor){
        Nodo temp = cabeza;
        while (temp!=null && !temp.dato.equals(valor)){
            temp=temp.siguiente;
        }
        return  temp!=null;
    }
    public void eliminar(Object val){
       if(val.equals(cabeza.dato)){
            cabeza=cabeza.siguiente;
        }else{
            Nodo anterior,temporal;
            anterior=cabeza;
            temporal=cabeza.siguiente;
            while(temporal!=null && !temporal.dato.equals(val)){
                anterior= anterior.siguiente;
                temporal=temporal.siguiente;
            }
            if(temporal!=null){
                anterior.siguiente=temporal.siguiente;
                if(temporal==cabeza){
                    cabeza=anterior;
                }
            }
        }

    }



}
