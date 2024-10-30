package exercicios2910;

import java.util.Scanner;

public class lista1_03 {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean doacao;

		Scanner escreve = new Scanner(System.in);

		System.out.println("Digite o Nome do doador: ");
		nome = escreve.nextLine();
		System.out.println("Digite a Idade do doador: ");
		idade = escreve.nextInt();
		System.out.println("Primeira doação de sangue?: ");
		doacao = escreve.nextBoolean();

		if (idade >= 18 && idade <= 69) {
			if(idade >= 60 && !doacao) {
				System.out.println(nome + " está apto/a para doar sangue!");
			}
		} else if (idade < 60 || idade >= 60 && doacao){
			System.out.println(nome + " está apto/a para doar sangue!");
		} else {
			System.out.println(nome + " não está apto/a para doar sangue!");
			
		}
		escreve.close();
	}

}
