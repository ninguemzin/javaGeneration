package lacosderepeticao;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continua;

		System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
		System.out.print("\nDeseja usar nossa calculadora de soma? (s/n): ");
		continua = scanner.next().equalsIgnoreCase("s");
		System.out.println("++++++++++++++++++++++++++++++++++");

		while (continua) {

			System.out.print("Digite o primeiro valor: ");
			int num1 = scanner.nextInt();

			System.out.print("Digite o segundo valor: ");
			int num2 = scanner.nextInt();

			int resul = num1 + num2;
			System.out.println("O resultado do valor é: " + resul);
			
			
			System.out.println("\n++++++++++++++++MENU++++++++++++++++++");
			System.out.print("\nDeseja usar nossa calculadora de soma? (s/n): ");
			continua = scanner.next().equalsIgnoreCase("s");
			System.out.println("++++++++++++++++++++++++++++++++++");

		}
		scanner.close();
	
	}

}
