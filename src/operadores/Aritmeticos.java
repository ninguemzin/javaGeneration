package operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		int x = 4;
		int y = 2;
		int a = 3;
		int resul;
		
		resul = x * (y + a);
		
		x += y;
		
		resul = x + y;
		
		System.out.println("Resultado é: " + resul);
		System.out.println("Resultado é: " + (y + a));
		System.out.println("Resultado é: " + x);

	}

}
