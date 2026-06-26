package sistema_de_usuarios;

public class Administrador extends Usuario {

	private String nivelAcesso;

	public Administrador(String nome, String email, String nivelAcesso) {
		super(nome, email);
		this.nivelAcesso = nivelAcesso;
	}

	public String getNivelAcesso() {
		return nivelAcesso;
	}

	public void setNivelAcesso(String nivelAcesso) {
		this.nivelAcesso = nivelAcesso;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Nível de Acesso: " + nivelAcesso);
	}

}
