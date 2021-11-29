package aps;


import java.util.Scanner;

public class Exerc06Menu {

	// DISCIPLINA TÉCNICA DE PROGRAMAÇÃO
	// PROFESSOR: RENAN ALENCAR
	// ALUNO: GUILHERME NERY
	// ALUNO: GUSTAVO BATISTA
	// ALUNO: JOSE AUGUSTO NETO
	// ALUNO: JAILTON SANTANA

	// EXERC06: MENU DE PEDIDOS

	// ===================
	// VARIAVEIS GLOBAIS |
	// ===================
	static String[] produtos = { "Cachorro quente", "Bauru Simples  ", "Bauru com ovo  ", "Hambúrguer     ",
			"Cheeseburguer  ", " Refrigerante  " };
	static double[] preco = { 1.20, 1.30, 1.50, 1.20, 1.3, 1.0 };
	static String[] listaPedido = { "", "", "", "", "", "" };
	static int[] qtdPedido = { 0, 0, 0, 0, 0, 0 };

	// =============================================
	// METODP QUE VAI EXIBIR O MENU PARA OS USUÁRIOS;
	// =============================================
	public static void menu() { // MÉTODO CARDÁPIO

		System.out.println("---------------------------------------------");
		System.out.println("|                CARDAPIO                   |");
		System.out.println("---------------------------------------------");
		System.out.println("|  Especificações    |   Código   |  Preço  | ");
		System.out.println("---------------------------------------------");
		System.out.println("| Cachorro quente    |     100    |  $1,20  |");
		System.out.println("---------------------------------------------");
		System.out.println("| Bauru Simples      |     101    |  $1,30  |");
		System.out.println("---------------------------------------------");
		System.out.println("| Bauru com ovo      |     102    |  $1,50  |");
		System.out.println("---------------------------------------------");
		System.out.println("| Hambúrguer         |     103    |  $1,20  |");
		System.out.println("---------------------------------------------");
		System.out.println("| Cheeseburguer      |     104    |  $1,30  |");
		System.out.println("---------------------------------------------");
		System.out.println("| Refrigerante       |     105    |  $1,00  |");
		System.out.println("---------------------------------------------");
	}
	// FIM DO MÉTODO CARDÁPIO

	// =============================================
	// MÉTODO ADICIONAR MAIS UMA OPÇÃO
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
	// MÉTODO RESPONSÁVEL POR EXIBIR O PEDIDO DO CLIENTE
	// ====================================================
	public static void resutado() {

		System.out.println("---------------------------------------------------------");
		System.out.println("|                       PEDIDO                          |");
		System.out.println("---------------------------------------------------------");
		System.out.println("|   Especificações   |   Quantidade   |  Preço  | Total |");
		System.out.println("---------------------------------------------------------");

		// =====================================================================================================================
		/*
		 * ESSE FOR PERCORRE O VETOR (LISTA PEDIDOS) E VERIFICA EM QUAIS POSIÇOES TEM O
		 * OK CASO TENHA O OK SIGNIFICA QUE O USUÁRIO ADICIONOU AO SEU PEDIDO O ITEM
		 * CORRESPONDENTE AQUELA POSIÇAO NO VETOR (PRODUTOS)
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
	// MÉTODO RESPONSÁVEL POR ADICIONAR A QUANTIDADE DE PRODUTOS NO PEDIDO //
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
			System.out.println("Digite o código referente a sua opção: ");
			codigo = teclado.nextInt();

			// ESSE (IF) VERIFICA SE O CÓDIGO DIGITADO EXISTE NO MENU
			if (codigo == 100 || codigo == 101 || codigo == 102 || codigo == 103 || codigo == 104 || codigo == 105) {
				System.out.println("Digite a quantidade do Produto: ");
				qtd = teclado.nextInt();

				// ESSE (if) VERIFICA SE A QUANTIDADE DO PRODUTO É MAIOR QUE ZERO
				// E VAI REPETIR ATE QUE O USUARIO DIGITE UMA QUANTIDADE VALIDA.

				if (0 > qtd || qtd == 0) {
					while (qtd <= 0) {
						System.out.println("Quantidade Invalida! digite um valor maior que zero: ");
						qtd = teclado.nextInt();

					}

				}

			} else {
				System.out.println("CÓDIGO INVALIDO!  ");

			}
			// METODO É CHAMADO PARA ADICIONAR O PRODUTO AO PEDIDO
			adcionar(codigo, qtd);

			// VERIFICA SE O USUARIO QUER ADICIONAR MAIS ALGUM PRODUTO AO PEDIDO, CASO
			// CLIENTE
			// DIGITE QUALQUER VALOR DIFERENTE DE S OU s, O PROGRAMA SERÁ ENCERRADO

			System.out.println("Desesja adicionar mais algum produto ao pedido? ");

			// METODO RESPONSÁVEL POR VERIFICA SE VAI ENCERRAR O PEDIDO
			sair = continuar(teclado.next());
			if (sair == false) {
				break;

			}
		}

		resutado();

	}

}
