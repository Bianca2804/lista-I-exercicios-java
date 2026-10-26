package listai;
import java.util.Scanner;
//media de idades
public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma=0;

for (int idade = 1; idade <= 30; idade++) {
    System.out.println("Digite a idade:");
        int value= sc.nextInt();
         soma = soma + value;
}
     double media= soma/30.0;
     System.out.println("A media das idaddes é:"+ media);







    } // main
} //public class
