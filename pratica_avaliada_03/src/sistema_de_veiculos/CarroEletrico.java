package sistema_de_veiculos;

public class CarroEletrico extends Carro {
	
	private int nivelBateria;
	private static final int CONSUMO_POR_ACELERACAO = 2;

	
	public CarroEletrico(String modelo, int velocidade, int nivelBateria) {
		super(modelo, velocidade);
		Validacao.validarBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}
	
	public void SetNivelBateria(int nivelBateria) {
		Validacao.validarBateria(nivelBateria);
		this.nivelBateria = nivelBateria;
	}
	
	public void Acelerar(int valor) {
		Validacao.validarAceleracao(valor);
		
		int consumo = valor * CONSUMO_POR_ACELERACAO;
		Validacao.validarConsumo(consumo, nivelBateria);
		
		nivelBateria -= consumo;
		setVelocidade(getVelocidade() + valor);
		
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Nivel da Bateria: " + nivelBateria);
	}

}
