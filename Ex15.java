
package listai;
import java.util.Scanner;
// media e notas
public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

for (int aluno = 1; aluno <= 10; aluno++) {

    int soma = 0;

    for (int nota = 1; nota <= 4; nota++) {
        System.out.println("Digite uma nota:");
        int valor = sc.nextInt();
        soma = soma + valor;
    }

    double media = soma / 4.0;
    System.out.println("Média: " + media);
}
    }
}