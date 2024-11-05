package exercicios0411;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class lista1_02 {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<>();
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("*****************************************");
			System.out.println("      1 - Adicionar Livro na Fila");
			System.out.println("      2 - Listar todos os Livros");
			System.out.println("      3 - Retirar Livros da pilha");
			System.out.println("      0 - Sair");
			System.out.println("*****************************************");

			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.print("Digite o nome do livro: ");
				String nome = scanner.nextLine();
				pilha.push(nome);
				System.out.println("Livro:");
				for (String nomeLivro : pilha) {
					System.out.println(nomeLivro);
				}
				System.out.println("Livro Adicionado! ");
				break;

			case 2:

				if (pilha.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("Lista de Livros na Pilha:");
					for (String nomeLivro : pilha) {
						System.out.println(nomeLivro);
					}
				}
				break;

			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					String livroRetirado = pilha.pop();
					System.out.println("Pilha:");
					for (String nomeLivro : pilha) {
						System.out.println(nomeLivro);
					}
					System.out.println("O livro " + livroRetirado + " foi retirado da pilha!");
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
