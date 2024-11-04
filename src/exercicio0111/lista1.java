package exercicio0111;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class lista1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 ArrayList<String> cores = new ArrayList<>();
        
               	for (int i = 1; i <= 5; i++) {
               		System.out.print("Digite a cor " + i + ": ");
               		String cor = scanner.nextLine();
               		cores.add(cor);
               	}
               	
               	scanner.close();
               	
               System.out.println("Listar todas as cores: " + cores);
               Collections.sort(cores);
               System.out.println("Ordenar as cores: " + cores);
               
	}

}
