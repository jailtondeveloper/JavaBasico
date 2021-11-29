package aps;

import java.util.Scanner;

public class Exerc02CalculoTinta {
	// DISCIPLINA TÉCNICA DE PROGRAMAÇÃO
	// PROFESSOR: RENAN ALENCAR
	// ALUNO: GUILHERME NERY
	// ALUNO: GUSTAVO BATISTA
	// ALUNO: JAILTON SANTANA
	// ALUNO: JOSE AUGUSTO NETO
	
	// EXERC02: CÁLCULO TINTA

	public static void main(String[] args) {

		// VARIAVEIS E ENTRADA DE DADOS
		Scanner scan = new Scanner(System.in);
		double lata = 18;
		double galao = 3.6;
		double rendimento = 6;
		double valorLata = 80;
		double valorGalao = 25;

		System.out.println("Qual é o tamando da área a ser pintada? ");
		double metroQuadrado = scan.nextDouble();

		scan.close();

		System.out.println("Tamanho " + metroQuadrado + "m²:");

		double totalLitros = metroQuadrado / rendimento;

		System.out.printf("A quantidade total em litros será de: %.2f %n", totalLitros);

		double qtdLatas18 = totalLitros / lata;
		double qtdGaloes3 = totalLitros / galao;

		double valTot18 = Math.ceil(qtdLatas18) * valorLata;
		double valTot3 = Math.ceil(qtdGaloes3) * valorGalao;

		// EXIBIÇAO DO CALCULO COM LATAS E GALOES
		System.out.println();
		System.out.println("Calculo se for usar latas de 18 litros: ");
		System.out.printf("A quantidade necessária de latas de 18 litros é: %.2f %n", qtdLatas18);
		System.out.println("O custo total dessas latas é R$" + valTot18);

		System.out.println();
		System.out.println("Calculo dos galões de 3,6 litros para o mesmo serviço:");
		System.out.printf("A quantidade de galões de 3,6 litros será: %.2f %n", qtdGaloes3);
		System.out.println("O custo desses galões será R$" + valTot3);

		System.out.println();

		// COMPARAÇAO DO MELHOR CUSTO ENTRE LATA E GALAO
		if (valTot18 < valTot3) {
			System.out.println("Será mais vantagem comprar Latas.");
		} else {
			System.out.println("Comprando galões será mais economico.");
		}
		System.out.println();

		// VARIAVEIS
		double somaLataGalao = (valTot3 + valTot18);
		double margem = 0.10;

		// CALCULANDO A MISTURA DE TINTAS
		System.out.println("-----------------------------------------------------------");
		System.out.println("Misturando as duas opções para o menor desperdicio de tinta...");

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
		System.out.println("Custo na opção de mistura com uma margem de 10%, é R$" + valTotMista);

	}

}
