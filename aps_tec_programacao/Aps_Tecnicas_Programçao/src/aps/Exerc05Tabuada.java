package aps;


import java.util.Scanner;

public class Exerc05Tabuada {
	// DISCIPLINA T�CNICA DE PROGRAMA��O
	// PROFESSOR: RENAN ALENCAR
	// ALUNO: GUILHERME NERY
	// ALUNO: GUSTAVO BATISTA
	// ALUNO: JOSE AUGUSTO NETO
	// ALUNO: JAILTON SANTANA
	
	// EXERC05: TABUADA

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// ENTRADA DE DADOS
		System.out.println("Qual a tabuada deseja visualizar? ");
		int num = scan.nextInt();

		System.out.println("Inicio da tabuada:");
		int inicio = scan.nextInt();

		System.out.println("T�rmino: ");
		int fim = scan.nextInt();

		// LA�O PARA CALCULO E EXIBI��O DA TABUADA
		System.out.println("Exibindo a tabuada de " + num);
		System.out.println();
		for (int i = inicio; i <= fim; i++) {
			System.out.println(num + " X " + i + " = " + num * i);

		}

	}

}
