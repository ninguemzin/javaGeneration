package exercicios2810;

import java.util.Scanner;

public class exe04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float n1, n2, n3, n4, diferenca;

		System.out.println("Digite seu salario bruto: ");
		n1 = ler.nextFloat();

		System.out.println("Digite seu adicional noturno: ");
		n2 = ler.nextFloat();

		System.out.println("Digite suas horas extras: ");
		n3 = ler.nextFloat();

		System.out.println("Digite seus descontos: ");
		n4 = ler.nextFloat();

		diferenca = (n1 * n2) - (n3 * n4);

		System.out.println("Sua média é: " + (diferenca));

		ler.close();
	}
}
