package aps;

import java.util.Scanner;

public class Exerc02CalculoTinta {
	// DISCIPLINA T�CNICA DE PROGRAMA��O
	// PROFESSOR: RENAN ALENCAR
	// ALUNO: GUILHERME NERY
	// ALUNO: GUSTAVO BATISTA
	// ALUNO: JAILTON SANTANA
	// ALUNO: JOSE AUGUSTO NETO
	
	// EXERC02: C�LCULO TINTA

	public static void main(String[] args) {

		// VARIAVEIS E ENTRADA DE DADOS
		Scanner scan = new Scanner(System.in);
		double lata = 18;
		double galao = 3.6;
		double rendimento = 6;
		double valorLata = 80;
		double valorGalao = 25;

		System.out.println("Qual � o tamando da �rea a ser pintada? ");
		double metroQuadrado = scan.nextDouble();

		scan.close();

		System.out.println("Tamanho " + metroQuadrado + "m�:");

		double totalLitros = metroQuadrado / rendimento;

		System.out.printf("A quantidade total em litros ser� de: %.2f %n", totalLitros);

		double qtdLatas18 = totalLitros / lata;
		double qtdGaloes3 = totalLitros / galao;

		double valTot18 = Math.ceil(qtdLatas18) * valorLata;
		double valTot3 = Math.ceil(qtdGaloes3) * valorGalao;

		// EXIBI�AO DO CALCULO COM LATAS E GALOES
		System.out.println();
		System.out.println("Calculo se for usar latas de 18 litros: ");
		System.out.printf("A quantidade necess�ria de latas de 18 litros �: %.2f %n", qtdLatas18);
		System.out.println("O custo total dessas latas � R$" + valTot18);

		System.out.println();
		System.out.println("Calculo dos gal�es de 3,6 litros para o mesmo servi�o:");
		System.out.printf("A quantidade de gal�es de 3,6 litros ser�: %.2f %n", qtdGaloes3);
		System.out.println("O custo desses gal�es ser� R$" + valTot3);

		System.out.println();

		// COMPARA�AO DO MELHOR CUSTO ENTRE LATA E GALAO
		if (valTot18 < valTot3) {
			System.out.println("Ser� mais vantagem comprar Latas.");
		} else {
			System.out.println("Comprando gal�es ser� mais economico.");
		}
		System.out.println();

		// VARIAVEIS
		double somaLataGalao = (valTot3 + valTot18);
		double margem = 0.10;

		// CALCULANDO A MISTURA DE TINTAS
		System.out.println("-----------------------------------------------------------");
		System.out.println("Misturando as duas op��es para o menor desperdicio de tinta...");

		double qtdLtMista18 = ((totalLitros * margem) + totalLitros) / lata;
		double qtdLt18 = Math.ceil(qtdLtMista18) * lata;
		double sobra18L = ((totalLitros * margem) + totalLitros) - qtdLt18;

		double qtdLtMista3 = sobra18L / galao;
		double qtdLtMistaTot = Math.ceil(qtdLtMista18) + Math.ceil((qtdLtMista3));
		double valMista18 = Math.ceil(qtdLtMista18) * valorLata;
		double valMista3 = Math.ceil(qtdLtMista3) * valorGalao;
		double valTotMista = valMista18 + valMista3;

		// EXIBICAO DO CUSTO DA MISTURA DE TINTAS
		System.out.printf("Qtd latas mistas 18 litros %.2f %n", qtdLtMista18);
		System.out.printf("Qtd latas 3,6 %.2f %n", qtdLtMista3);
		System.out.printf("Qtd latas mistas: %.2f %n ", qtdLtMistaTot);
		System.out.println("Custo na op��o de mistura com uma margem de 10%, � R$" + valTotMista);

	}

}
