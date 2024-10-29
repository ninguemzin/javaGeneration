package lacoscondicionais;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		Scanner escrever = new Scanner(System.in);
		float nota1, nota2, media, cont = 0;
		
		System.out.println("Digite a nota da P1: ");
		nota1 = escrever.nextFloat();
		
		System.out.println("Digite a nota da P2: ");
		nota2 = escrever.nextFloat();
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 5) {
			cont ++;
			System.out.println(cont + "Parabéns você foi apovado!");
		} else {
			System.out.println(cont + "Reprovado, estude mais!");
		}
		escrever.close();
	}

}
