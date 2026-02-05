//Descrição: Solicite o raio de um círculo e calcule a área. Use a
//fórmula: Área = π × raio2. Considere π = 3.14159.
//o Exemplo de Entrada/Saída:
//Digite o raio do círculo: 3
//A área do círculo é: 28.2743
package exerciciosemcasa;

import java.util.Scanner;

public class Exerciciotres {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi;
        double raio = 0;
        double area;

        System.out.println("Informe o raio de um círculo: ");
        raio = sc.nextDouble();
        pi = 3.14159;
        area = pi * raio; Math.pow(raio, area);
        System.out.println("\nCalculando a área do círculo, com base no raio informado, "+ raio + ", a área equivale à: " +area);
        sc.close();
    }
}

