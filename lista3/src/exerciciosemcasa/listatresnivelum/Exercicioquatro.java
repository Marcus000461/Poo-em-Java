package exerciciosemcasa;
import java.util.Scanner;

//Descrição: Leia uma quantidade de dias e converta esse valor
//para o total de minutos.
//o Exemplo de Entrada/Saída:
//Digite a quantidade de dias: 2
//O total em minutos é: 2880

public class Exercicioquatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dias;
        double minutos;
        System.out.println("Informe a quantidade de dias que você quer converter: ");
        dias = sc.nextInt();
        dias = 60 * 24 * dias; 
        System.out.println("A quantidade de dias em minutos é: " + dias);
        sc.close();
    }
}
