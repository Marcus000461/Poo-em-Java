package exerciciosemcasa.listatresniveldois;

import java.util.Scanner;

public class Exercicioseis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado1, lado2, lado3;
        System.out.print("Digite o comprimento do lado 1:");
        lado1 = sc.nextDouble();
        System.out.print("Digite o comprimento do lado 2:");
        lado2 = sc.nextDouble();
        System.out.print("Digite o comprimento do lado 3:");
        lado3 = sc.nextDouble();
        if (lado1 == lado2 && lado2 == lado3) {
            System.out.print("O triângulo é equilátero");

        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.print("O triangulo é Isósceles");

        } else {
            System.out.print("O triângulo é Escaleno.");
        }
        sc.close();
    }

}
