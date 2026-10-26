package listai;
import java.util.Scanner;
//tabuada apresentando o reseltado mais completo
public class Ex14 {
    public static void main(String[] args) {
  
 Scanner sc = new Scanner(System.in);

System.out.println("Digite um número:");
int valor = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(valor * i);
}


    }
}