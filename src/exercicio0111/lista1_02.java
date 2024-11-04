package exercicio0111;

import java.util.ArrayList;
import java.util.Scanner;

public class lista1_02 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Por favor, digite 10 números inteiros para armazenar na lista: ");

		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o número " + i + ": ");
			int num = scanner.nextInt();
			numeros.add(num);

		}

		System.out.println("\nDigite um número para buscar na lista: ");
		int buscarNum = scanner.nextInt();

		boolean encontrado = false;

		for (int i = 0; i < numeros.size(); i++) {
			if (numeros.get(i) == buscarNum) {
				System.out.println("O número " + buscarNum + " " + "está localizado na posição " + i);
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("O número " + buscarNum + " não foi encontrado!");
		}

		scanner.close();
	}

}
