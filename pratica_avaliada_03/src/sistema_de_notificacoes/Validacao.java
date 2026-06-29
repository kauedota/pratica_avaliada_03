package sistema_de_notificacoes;

public class Validacao {
	public static void validarMensagem(String mensagem) {
		if (mensagem == null || mensagem.trim().isEmpty()) {
			throw new IllegalArgumentException("A mensagem não pode ser vazia.");
		}
	}	
		
	public static void validarDestinatario(String destinatario) {
		if (destinatario == null || destinatario.trim().isEmpty()) {
			throw new IllegalArgumentException("O destinatário não pode ser vazio.");
		}
		String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
		
		String regexTelefone = "^\\+?[0-9]{10,15}$";
		
		if (!destinatario.matches(emailRegex) && !destinatario.matches(regexTelefone)) {
			throw new IllegalArgumentException("O destinatário deve ser um email ou número de telefone válido.");
		}
	}
	
}
