/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refuerzo.programación.sena.logica;

/**
 *
 * @author David Cruz
 */
public class OperacionesBasicas {
    
   double resultado; //Variable global de tipo double, la cual ira almacenando los diferentes resultados de las operaciones

    /*Método que permite sumar dos números double, este recibe
      como parámetros numero1 y numero2.
    */
    public double sumar(double numero1, double numero2) {
        resultado = numero1 + numero2;
        return resultado;
    }

    public double restar(double numero1, double numero2) {
        resultado = numero1 - numero2;
        return resultado;
    }

    public double multiplicar(double numero1, double numero2) {
        resultado = numero1 * numero2;
        return resultado;
    }

    public double dividir(double numero1, double numero2) {
        resultado = numero1 / numero2;
        return resultado;
    }
}
