package exercicios3110;

import java.util.Scanner;

public class lista2_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[][] notas = new double[10][4];
		double[] medias = new double[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite as notas do participante " + (i + 1));
			for (int j = 0; j < 4; j++) {
				System.out.println("Nota " + (j + 1) + ": ");
				notas[i][j] = scanner.nextDouble();
			}
		}
		
		for (int i = 0; i < 10; i++) {
			double soma = 0;
			for (int j = 0; j < 4; j++) {
				soma += notas[i][j];
			}
			medias[i] = soma / 4; 
		}
		
		System.out.println("\nMédias dos participantes:");
		for (int i = 0; i < 10; i++) {
		System.out.printf("Participante %d: %.1f%n", (i + 1), medias[i]);
		}
		
		scanner.close();
	}

}
