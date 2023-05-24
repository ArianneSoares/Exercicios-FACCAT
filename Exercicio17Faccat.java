//18)  Ler  o  ano  atual  e  o  ano  de  nascimento  de  uma  pessoa.  Escrever  uma mensagem  que
//diga  se  ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu). 

package exercicioFaccat;

import java.util.Scanner;

public class Exercicio17Faccat {

	public static void main(String[] args) {

		try {

			Scanner sc = new Scanner(System.in);

			System.out.println("Digite a 1º nota: ");
			float nota1 = sc.nextInt();

			System.out.println("Digite a 2º nota: ");
			float nota2 = sc.nextInt();
			float media = (nota1 + nota2) / 2;

			if ((media < 0) || (media > 1)) {
				System.out.println("O programa aceita somente números entre 0 e 10, inclusive");
			} else if (media >= 6) {
				System.out.println("Aluno(a) aprovado(a) com sucesso. Sua média foi: " + media);
			} else {
				System.out.println("Aluno(a) reprovado(a). Sua média foi: " + media);
			}
			sc.close();
		} catch (Exception e) {
			System.out.println(
					"Caro amigo(a), não sei se percebeu, mas não aceitamos caracteres para efetuar operações matematicas");
		}
	}
}
