package aps;


import java.util.Scanner;

public class Exerc07SolucaoCrime {
	// DISCIPLINA T�CNICA DE PROGRAMA��O
	// PROFESSOR: RENAN ALENCAR
	// ALUNO: GUILHERME NERY
	// ALUNO: GUSTAVO BATISTA
	// ALUNO: JAILTON SANTANA
	// ALUNO: JOSE AUGUSTO NETO
	
	
	//EXERC07: CRIME: CULPADO OU INOCENTE

	public static void main(String[] args) {

		int[] respostas = new int[5];

		Scanner scan = new Scanner(System.in);

		System.out.println("Respostas v�lidas S/N.");
		System.out.println("S ou s = Sim");
		System.out.println("N ou n = N�o");

		for (int i = 0; i < respostas.length; i++) {

			System.out.println("1� pergunta: Telefonou para a vitima? ");
			String resp1 = scan.next();

			System.out.println("2� pergunta: Esteve no local do crime?");
			String resp2 = scan.next();

			System.out.println("3� pergunta: Mora perto da vitima? ");
			String resp3 = scan.next();

			System.out.println("4� pergunta: Devia para a vitima?");
			String resp4 = scan.next();

			System.out.println("5� pergunta: J� trabalhou com a vitima?");
			String resp5 = scan.next();

			// A CADA SIM, O CONTADOR GUARDA O RESULTADO
			int contador = 0;

			// O PROGRAMA CONSIDERA COMO POSITIVO APENAS A LETRA S, s
			if (resp1.equalsIgnoreCase("S")) {
				contador++;
			}
			if (resp2.equalsIgnoreCase("S")) {
				contador++;
			}
			if (resp3.equalsIgnoreCase("S")) {
				contador++;
			}
			if (resp4.equalsIgnoreCase("S")) {
				contador++;
			}
			if (resp5.equalsIgnoreCase("S")) {
				contador++;
			}
			if (contador == 2) {
				System.out.println("Suspeita");
			} else if (contador == 3 || contador == 4) {
				System.out.println("C�mplice");

			} else if (contador == 5) {
				System.out.println("Assassino");

			} else if (contador == 0) {
				System.out.println("Inocente");
			}
			break;

		}

	}

}