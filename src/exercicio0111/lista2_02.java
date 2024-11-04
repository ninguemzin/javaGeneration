package exercicio0111;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class lista2_02 {

	public static void main(String[] args) {
		
		Set<Integer> numeros = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            numeros.add(i);
        }

        System.out.println("Conteúdo do Set:");
        for (Integer num : numeros) {
            System.out.println(num);
        }

         Scanner scanner = new Scanner(System.in);
        System.out.print("\nDigite o número que você deseja encontrar: ");
        int numeroProcurado = scanner.nextInt();

        if (numeros.contains(numeroProcurado)) {
            System.out.println("O número " + numeroProcurado + " foi encontrado!");
        } else {
            System.out.println("O número " + numeroProcurado + " não foi encontrado!");
        }

        scanner.close();
 
	}

}
