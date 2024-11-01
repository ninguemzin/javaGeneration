package exercicios3110;

import java.util.Scanner;

public class lista1_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6};

		System.out.println("Digite o número que você deseja encontrar: ");
		int numero = scanner.nextInt();
		
		boolean encontrado = false;
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == numero) {
				System.out.println("O número " + numero + " está localizado na posição: " + i);
				encontrado = true;
				break;
			}
		}
		if(!encontrado) {
			System.out.println("O numero " + numero + " não foi encontrado!");
		}
		scanner.close();
	}

}
