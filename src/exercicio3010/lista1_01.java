package exercicio3010;

import java.util.Scanner;

public class lista1_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o primeiro número do intervalo");
		int numero1 = scan.nextInt();
		System.out.println("Digite o último número do intervalo");
		int numero2 = scan.nextInt();

		if (numero1 >= numero2) {
			System.out.println("Intervalo invalido!");
		}

		for (int multiplo = numero1; multiplo <= numero2; multiplo++) {
			if (multiplo % 3 == 0 && multiplo % 5 == 0) {
				System.out.println(multiplo + " é múltiplo de 3 e 5");
			}
		}
		scan.close();
	}

}
