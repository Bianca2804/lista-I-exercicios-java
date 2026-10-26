package listai;
import java.util.Scanner;
//media e aprovados
public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 int aprovados = 0;
    for (int media= 1; media <= 20; media++) {
        System.out.println("Digite a media:");
        int value= sc.nextInt();

   

if (value>=6) {
    System.out.println("Aluno aprovado.");
    aprovados++;
}
else{
 System.out.println("Aluno reprovado.");

}
  }
    System.out.println("total de aprovados: " + aprovados);

   }
    }







    
