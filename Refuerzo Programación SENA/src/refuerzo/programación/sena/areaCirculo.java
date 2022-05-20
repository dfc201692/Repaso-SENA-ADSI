package refuerzo.programación.sena;

import java.util.Scanner;

public class areaCirculo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a, r;
        System.out.print("Introduce el radio de un círculo: ");
        r = sc.nextDouble();
        a = Math.PI * (r * r);
        System.out.println("El área de una circunferencia de radio " + r + " es: " + a);

    }

}
