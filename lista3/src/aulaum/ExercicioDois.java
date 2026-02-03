package aulaum;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double c,f;
       System.out.println("Digite a temperatura em Celsuius");
       c = sc.nextDouble();
       f = (c* 9/5) + 32;
       System.out.println("A temperatura em Fahreheit é: " + f);
       sc.close();
    }
}
