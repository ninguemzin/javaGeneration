package exercicios2910;

public class lista1_01 {

	public static void main(String[] args) {
		int a = 2, b = 2, c = 4, soma;
		soma = a + b;
		if (c < soma) {
			System.out.println(soma + " é maior que " + c);
		} else if (c == soma) {
			System.out.println(soma + " é igual " + c);
		} else {
			System.out.println(soma + " é menor que a" + c);
		}
	}

}
