package sistema_de_notificacoes;

public class NotificacaoSms extends Notificacao {

	public NotificacaoSms(String telefone) {
		super(telefone);

	}

	@Override
	public void enviar(String mensagem) {
		Validacao.validarMensagem(mensagem);
		System.out.println("Enviando notificação por SMS para: " + getDestinatario() + " (simulação de envio de SMS)" + mensagem);
	}

}
