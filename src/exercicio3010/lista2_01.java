package exercicio3010;

import java.util.Scanner;

public class lista2_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade = 0, maior = 0, menor = 0;
		while (true) {
			System.out.println("Digite uma idade (numero negativo para sair): ");
			idade = scanner.nextInt();
			
			if(idade < 0) {
				break;
			}
			if (idade < 21) {
				menor++;
			}
			if (idade > 50) {
				maior++;
			}
		}
		
		System.out.println("pessoas menores que 21: " + menor);
		System.out.println("pessoas maiores que 60: " + maior);
		
		scanner.close();
	}

}
