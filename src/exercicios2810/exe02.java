package exercicios2810;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class exe02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);

		float nota1, nota2, nota3, nota4, media;

		System.out.println("Digite sua primeira nota: ");
		nota1 = ler.nextFloat();
		
		System.out.println("Digite sua segunda nota: ");
		nota2 = ler.nextFloat();

		System.out.println("Digite sua terceira nota: ");
		nota3 = ler.nextFloat();

		System.out.println("Digite sua quarta nota: ");
		nota4 = ler.nextFloat();

		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		DecimalFormat df = new DecimalFormat("0.0");
		
		System.out.println("Sua média é: " + df.format(media));

		ler.close();
	}

}
