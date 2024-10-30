package exercicio3010;

import java.util.Scanner;

public class lista1_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = scan.nextInt();
		int par = 0, inpar = 0;

		for (int cont = 0; cont <= 10; cont++) {
			if (numero % 2 == 0) {
				par++;
			}else {
				inpar++;
			}
		}
		System.out.println("total de numeros par: " + par);
		System.out.println("total de numeros par: " + inpar);
		scan.close();

	}

}
