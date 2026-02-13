package exerciciosemcasa.listatresniveldois;

import java.util.Scanner;

public class Exerciciooito {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner (System.in);
        Double nota_final;
        System.out.print("Me informe sua nota__final :");
        nota_final = sc.nextDouble();
        if (nota_final >=6){
             System.out.print("O aluno está aprovado");
        
        
    }else{
        System.out.print("O aluno está reprovado");
    }
    sc.close();
    
    }
}
