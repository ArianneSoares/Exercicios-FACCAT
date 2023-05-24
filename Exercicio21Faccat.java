//21)Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os

package exercicioFaccat;

import java.util.Scanner;

public class Exercicio21Faccat {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int horainicio = -1;

		int horafinal = 0;

		while ((horainicio < 0) || (horainicio > 23)) {

			System.out.println("Digite o horario de inicio da partida: ");

			horainicio = ler.nextInt();

		}

		while ((horafinal < 0) || (horafinal > 23)) {

			System.out.println("Digite o horario de encerramento da partida: ");

			horafinal = ler.nextInt();

		}

		int quantidadeDeHorasJogadas = horafinal - horainicio;

		if (quantidadeDeHorasJogadas < 0) {

			int totalHoras = quantidadeDeHorasJogadas + 24;

			System.out.println("quantidade de horas jogadas é: " + totalHoras + "Horas");

		} else if (quantidadeDeHorasJogadas == 0) {

			System.out.println("Fim do jogo! A partida chegou a 24horas");

		} else {

			System.out.println("Quantidade de horas jogadas é: " + quantidadeDeHorasJogadas + " Horas");

		}

	}

}