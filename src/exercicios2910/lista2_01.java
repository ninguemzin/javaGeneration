package exercicios2910;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lista2_01 {

	public static void main(String[] args) {
		int cd_pruduto, quantidade;
		double total = 0.00;
		Scanner escreva = new Scanner(System.in);
		
		System.out.println("# ## #### Lanchonete do Ari #### ## #");
        System.out.println("\n--Escolha o numero dos prudutos e a quantidade");
        System.out.println("-- 1 - Cachorro Quente - R$ 10.00 --");
        System.out.println("-- 2 - X-Salada - R$ 15.00 --");
        System.out.println("-- 3 - X-Bacon - R$ 18.00 --");
        System.out.println("-- 4 - Bauru - R$ 12.00 --");
        System.out.println("-- 5 - Refrigerante - R$ 8.00 --");
        System.out.println("-- 5 - Refrigerante - R$ 8.00 --");
        System.out.println("-- 6 - Suco de laranja - R$ 13.00 --");
        
        System.out.println("Digite o número do produto: ");
        cd_pruduto = escreva.nextInt();
        System.out.println("Digite a quantidade desse produto");
        quantidade = escreva.nextInt();
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        switch (cd_pruduto) {
        
        case 1: 
        	total = 10.00 * quantidade;
        	System.out.println( quantidade + " Cachorro Quente - Total: R$ " + df.format(total));
        	break;
        case 2: 
        	total = 15.00 * quantidade;
        	System.out.println( quantidade + " X-Salada - Total: R$ " + df.format(total));
        	break;
        case 3: 
        	total = 18.00 * quantidade;
        	System.out.println( quantidade + " X-Bacon - Total: R$ " + df.format(total));
        	break;
        case 4: 
        	total = 12.00 * quantidade;
        	System.out.println( quantidade + " X-Bauru - Total: R$ " + df.format(total));
        	break;
        case 5: 
        	total = 8.00 * quantidade;
        	System.out.println( quantidade + " Refrigerante - Total: R$ " + df.format(total));
        	break;
        case 6: 
        	total = 13.00 * quantidade;
        	System.out.println( quantidade + " Suco de laranja - Total: R$ " + df.format(total));
        	break;
        default:
        	System.out.println(" Código inválido");
        	break;
        }
        escreva.close();
        
	}

}
