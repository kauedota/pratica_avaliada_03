package sistema_de_usuarios;

public class Validacao {

	public static void validarNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("Nome inválido. O nome não pode ser vazio.");
		}
	}
	
	public static void validarEmail(String email) {
		if (email == null || email.trim().isEmpty()) {
			throw new IllegalArgumentException("Email inválido. O email não pode ser vazio.");
		}
		if (!email.contains("@")) {
			throw new IllegalArgumentException("Email inválido. O email deve conter o caractere '@'.");
		}
	}
}
