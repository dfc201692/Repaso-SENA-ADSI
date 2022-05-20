/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refuerzo.programación.sena.principal;

import java.util.Scanner;
import refuerzo.programación.sena.logica.OperacionesBasicas;

/**
 *
 * @author David Cruz
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        OperacionesBasicas op = new OperacionesBasicas(); //Instanciamos la clase "OperacionesBasicas"
        Scanner sc = new Scanner(System.in); //Instanciamos la clase Scanner

        double num1, num2; //Variables de tipo double
        System.out.print("Ingrese numero1: "); //Pedimos un numero por teclado
        num1 = sc.nextDouble(); //Almacenamos el numero en la variable num1
        System.out.print("Ingrese numero2: "); //Pedimos un numero por teclado
        num2 = sc.nextDouble(); //Almacenamos el numero en la variable num2

        /*
         * En las siguientes lineas invocamos los diferentes métodos que
         * trae nuestro objeto "op" y mostramos el resultado por consola
         */
        System.out.println("La suma es: " + op.sumar(num1, num2));
        System.out.println("La resta es: " + op.restar(num1, num2));
        System.out.println("La multiplicacion es: " + op.multiplicar(num1, num2));
        System.out.println("La division es: " + op.dividir(num1, num2));
        
        
    }

}
