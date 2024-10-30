package lacosderepeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String usuarioCorreto = "admin";
		String senhaCorreta = "12345";
		boolean autenticado = false;

		do {
			System.out.print("Digite o nome do usuário: ");
			String usuario = scan.nextLine();

			System.out.print("Digite a senha: ");
			String senha = scan.nextLine();

			if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
				System.out.println("Autenticacao correta");
			} else {
				System.out.println("Autenticacao incorreta");
				System.out.print("\nDeseja tentar dnv (s/n): ");
				String continuar = scan.next().toUpperCase();
				if (continuar.equals("S")) {
					autenticado = true;
					scan.nextLine();
				}else {
					autenticado = false;
					System.out.println("não consegue ne");
				}
			}
		} while (autenticado);
		scan.close();

	}

}
