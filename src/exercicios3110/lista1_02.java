package exercicios3110;

import java.util.Scanner;

public class lista1_02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int vetorInteiros[] = new int[10];
		int impar = 0, par = 0, soma = 0;

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite o " + (i + 1) + " numero: ");
			vetorInteiros[i] = scanner.nextInt();
		}
		System.out.println("Elementos nos índices ímpares: ");
		for (int i = 0; i < vetorInteiros.length; i++) {
			if (i % 2 != 0) {
				System.out.print(vetorInteiros[i] + " ");
				impar++;
			}
		}
		System.out.println("\nElementos nos índices pares: ");
		for (int i = 0; i < vetorInteiros.length; i++) {
			if (vetorInteiros[i] % 2 == 0) {
				System.out.print(vetorInteiros[i] + " ");
				par++;
			}
		}
		
		System.out.println("\nSoma: ");
		for (int i = 0; i < vetorInteiros.length; i++) {
				soma += vetorInteiros[i];
		}
		System.out.println(soma);
		
		double media = (double) soma / vetorInteiros.length;
		System.out.printf("A média dos elementos é: %.2f\n", media);

		scanner.close();

	}
}
