/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_simplemente_enlazada;


public class Lista {
    protected Nodo inicio,fin;// punteros para saber donde esta el inicio y el final
    public Lista(){
        inicio=null; // este constructor me va servir para apuntar el elemento
        fin=null;
    }
    public void agregar_Alinicio(int elemento){ // metodo para agregar elemento al inicio de la lista
        inicio=new Nodo(elemento, inicio);// creando un nodo para que se inserte otro elemnto en la lista
        if (fin==null){ // si fin esta vacia entonces vuelve al inicio 
            fin=inicio; // esto me sirve al agregar otro elemento al final del nodo se recorre al inicio y asi sucesivamnete
            
        }
        
    }
    public void MostrarListas (){// metodo para mostrar la lista enlazada
        Nodo recorrer=inicio; // esto sirve para que el elemento de la lista vaya recorriendo conforme se inserta un elemento
        System.out.println(); // esto nos sirve para dar espacio a la codificacion de la lista al imprimir 
        while (recorrer!=null){ // esta secuencia iterativa nos sirve para repetir las opciones del menu
            System.out.print("[" + recorrer.dato +"]--->");
            recorrer=recorrer.siguiente;
        }
    }
}
