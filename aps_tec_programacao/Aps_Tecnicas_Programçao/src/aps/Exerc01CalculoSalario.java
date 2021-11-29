package aps;

import java.util.Scanner;

public class Exerc01CalculoSalario {
	// DISCIPLINA T�CNICA DE PROGRAMA��O
	// PROFESSOR: RENAN ALENCAR
	// ALUNO: GUILHERME NERY
	// ALUNO: GUSTAVO BATISTA
	// ALUNO: JAILTON SANTANA
	// ALUNO:  JOSE AUGUSTO NETO
	
	// EXERC01: CALCULANDO SAL�RIO

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//ENTRADA DE DADOS
		System.out.println("Quanto voc� ganha por hora?");
		double valorHora = scan.nextDouble();

		System.out.println("Quantas horas faz no m�s?");
		double qtdHora = scan.nextDouble();

		scan.close();
		
		//CALCULO DO SAL�RIO
		double sBruto = valorHora * qtdHora;

		//VARIAVEIS E SUAS FUN�OES
		double taxaIr = sBruto * 11 / 100;
		double taxaInss = sBruto * 8 / 100;
		double taxaSindicato = sBruto * 5 / 100;
		double somaTaxas = taxaIr + taxaInss + taxaSindicato;
		
		//SAIDA DOS DADOS
		System.out.println("a) Salario bruto R$" + sBruto);
		System.out.println();
		System.out.println("b)Desconto IR 11% = R$" + taxaIr);
		System.out.println("c)Desconto INSS 8%  = R$" + taxaInss);
		System.out.println("d)Desconto Sindicato 5% = R$" + taxaSindicato);
		System.out.println();
		System.out.println("e) Sal�rio l�quido: R$" + (sBruto - somaTaxas));

	}

}
