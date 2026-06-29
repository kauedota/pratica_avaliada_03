package sistema_de_notificacoes;

public class TestaNotificacoes {

		public static void criarNotificacao(String tipo, String destinatario, String mensagem) {
        try {    
			Validacao.validarDestinatario(destinatario);
            Validacao.validarMensagem(mensagem);
            
            Notificacao notificacao;
            
            if (tipo.equalsIgnoreCase("email")) {
                notificacao = new NotificacaoEmail(destinatario);
            } else if (tipo.equalsIgnoreCase("sms")) {
                notificacao = new NotificacaoSms(destinatario);
            } else {
                throw new IllegalArgumentException("Tipo de notificação inválido.");
            }
            notificacao.enviar(mensagem);
        } catch (IllegalArgumentException erro) {
            System.out.println("Erro: " + erro.getMessage());
            
    }
   }

	public static void main(String[] args) {
        criarNotificacao("Email", "ana@email.com", " - Olá Ana, seja bem-vinda ao nosso sistema!");
        criarNotificacao("SMS", "+5511999999999", " - Olá, seu código é 1234!");
        criarNotificacao("Email", "", " - Mensagem sem destinatário");
        criarNotificacao("SMS", "+5511999999999", "");
        criarNotificacao("Email", "anaemail.com", "Destinatário inválido");
        criarNotificacao("Push", "teste@teste.com", "Mensagem");
        
	}
}
