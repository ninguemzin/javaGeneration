package lacoscondicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int opcao;
		String nome;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
        System.out.println("\n--Digite 1 para ver Indicação de um Livro--");
        System.out.println("--Digite 2 para ler uma Frase Motivacional--");
        System.out.println("--Digite 3 para receber uma Indicação de música--");
        opcao = leia.nextInt();
        
        switch (opcao) {
        
        case 1:
        	System.out.println("Digite o nome do seu livro favorito:");
        	nome = leia.nextLine().toUpperCase();
        	if(nome.equals("ALQUIMISTA")) {
        		System.out.println("Esse livro é top!");
        	} else {
         		System.out.println("Não curti");
        	}
        	break;
        case 2:
        	System.out.println("Frase Motivacional: Nada ta tão ruim que não possa piorar");
        	break;
        case 3:
        	break;
        	
        	default:
        	break;
        }
        
        leia.close();
	}

}
