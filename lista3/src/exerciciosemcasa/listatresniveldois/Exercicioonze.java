package exerciciosemcasa.listatresniveldois;

import java.util.Scanner;

public class Exercicioonze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double peso, altura, imc;
        System.out.print("Digite seu peso em kg: ");
        peso = sc.nextDouble();
        System.out.print("Digite sua altura em metros: ");
        altura = sc.nextDouble();
        imc = peso/(altura*altura);
        System.out.print("Seu imc é: " + imc);

        if (imc < 18.5) {
            System.out.print("\nClassificação: Abaixo do peso");
        }

        else if (imc >= 18.5 && imc <25 ){
            System.out.print("\nClassificação: Peso normal");

        }

        else if(imc >= 25 && imc <30){
            System.out.print("\nClassificação: Sobrepeso");
        }

        else{
            System.out.print("\nClassificação: Obesidade");
        }
        sc.close();
    }
}
