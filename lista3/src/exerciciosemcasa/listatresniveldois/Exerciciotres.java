package exerciciosemcasa.listatresniveldois;

import java.util.Scanner;

public class Exerciciotres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Digite o segundo número:");
        n2 = sc.nextInt();
        System.out.print("Digite o terceiro número: ");
        n3 = sc.nextInt();
        if (n1 > n2 && n1 > 3) {
            System.out.print("O maior numero é: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.print("O maior numero é: " + n2);
        } else {
            System.out.print("O maior numero é: " + n3);
            sc.close();

        }

    }
}
