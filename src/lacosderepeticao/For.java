package lacosderepeticao;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a tabuada que vc quer calcular");
		int num = scanner.nextInt();
		
		for (int cont = 1; cont <= 10; cont++) {
			int result = num * cont;
			System.out.println(num + " x " + cont + " = " + result);
		}
		scanner.close();
	}

}
