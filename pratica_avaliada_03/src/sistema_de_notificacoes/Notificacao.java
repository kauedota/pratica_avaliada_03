package sistema_de_notificacoes;

public class Notificacao {
	
	String destinatario;

	public Notificacao(String destinatario) {
		Validacao.validarDestinatario(destinatario);
		this.destinatario = destinatario;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		Validacao.validarDestinatario(destinatario);
		this.destinatario = destinatario;
	}
	
	public void enviar(String mensagem) {
		Validacao.validarMensagem(mensagem);
		System.out.println("Enviando notificação para: " + destinatario + " (simulação de envio)" + mensagem);
	}
	


}
