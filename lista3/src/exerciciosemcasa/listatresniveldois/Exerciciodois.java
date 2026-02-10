package exerciciosemcasa.listatresniveldois;

import java.util.Scanner;

public class Exerciciodois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int n1,n2;
    System.out.print("Digite o primeiro número: ");
    n1 = sc.nextInt();
    System.out.print("Digite o segundo número: ");
    n2 = sc.nextInt();

    if (n1 > n2) {
        System.out.print("O número " + n1 + " é maior do que o número " + n2);
    }else{
        System.out.print("O número " + n2 + " é maior do que o número " + n1);
    }
    sc.close();
    }
}
