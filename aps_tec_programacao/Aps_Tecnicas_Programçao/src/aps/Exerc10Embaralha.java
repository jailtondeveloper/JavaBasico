package aps;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exerc10Embaralha {
	// DISCIPLINA TÉCNICA DE PROGRAMAÇÃO
	// PROFESSOR: RENAN ALENCAR
	// ALUNO: GUILHERME NERY
	// ALUNO: GUSTAVO BATISTA
	// ALUNO: JAILTON SANTANA
	// ALUNO: JOSÉ AUGUSTO NETO

	// EXERC10: EMBARALHA PALAVRAS

	// INICIO DO MÉTODO
	public static String embaralha(String letras) {

		// PERCORRENDO A LISTA
		List<String> nome = new ArrayList<String>();
		String aux = " ";

		// LAÇO PERCORRE A LISTA
		for (int i = 0; i < letras.length(); i++) {
			nome.add(String.valueOf(letras.charAt(i)));

		}
		// MÉTODO PARA EMBARALHAR A PALAVRA INFORMADA
		Collections.shuffle(nome);

		for (int i = 0; i < letras.length(); i++) {
			aux += nome.get(i);
		}
		return aux;
	}

	// MÉTODO PRINCIPAL
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe uma palavra: ");

		String palavra = scan.next();
		scan.close();

		// CHAMA O MÉTODO EMBARALHAR
		// CONVERTENDO A PALAVRA PARA MAIUSCULA
		System.out.println("Embaralhando temos o resultado:" + embaralha(palavra.toUpperCase()));
	}

}
