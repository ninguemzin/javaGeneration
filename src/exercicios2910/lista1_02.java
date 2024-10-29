package exercicios2910;

import java.util.Scanner;

public class lista1_02 {

	public static void main(String[] args) {
		Scanner escreva = new Scanner(System.in);
		int num;
		System.out.println("Escreva um número: ");
		num = escreva.nextInt();
		if (num > 0 && num % 2 == 0) {
			System.out.println("O numero " + num + " é par e positivo");
		} else if (num < 0 && num % 2 == 0) {
			System.out.println("O numero " + num + " é par e negativo");
		} else if (num > 0 && num % 2 != 0) {
			System.out.println("O numero " + num + " é impar e positivo");
		} else{
			System.out.println("O numero " + num + " é impar e negativo");
		}
		
		escreva.close();
	}

}
