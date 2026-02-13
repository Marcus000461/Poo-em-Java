package exerciciosemcasa.listatresniveldois;

import java.util.Scanner;

public class Exercicionove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "1234";
        String senhaDigitada = sc.nextLine();

        if (senhaDigitada.equals(senhaCorreta)) {
            System.out.println("Acesso permitido");

        } else {
            System.out.println("Acesso negado");
        }
        sc.close();
    }
}
