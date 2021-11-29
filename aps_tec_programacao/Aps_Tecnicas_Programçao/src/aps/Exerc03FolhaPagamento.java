package aps;

import java.util.Scanner;
public class Exerc03FolhaPagamento {

	// DISCIPLINA T�CNICA DE PROGRAMA��O
	// PROFESSOR: RENAN ALENCAR
	// ALUNO: GUILHERME NERY
	// ALUNO: GUSTAVO BATISTA
	// ALUNO: JAILTON SANTANA
	// ALUNO: JOSE AUGUSTO NETO
	
	//EXERC03: FOLHA DE PAGAMENTO

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		// ENTRADA DOS DADOS
		System.out.println("Informe o valor da hora trabalhada: ");
		double valorHora = scan.nextDouble();

		System.out.println("Qual foi a quantidade de horas feitas no m�s?");
		double qtdhoras = scan.nextDouble();

		scan.close();
		// PARTE L�GICA
		double salBruto = valorHora * qtdhoras;

		int taxaIr = 0;
		if (salBruto <= 900) {
			taxaIr = 0;
		} else if (salBruto > 900 && salBruto <= 1500) {
			taxaIr = 5;
		} else if (salBruto > 1500 && salBruto <= 2500) {
			taxaIr = 10;
		} else if (salBruto > 2500) {
			taxaIr = 20;
		}

		// C�LCULO DO PERCENTUAL / DESCONTO
		double ir = (salBruto / 100) * taxaIr;
		double inss = (salBruto / 100) * 10;
		double fgts = (salBruto / 100) * 11;
		double sindicato = (salBruto / 100) * 3;
		double totDesconto = ir + inss + sindicato;
		double salLiquido = salBruto - totDesconto;

		// EXIBI��O DO RESULTADO
		System.out.println("Sal�rio Bruto: (" + valorHora + " * " + qtdhoras + "): R$" + salBruto);
		System.out.println("(-) IR (" + taxaIr + "%): " + ir);
		System.out.println("(-) INSS 10% " + inss);
		System.out.println("(-) Sindicato 3% " + sindicato);
		System.out.println("FGTS 11% " + fgts);
		System.out.println("Total de descontos: " + totDesconto);
		System.out.println("Sal�rio Liquido: " + salLiquido);

	}

}
