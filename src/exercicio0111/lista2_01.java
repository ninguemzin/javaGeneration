package exercicio0111;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class lista2_01 {

	public static void main(String[] args) {
		Set<Integer> numeros = new LinkedHashSet<>();
		Set<Integer> repetidos = new LinkedHashSet<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 10 números inteiros:");

		for (int i = 0; i < 10; i++) {
			System.out.print("Digite um número: ");
			int numero = scanner.nextInt();

			if (!numeros.add(numero)) {
				repetidos.add(numero);
			}
		}

		Set<Integer> conjuntoParaExibir = repetidos.isEmpty() ? numeros : repetidos;

		ArrayList<Integer> listaOrdenada = new ArrayList<>(conjuntoParaExibir);
		Collections.sort(listaOrdenada);

		System.out.println("\nListar dados do Set em ordem:");
		Iterator<Integer> iterator = listaOrdenada.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		scanner.close();
	}

}
