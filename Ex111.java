package listai;
import java.util.Scanner;
// soma dos 100 numeros inteiros
public class Ex111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma =0;
for(int numero=1; numero<= 100; numero++){
 System.out.println("Digite o numero"+ numero+":");
 int resposta = sc.nextInt();
  soma= resposta+soma;
}//for

 System.out.println(" = " + soma);


        
    } // main
} //public class
