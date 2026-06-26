package sistema_de_usuarios;

public class TestaUsuarios {

	public static void main(String[] args) {
		
		try {
			Usuario usuario1 = new Usuario("Fabio", "fabio@email.com\n");
			usuario1.visualizar();
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			Administrador admin1 = new Administrador("Joao", "joao@email.com", "Gerente de sistema\n");
			admin1.visualizar();
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			Usuario usuario2 = new Usuario("", "teste@email.com");
			usuario2.visualizar();
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try {
			Usuario usuario3 = new Usuario("Carlos", "teste_email.com");
			usuario3.visualizar();
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		

	}

}
