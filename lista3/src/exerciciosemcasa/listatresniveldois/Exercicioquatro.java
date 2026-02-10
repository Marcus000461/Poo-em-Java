package exerciciosemcasa.listatresniveldois;

import java.util.Scanner;

public class Exercicioquatro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma, sub, mult, n1, n2, div;
        String op;

        System.out.print("\nDigite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("\nDigite o segundo número: ");
        n2 = sc.nextInt();
        System.out.print("\nDigite o operador (+, -,*, /): ");
        op = sc.next();

        if (op.equals("+")) {
            soma = n1 + n2;
            System.out.print("\nResultado entre o número " + n1 +
                    " + " + n2 + " é igual a " + soma);
        } else if (op.equals("-")) {
            sub = n1 - n2;
            System.out.print("\nResultado entre o número " + n1 +
                    " - " + n2 + " é igual a " + sub);
        } else if (op.equals("*")) {
            mult = n1 * n2;
            System.out.print("\nResultado entre o número " + n1 +
                    " * " + n2 + " é igual a " + mult);
        } else if (op.equals("/")) {
            div = n1 / n2;
            System.out.print("\nResultado entre o número " + n1 +
                    " / " + n2 + " é igual a " + div);
        }
        sc.close();
    }
}
