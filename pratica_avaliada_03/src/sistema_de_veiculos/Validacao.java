package sistema_de_veiculos;

public class Validacao {
	
	public static void validarAceleracao(int valor) {
		
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor inválido. Não é possível acelerar com valor zero ou negativo.");
		}
	}
	
	public static void validarBateria(int nivelBateria) {
		if (nivelBateria < 0 || nivelBateria > 100) {
			throw new IllegalArgumentException("Valor inválido. O nível da bateria deve estar entre 0 e 100.");
		}
	}
	
	public static void validarConsumo(int consumo, int nivelBateria) {
		if (consumo > nivelBateria) {
			throw new IllegalArgumentException("Valor inválido. consumo não pode ser maior do que o nível da bateria");
		}
	}

}
