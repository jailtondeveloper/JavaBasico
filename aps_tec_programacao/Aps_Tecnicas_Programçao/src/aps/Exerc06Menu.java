package aps;


import java.util.Scanner;

public class Exerc06Menu {

	// DISCIPLINA T�CNICA DE PROGRAMA��O
	// PROFESSOR: RENAN ALENCAR
	// ALUNO: GUILHERME NERY
	// ALUNO: GUSTAVO BATISTA
	// ALUNO: JOSE AUGUSTO NETO
	// ALUNO: JAILTON SANTANA

	// EXERC06: MENU DE PEDIDOS

	// ===================
	// VARIAVEIS GLOBAIS |
	// ===================
	static String[] produtos = { "Cachorro quente", "Bauru Simples  ", "Bauru com ovo  ", "Hamb�rguer     ",
			"Cheeseburguer  ", " Refrigerante  " };
	static double[] preco = { 1.20, 1.30, 1.50, 1.20, 1.3, 1.0 };
	static String[] listaPedido = { "", "", "", "", "", "" };
	static int[] qtdPedido = { 0, 0, 0, 0, 0, 0 };

	// =============================================
	// METODP QUE VAI EXIBIR O MENU PARA OS USU�RIOS;
	// =============================================
	public static void menu() { // M�TODO CARD�PIO

		System.out.println("---------------------------------------------");
		System.out.println("|                CARDAPIO                   |");
		System.out.println("---------------------------------------------");
		System.out.println("|  Especifica��es    |   C�digo   |  Pre�o  | ");
		System.out.println("---------------------------------------------");
		System.out.println("| Cachorro quente    |     100    |  $1,20  |");
		System.out.println("---------------------------------------------");
		System.out.println("| Bauru Simples      |     101    |  $1,30  |");
		System.out.println("---------------------------------------------");
		System.out.println("| Bauru com ovo      |     102    |  $1,50  |");
		System.out.println("---------------------------------------------");
		System.out.println("| Hamb�rguer         |     103    |  $1,20  |");
		System.out.println("---------------------------------------------");
		System.out.println("| Cheeseburguer      |     104    |  $1,30  |");
		System.out.println("---------------------------------------------");
		System.out.println("| Refrigerante       |     105    |  $1,00  |");
		System.out.println("---------------------------------------------");
	}
	// FIM DO M�TODO CARD�PIO

	// =============================================
	// M�TODO ADICIONAR MAIS UMA OP��O
	// =============================================
	public static boolean continuar(String finalizar) {

		if (finalizar.equals("S") || finalizar.equals("s")) {
			return true;

		} else {
			System.out.println("==========================================================");
			System.out.println("|                    PEDIDO FINALIZADO                   |");
			System.out.println("==========================================================");
			return false;
		}

	}

	// ===================================================
	// M�TODO RESPONS�VEL POR EXIBIR O PEDIDO DO CLIENTE
	// ====================================================
	public static void resutado() {

		System.out.println("---------------------------------------------------------");
		System.out.println("|                       PEDIDO                          |");
		System.out.println("---------------------------------------------------------");
		System.out.println("|   Especifica��es   |   Quantidade   |  Pre�o  | Total |");
		System.out.println("---------------------------------------------------------");

		// =====================================================================================================================
		/*
		 * ESSE FOR PERCORRE O VETOR (LISTA PEDIDOS) E VERIFICA EM QUAIS POSI�OES TEM O
		 * OK CASO TENHA O OK SIGNIFICA QUE O USU�RIO ADICIONOU AO SEU PEDIDO O ITEM
		 * CORRESPONDENTE AQUELA POSI�AO NO VETOR (PRODUTOS)
		 */

		// ====================================================================================================================
		for (int i = 0; i < listaPedido.length; i++) {
			// O IF VERIFICA OS ITENS QUE FORAM ADICIONADOS PELO CLIENTE
			// E PARA EXIBIR APENAS OS PRODUTOS SELECIONADOS

			if (listaPedido[i].equals("ok")) {
				System.out.println("|" + produtos[i] + "     |        " + qtdPedido[i] + "      |   " + preco[i]
						+ "   |  " + preco[i] * qtdPedido[i] + " |");
				System.out.println("--------------------------------------------------------");
			}
		}

	}

	// ====================================================================
	// M�TODO RESPONS�VEL POR ADICIONAR A QUANTIDADE DE PRODUTOS NO PEDIDO //
	// ====================================================================
	public static void adcionar(int cod, int qtd) {

		switch (cod) {
		case 100:

			listaPedido[0] = "ok";
			qtdPedido[0] += qtd;

			break;

		case 101:
			listaPedido[1] = "ok";
			qtdPedido[1] += qtd;
			break;
		case 102:

			listaPedido[2] = "ok";
			qtdPedido[2] += qtd;
			break;

		case 103:

			listaPedido[3] = "ok";
			qtdPedido[3] += qtd;
			break;

		case 104:

			listaPedido[4] = "ok";
			qtdPedido[4] += qtd;
			break;

		case 105:

			listaPedido[5] = "ok";
			qtdPedido[5] += qtd;
			break;

		}
	}

	// =============================================
	// METODO MAIN //
	// =============================================
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int codigo, qtd;
		boolean sair = true;

		while (sair) {
			codigo = 0;
			qtd = 0;
			menu();
			System.out.println("Digite o c�digo referente a sua op��o: ");
			codigo = teclado.nextInt();

			// ESSE (IF) VERIFICA SE O C�DIGO DIGITADO EXISTE NO MENU
			if (codigo == 100 || codigo == 101 || codigo == 102 || codigo == 103 || codigo == 104 || codigo == 105) {
				System.out.println("Digite a quantidade do Produto: ");
				qtd = teclado.nextInt();

				// ESSE (if) VERIFICA SE A QUANTIDADE DO PRODUTO � MAIOR QUE ZERO
				// E VAI REPETIR ATE QUE O USUARIO DIGITE UMA QUANTIDADE VALIDA.

				if (0 > qtd || qtd == 0) {
					while (qtd <= 0) {
						System.out.println("Quantidade Invalida! digite um valor maior que zero: ");
						qtd = teclado.nextInt();

					}

				}

			} else {
				System.out.println("C�DIGO INVALIDO!  ");

			}
			// METODO � CHAMADO PARA ADICIONAR O PRODUTO AO PEDIDO
			adcionar(codigo, qtd);

			// VERIFICA SE O USUARIO QUER ADICIONAR MAIS ALGUM PRODUTO AO PEDIDO, CASO
			// CLIENTE
			// DIGITE QUALQUER VALOR DIFERENTE DE S OU s, O PROGRAMA SER� ENCERRADO

			System.out.println("Desesja adicionar mais algum produto ao pedido? ");

			// METODO RESPONS�VEL POR VERIFICA SE VAI ENCERRAR O PEDIDO
			sair = continuar(teclado.next());
			if (sair == false) {
				break;

			}
		}

		resutado();

	}

}
