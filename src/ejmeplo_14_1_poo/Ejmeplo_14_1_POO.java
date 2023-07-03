/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejmeplo_14_1_poo;

import java.util.Scanner;

/**
 *
 * @author USER 17
 */
public class Ejmeplo_14_1_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PRUEBA DE GITHUB
        //AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
         // TODO code application logic here
        int a, b, suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("SUMA DE DOS NUMEROS ENTEROS");
        System.out.print("Ingrese primer número: ");
        a = leer.nextInt();
        System.out.print("Ingrese primer número: ");
        b = leer.nextInt();
        suma = sumar(a,b);
        System.out.println("La suma de los números es: " + suma);
    }  // Fin del método main
    
    static int sumar(int a, int b){
        return a + b;
    } // Fin del método sumar
} // Fin de la clase del programa principal
    
    

