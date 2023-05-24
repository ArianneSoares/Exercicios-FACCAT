//6)  Escreva  um  algoritmo  para  ler  as  dimensões  de  um
//retângulo  (base  e  altura),  calcular  e  escrever  a área do retângulo. 

package exercicioFaccat;

import java.util.Scanner;

public class Exercicio06Faccat {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double base;

		double altura;

		double area;

		System.out.println("Digite o valor da base do retangulo: ");

		base = ler.nextInt();

		System.out.println("Digite o valor da altura do retangulo: ");

		altura = ler.nextInt();

		area = (base * altura);

		while (base == altura) {

			System.out.println("Os valores de base e altura não podem ser iguais, repita a opração novamente.");

			System.out.println("Digite o valor da base do retangulo: ");

			base = ler.nextInt();

			System.out.println("Digite o valor da altura do retangulo: ");

			altura = ler.nextInt();

			area = (base * altura);

			if (base != altura) {

				System.out.println("O valor da area do retangulo é: " + area + ".");

			}

		}

	}

}