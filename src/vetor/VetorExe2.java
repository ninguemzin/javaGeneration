package vetor;

import java.util.Arrays;
import java.util.Scanner;

public class VetorExe2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vetorInteiros[] = new int[5];

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println("Digite o " + (i + 1) + " numero: ");
			vetorInteiros[i] = scanner.nextInt();
		}

		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println((i + 1) + " elemento: " + vetorInteiros[i]);
		}
		
		System.out.println("Tamanho de vetor: " + vetorInteiros.length);
		
		Arrays.sort(vetorInteiros);
		
		for (int i = 0; i < vetorInteiros.length; i++) {
			System.out.println((i + 1) + " elemento: " + vetorInteiros[i]);
		}
		
		scanner.close();
	}

}
