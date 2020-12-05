/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_simplemente_enlazada;


public class Nodo {
    public int dato;
    public Nodo siguiente; // puntero enlace
    public Nodo(int d){ // constructor pra insertar al final 
        this.dato =d;
        
    }
    public Nodo(int d,Nodo n){ // metodo constructor para insertar al inicio
        dato=d;
        siguiente =n;
        
    }
    
    
}
