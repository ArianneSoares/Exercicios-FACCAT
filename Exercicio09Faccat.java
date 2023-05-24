//) Escreva um algoritmo para ler o salário mensal atual de um funcionário 
//e o percentual de reajuste. Calcular e escrever o valor do novo salário. 

package exercicioFaccat;

import java.util.Scanner;

public class Exercicio09Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu salario atual: ");
		float salario = sc.nextFloat();
		System.out.println("Digite o valor da porcentagem de reajuste: ");
		float reajuste = sc.nextFloat();

		float valorRealDoReajuste = reajuste * salario / 100;
		float salarioFinal = salario + valorRealDoReajuste;

		System.out.printf("O novo salario com reajuste é: R$ %f", salarioFinal);

	}

}
