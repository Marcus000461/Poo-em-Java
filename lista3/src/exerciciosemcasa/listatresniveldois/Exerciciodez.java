package exerciciosemcasa.listatresniveldois;

import java.util.Scanner;

public class Exerciciodez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.print("Digite a idade do nadador: ");
        idade = sc.nextInt();
       if(idade <= 10){
        System.out.print("Categoria: Infantil");
       }

       else if  (idade>= 11 && idade <= 17) {
           System.out.print("Categoria: Juvenil");
       }
       else{
        System.out.print("Categoria: Adulto");
       }
       sc.close();
    }
}
