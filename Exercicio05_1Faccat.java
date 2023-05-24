/*5) Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu sucecessor. */
package exercicioFaccat;

import java.util.Scanner;

public class Exercicio05_1Faccat {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.println("Digite um valor: ");
			int valor = sc.nextInt();
			int resultado = valor + 1;
			System.out.println("O numero antecessor do digitado é: " + resultado);
			sc.close();

		} catch (Exception e) {
			System.out.println("Favor digitar um numero correto " + e);

		}

	}

}
