package exercicios2810;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float salario_liquido, salario_bruto, adicional_noturno, horas_extras, descontos;

		System.out.println("Digite seu salario bruto: ");
		salario_bruto = ler.nextFloat();

		System.out.println("Digite seu adicional noturno: ");
		adicional_noturno = ler.nextFloat();

		System.out.println("Digite suas horas extras: ");
		horas_extras = ler.nextFloat();

		System.out.println("Digite seus descontos: ");
		descontos = ler.nextFloat();

		salario_liquido = salario_bruto + adicional_noturno + (horas_extras * 5) - descontos;

		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Sua média é: " + df.format(salario_liquido));

		ler.close();
	}

}
