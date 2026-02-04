package auladois;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExercicioUmAulaDois {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(); //Instância
        Scanner sc = new Scanner(System.in); // Instância
        int qtd, min,max,valor,soma = 0; //Declaração de variaveis
        double med;//Declaração de variaveis
        System.out.print("Quantos números você vai inserir?");
        qtd = sc.nextInt();
        for(int i = 0; i <qtd;i++){
            System.out.print("Digite o número " + (i+1) + ":");
            valor = sc.nextInt();
            numeros.add(valor);
            
        }
        
        max = Collections.max(numeros);
        min = Collections.min(numeros);
        
        for (Integer j : numeros) {
            soma += j;

        }
        med = soma/qtd;
        System.out.println("\nValor máximo: " + max
                        + "\nValor mínimo : " + min
                        + "\nMédia : " + med

        );                        
    }                    
    
}
