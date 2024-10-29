package exercicios2910;

import java.text.DecimalFormat;
import java.util.Scanner;

public class lista2_02 {

	public static void main(String[] args) {
		
		int num1, num2, operacao;
		double total = 0;
		Scanner escreva = new Scanner(System.in);
		
        System.out.println("Digite o 1 número: ");
        num1 = escreva.nextInt();
        
        System.out.println("Digite o 2 número: ");
        num2 = escreva.nextInt();
        
        System.out.println("# escolha a operação #");
        System.out.println("-- 1 Soma --");
        System.out.println("-- 2 Subtração --");
        System.out.println("-- 3 Multiplicação --");
        System.out.println("-- 4 Divisão --");
        
        System.out.println("Digite as operacao ");
        operacao = escreva.nextInt();
        
        // DecimalFormat df = new DecimalFormat("0.00");
        
        switch (operacao) {
        
        case 1: 
        	total = num1 + num2;
        	System.out.println( " Resultado da soma: " + (total));
        	break;
        case 2: 
        	total = num1 - num2;
        	System.out.println( "Resultado da Subtração: " + (total));
        	break;
        case 3: 
        	total = num1 * num2;
        	System.out.println( "Resultado da multiplicação: " + (total));
        	break;
        case 4: 
        	total = num1 / num2;
        	System.out.println( "Resultado da divisão é: " + (total));
        	break;
        default:
        	System.out.println("Número inválido");
        	break;
        }
        escreva.close();
		
	}

}
