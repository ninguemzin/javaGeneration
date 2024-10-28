package exercicios2810;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
			
			Scanner ler = new Scanner(System.in);

			float salario, abono, novo_salario;

			System.out.println("Digite seu salário: ");
			salario = ler.nextFloat();

			System.out.println("Digite seu Abono? ");
			abono = ler.nextFloat();
			
			novo_salario = salario + abono;
			
			DecimalFormat df = new DecimalFormat("0.00");
			
			System.out.println("Seu salário é: R$" + df.format(novo_salario));

			 ler.close();
	}

}
