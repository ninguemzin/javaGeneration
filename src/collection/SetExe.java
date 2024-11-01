package collection;

import java.util.HashSet;
import java.util.Scanner;

public class SetExe {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		// Cria a Collection Set, do tipo String chamada setFrutas
        HashSet<String> setFrutas = new HashSet<String>();
 
                // Adiciona algumas frutas na Colection Set
                setFrutas.add("Abacate");
                setFrutas.add("Banana");
                setFrutas.add("Jaboticaba");
                setFrutas.add("Kiwi");
                setFrutas.add("Maçã");
                setFrutas.add("Morango");
                setFrutas.add("Pêra");
                setFrutas.add("Jaboticaba");
                setFrutas.add("Kiwi");
 
                System.out.println(setFrutas);
                
                System.out.println("Digite o nome de fruto: " );
                setFrutas.add(scanner.nextLine());
                
                System.out.println("Digite o nome de fruto: " );
                setFrutas.add(scanner.nextLine());
                
                System.out.println(setFrutas);
                
                System.out.println("\nExiste a fruta Kiwi?" + setFrutas.contains("Kiwi"));
                
                System.out.println("\nA Colection Set está vazia?" + setFrutas.isEmpty());
                
                setFrutas.clear();
                
                System.out.println("\nA Colection Set está vazia?" + setFrutas.isEmpty());
	}

}
