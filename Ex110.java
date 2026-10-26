package listai;
import java.util.Scanner;
//maior e menor
public class Ex110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero 1:");

        int resposta= sc.nextInt();
        int maior=resposta;
  int menor=resposta;
   for(int numero =2; numero <= 5; numero++){
 System.out.println("Digite o numero" +numero+":");
  resposta= sc.nextInt();
 
if(resposta > maior){
 maior=resposta;
}else if( resposta < menor){
 menor=resposta;
   }
}
System.out.println("Maior: " + maior);
System.out.println("Menor: " + menor);


        
    } // main
} //public class
