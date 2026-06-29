package sistema_de_notificacoes;

public class NotificacaoEmail extends Notificacao {
	
	public NotificacaoEmail(String email) {
		super(email);
		
	}

	@Override
	public void enviar(String mensagem) {
		Validacao.validarMensagem(mensagem);
		System.out.println("Enviando notificação por email para: " + getDestinatario() + " (simulação de envio de email)" + mensagem);
	}
}
