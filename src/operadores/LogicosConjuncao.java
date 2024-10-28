package operadores;

import java.util.Scanner;

public class LogicosConjuncao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		boolean idade, ingresso, resposta, parente;

		System.out.println("Vamos verificar acesso a balada: ");

		System.out.println("Tem o ingresso? ");
		ingresso = ler.nextBoolean();

		System.out.println("Idade maior ou igual a 18? ");
		idade = ler.nextBoolean();
		
		System.out.println("É parente do dono? ");
		parente = ler.nextBoolean();
		
		resposta = idade && ingresso || parente;
		
		System.out.println("Acesso! " + resposta);

		 ler.close();
	}

}
