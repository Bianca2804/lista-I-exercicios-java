package listai;
import java.util.Scanner;
//reajuste salarial
public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    double salario_novo=0; 

   
 System.out.println("digite a qaunditadade de funcionarios");
 int funcionario= sc.nextInt();

for(int i=1; i<=funcionario; i++){
  
    System.out.println("digite o codigo do funcionario " + i + ":");
    int codigo = sc.nextInt();

   System.out.println("Digite o salário do funcionário " + i + ":");
    double salario = sc.nextDouble();
if (codigo == 1) {
    salario_novo = salario * 1.05;
} else if (codigo == 2) {
    salario_novo = salario * 1.15;
} else if (codigo == 3) {
    salario_novo = salario * 1.25;
}
else if (codigo==4)
  salario_novo = salario* 1.30;
System.out.println("O novo salario do funcionario é:"+ salario_novo);
}

 
    } // main
} //public class
