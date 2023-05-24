//8) Escreva  um  algoritmo  para  ler  o  número  total  de  eleitores  de um  município,  o  número  de  votos brancos, nulos e válidos. 
//Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. 

package exercicioFaccat;

import java.util.Scanner;

public class Exercicio08Faccat {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade total de eleitores de um municipio: ");
		int eleitores = sc.nextInt();

		System.out.println("Digite a quantidade total de eleitores que votaram em branco: ");
		int votosBranco = sc.nextInt();

		System.out.println("Digite a quantidade total de eleitores de que votaram nulo: ");
		int votosNulo = sc.nextInt();

		System.out.println("Digite a quantidade total de eleitores que votaram válitos: ");
		int votosValidos = sc.nextInt();

		double percentualVotosBranco = votosBranco * 100 / eleitores;
		double percentualVotosNulo = votosNulo * 100 / eleitores;
		double percentualVotosValidos = votosValidos * 100 / eleitores;

		final int porcentagemvalorTotal = 100;

		System.out.println("A porcentagem correspondente aos votos brancos é: " + percentualVotosBranco);
		System.out.println("A porcentagem correspondente aos votos Nulo é:: " + percentualVotosNulo);
		System.out.println("A porcentagem correspondente aos votos validos é:: " + percentualVotosValidos);
		System.out.println(
				"A porcentagem correspondente a todos os eleitores corresponde a: " + porcentagemvalorTotal + "%");

	}

}
