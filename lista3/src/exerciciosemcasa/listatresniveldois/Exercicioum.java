package exerciciosemcasa.listatresniveldois;

import java.util.Scanner;

public class Exercicioum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Digite um numero inteiro: ");
        num = sc.nextInt();
        if (num %2 == 0 ) {
            System.out.print("\nO numero digitado, " + num + ", é par");
        }else{
            System.out.print("\nO numero digitado, "  +num + ", é impar");
            sc.close();
        }
        
    }
}
