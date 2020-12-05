/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_simplemente_enlazada;

import java.util.Scanner;

/**
 *
 * @author PC7
 */
public class Lista_simplemente_enlazada {

  
    public static void main(String[] args) {
        Lista list=new Lista();//instanciasion del objeto,lista a utilizar
        int opcion=0,elemento;
        do{//pára crear el menu 
            Scanner leer = new Scanner(System.in);
            
            System.out.println("1.-Agregar un elemento al inicio de la lista");
            System.out.println("2.Mostrar los datos de la lista");
            System.out.println("3.-salir");
            System.out.println(" ");
            System.out.println("Elige una opcion:");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println("Ingresa el elemento");
                    elemento=leer.nextInt();
                    list.agregar_Alinicio(elemento); // insertar nuevo elemento en la lista
                    
                case 2:
                    list.MostrarListas(); // imprime elemntyos de la lista
                    break;
                case 3: // fin
                    break;
                default: 
                        System.out.println("opcion incorrecta");
            }
        }while (opcion!=3); 
        
    }
    
}
