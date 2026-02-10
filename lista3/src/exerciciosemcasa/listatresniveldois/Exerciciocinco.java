package exerciciosemcasa.listatresniveldois;

import java.util.Scanner;

public class Exerciciocinco {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int idade;
        System.out.print("Me informe sua idade: ");
        idade = sc.nextInt();
        if(idade >=18){
            System.out.print("O usuario é adulto ");

        }else{
            System.out.print("O usuario é de menor");
        }
        sc.close();
    }
}
