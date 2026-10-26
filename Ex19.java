package listai;
import java.util.Scanner;
// votação de filmes
public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Matrix=0; int Senhor_dos_Aneis=0;
 for(int pessoas=1; pessoas<=20; pessoas++){

    System.out.println("digite o melhor filme" +pessoas+":");
    int resposta = sc.nextInt();
 if(resposta==1){
    Matrix++;
 }else if(resposta==2){
    Senhor_dos_Aneis++;
    
 }
 System.out.println("votos de Matrix:" + Matrix + " votos do sonhor dos Aneies:" + Senhor_dos_Aneis);
 }
      System.out.println("--- RESULTADO FINAL ---");
        if (Matrix > Senhor_dos_Aneis) {
            System.out.println("O filme vencedor é: Matrix!");
        } else if (Senhor_dos_Aneis > Matrix) {
            System.out.println("O filme vencedor é: O Senhor dos Anéis!");
        } else {
            System.out.println("Houve um empate entre os filmes!");
        }



        
    } // main
} //public class
