package aps;


import java.util.Scanner;

public class Exerc04MediaAluno {
	// DISCIPLINA TÉCNICA DE PROGRAMAÇÃO
	// PROFESSOR: RENAN ALENCAR
	// ALUNO: GUILHERME NERY
	// ALUNO: GUSTAVO BATISTA
	// ALUNO: JAILTON SANTANA
	// ALUNO: JOSE AUGUSTO NETO
	
	//EXERC04: MÉDIA ALUNO

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ENTRADA DOS DADOS
		System.out.println("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();

		System.out.println("Agora a segunda nota: ");
		double nota2 = scan.nextDouble();

		// CALCULANDO A MÉDIA
		double media = (nota1 + nota2) / 2;

		System.out.println("As notas do aluno são: " + nota1 + " e " + nota2);
		System.out.println("A média é: " + media);

		// CONDICIONAL
		if (media >= 9.0 && media <= 10) {
			System.out.println("Conceito A. Aluno aprovado!");

		} else if (media >= 7.5 && media <= 9.0) {
			System.out.println("Conceito B. Aluno aprovado!");

		} else if (media >= 6.0 && media <= 7.5) {
			System.out.println("Conceito C. Aluno aprovado!");

		} else if (media >= 4.0 && media <= 6.0) {
			System.out.println("Conceito D. Aluno reprovado!");

		} else if (media < 4.0) {
			System.out.println("Conceito E. Aluno reprovado!");

		} else {
			System.out.println("Nota não calculada");

		}

	}

}
