//7) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a 
//idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias. 

package exercicioFaccat;

import java.util.Scanner;

public class Exercicio07Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a sua idade apenas em anos; ");
		int ano = sc.nextInt();

		System.out.println("Digite a quantidade de meses que passou do seu ultimo mesversário; ");
		int mes = sc.nextInt();

		System.out.println("Digite a quantidade de dias que passou do seu ultimo mêsversário; ");
		int dia = sc.nextInt();
		System.out.println();
		System.out.println();

		int diasVividos = ano * 365 + mes * 30 + dia;
		System.out.println("A quantidade de dias vividos corresponde a: " + diasVividos);

	}

}
