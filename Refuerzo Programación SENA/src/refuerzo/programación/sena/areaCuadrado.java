package refuerzo.programación.sena;

import java.util.Scanner;

public class areaCuadrado {

    public static void main(String[] args) {
                     
        double lado, area;     
        Scanner obj = new Scanner(System.in);
         
        System.out.print("Ingrese Lado:\t");
        lado = obj.nextDouble();         
         
        area = lado * lado;
         
        System.out.print("El area del Cuadrado es:\t"+area);
        
        
    }

}
