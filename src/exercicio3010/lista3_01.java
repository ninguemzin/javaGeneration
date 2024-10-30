package exercicio3010;

import java.util.Scanner;

public class lista3_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int total = 0;
		boolean cancelar = false;

		do {
			System.out.print("Digite um número: ");
			int numero = scan.nextInt();
			if (numero == 0) {
				cancelar = true;
			}

			else if (numero > 0) {
				total++;
			}
		} while (!cancelar);
		System.out.println("A soma dos números positivos é: " + total);
		scan.close();
	}

}
