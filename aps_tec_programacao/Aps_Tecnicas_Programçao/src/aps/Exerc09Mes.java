package aps;


import java.util.Scanner;

public class Exerc09Mes {
	// DISCIPLINA T�CNICA DE PROGRAMA��O
	// PROFESSOR: RENAN ALENCAR
	// ALUNO: GUILHERME NERY
	// ALUNO: GUSTAVO BATISTA
	// ALUNO: JAILTON SANTANA
	// ALUNO: JOS� AUGUSTO NETO

	// EXERC09: M�S POR EXTENSO

	// INICIO DO M�TODO
	public static int mesExtenso(int d, int m, int a) {

		// ESCOLHA DO CASO
		switch (m) {
		case 01:
			if (d <= 31) {
				System.out.print(d + " de" + " Janeiro" + " de " + a + " .");
			} else {
				System.out.print("Este dia � inv�lido para o m�s desejado!");
			}
			break;
		case 02:
			if (d <= 28) {
				System.out.print(d + " de" + " Fevereiro" + " de " + a + " .");
			} else {
				System.out.print("Este dia � inv�lido para o m�s desejado!");
			}
			break;
		case 03:
			if (d <= 31) {
				System.out.print(d + " de" + " Mar�o" + " de " + a + " .");
			} else {
				System.out.print("Este dia � inv�lido para o m�s desejado!");
			}
			break;
		case 04:
			if (d <= 30) {
				System.out.print(d + " de" + " Abril" + " de " + a + " .");
			} else {
				System.out.print("Este dia � inv�lido para o m�s desejado!");
			}
			break;
		case 05:
			if (d <= 31) {
				System.out.print(d + " de" + " Maio" + " de " + a + " .");
			} else {
				System.out.print("Este dia � inv�lido para o m�s desejado!");
			}
			break;
		case 06:
			if (d <= 30) {
				System.out.print(d + " de" + " Junho" + " de " + a + " .");
			} else {
				System.out.print("Este dia � inv�lido para o m�s desejado!");
			}
			break;
		case 07:
			if (d <= 31) {
				System.out.print(d + " de" + " Julho" + " de " + a + " .");
			} else {
				System.out.print("Este dia � inv�lido para o m�s desejado!");
			}
			break;
		case 8:
			if (d <= 31) {
				System.out.print(d + " de" + " Agosto" + " de " + a + " .");
			} else {
				System.out.print("Este dia � inv�lido para o m�s desejado!");
			}
			break;
		case 9:
			if (d <= 30) {
				System.out.print(d + " de" + " Setembro" + " de " + a + " .");
			} else {
				System.out.print("Este dia � inv�lido para o m�s desejado!");
			}
			break;
		case 10:
			if (d <= 31) {
				System.out.print(d + " de" + " Outubro" + " de " + a + " .");
			} else {
				System.out.print("Este dia � inv�lido para o m�s desejado!");
			}
			break;
		case 11:
			if (d <= 30) {
				System.out.print(d + " de" + " Novembro" + " de " + a + " .");
			} else {
				System.out.print("Este dia � inv�lido para o m�s desejado!");
			}
			break;
		case 12:
			if (d <= 31) {
				System.out.print(d + " de" + " Dezembro" + " de " + a + " .");
			} else {
				System.out.print("Este dia � inv�lido para o m�s desejado!");
			}
			break;
		default:
			System.out.print("O m�s informado n�o existe!");
		}
		return a;
	}

	// M�TODO PRINCIPAL
	public static void main(String[] args) {

		int d = 0;
		int m = 0;
		int a = 0;

		Scanner scan = new Scanner(System.in);
		// ENTRADA DE DADOS
		System.out.print("Informe um dia entre 01 e 31 :");
		d = scan.nextInt();
		System.out.print("Informe um m�s entre 01 e 12 :");
		m = scan.nextInt();
		System.out.print("Informe um ano (Ex: 2021) :");
		a = scan.nextInt();
		
		scan.close();
		
		//CHAMADA DO M�TODO MES_EXTENSO
		int mes = mesExtenso(d, m, a);
	}
}
