package exerciciosemcasa.listatresniveldois;

import java.util.Scanner;

public class Exerciciosete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano;
        System.out.print("Digite um ano: ");
        ano = sc.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0) {
            System.out.println("O ano : " + ano + "é bissexto");

        } else {
            System.out.println("O ano: " +  ano  + " Não é bissexto");

        }

        sc.close();
    }
}
