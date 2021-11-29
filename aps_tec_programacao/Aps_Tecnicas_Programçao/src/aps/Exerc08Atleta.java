package aps;


import java.util.Scanner;

public class Exerc08Atleta {

	// DISCIPLINA T�CNICA DE PROGRAMA��O
	// PROFESSOR: RENAN ALENCAR
	// ALUNO: GUILHERME NERY
	// ALUNO: GUSTAVO BATISTA
	// ALUNO: JAILTON SANTANA
	// ALUNO: JOS� AUGUSTO NETO

	// EXERC08: SALTO DO ATLETA

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ENTRADA DE DADOS
		System.out.println("Informe o primeiro nome do atleta: ");
		String nome = scan.next();

		System.out.println("Agora o sobrenome: ");
		String sobrenome = scan.next();

		// DECLARACAO DO VETOR
		double[] saltos = new double[6];

		for (int i = 1; i < saltos.length; i++) {

			System.out.println("Informe o " + i + "� salto:");
			saltos[i] = scan.nextDouble();
		}
		scan.close();
		System.out.println();

		double soma = 0;

		// LA�O PERCORRE O VETOR E SOMA OS SALTOS
		for (int i = 1; i < saltos.length; i++) {
			soma += saltos[i];

		}
		// EXIBI��O DOS DADOS
		System.out.println("Atleta: " + nome + " " + sobrenome);
		System.out.println();
		System.out.println("Primeiro salto: " + saltos[1] + "m");
		System.out.println("Segundo salto: " + saltos[2] + "m");
		System.out.println("Terceiro salto: " + saltos[3] + "m");
		System.out.println("Quarto salto: " + saltos[4] + "m");
		System.out.println("Quinto salto: " + saltos[5] + "m");
		System.out.println();
		System.out.println("Resultado Final:");
		System.out.println("Atleta: " + nome + " " + sobrenome);
		System.out.println();

		// LA�O PARA REMOVER O ULTIMO CARACTERE NO OUTPUT
		System.out.print("saltos: ");
		for (int i = 1; i < saltos.length; i++) {
			if (i < saltos.length - 1) {
				System.out.print(saltos[i] + " - ");
			} else {
				System.out.print(saltos[i]);
			}

		}
		System.out.println();

		System.out.println("A m�dia dos saltos: " + soma / 5 + " m");
	}

}
