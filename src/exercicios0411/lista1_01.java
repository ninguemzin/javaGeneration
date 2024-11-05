package exercicios0411;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class lista1_01 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("*****************************************");
			System.out.println("      1 - Adicionar Cliente na Fila");
			System.out.println("      2 - Listar todos os Clientes");
			System.out.println("      3 - Retirar Cliente da Fila");
			System.out.println("      0 - Sair");
			System.out.println("*****************************************");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do cliente: ");
				String nome = scanner.nextLine();
				fila.add(nome);
				System.out.println("Fila:");
				for (String cliente : fila) {
					System.out.println(cliente);
				}
				System.out.println("Cliente Adicionado! ");
				break;

			case 2:

				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					String clienteChamado = fila.poll();
					System.out.println("Fila:");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
					System.out.println("O Cliente " + clienteChamado + " foi chamado!");
				}
				break;

			case 0:

				System.out.println("Programa Finalizado!");
				break;

			default:
				System.out.println("Opção inválida tente novamente.");
			}
		} while (opcao != 0);

		scanner.close();

	}

}
