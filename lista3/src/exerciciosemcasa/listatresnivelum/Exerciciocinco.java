package exerciciosemcasa; 
//Descrição: Peça o preço original de um produto e a porcentagem
//de desconto. Calcule e mostre o preço final após o desconto.
//o Exemplo de Entrada/Saída:
//Digite o preço original do produto: 100
//Digite a porcentagem de desconto: 15
//O preço com desconto é: 85.0
import java.util.Scanner;

public class Exerciciocinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco,porcentagem,desconto;
        System.out.println("Digite o preço sem desconto: ");
        preco = sc.nextDouble();
        System.out.println("Me informe o desconto do produto: ");
        porcentagem = sc.nextDouble();
        porcentagem = (porcentagem/100) * preco;
        desconto = preco - porcentagem;
        System.out.println("Qual foi o valor do produto com desconto: " + desconto);
        sc.close();
    }
}
