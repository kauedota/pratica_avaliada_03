package sistema_de_veiculos;

public class TestaCarros {
    
    public static void main(String[] args) {

        CarroEletrico carro1 = new CarroEletrico("Tesla Model 3", 30, 20);
        carro1.visualizar();
        
        try {
            carro1.Acelerar(5);
            System.out.println("Aceleração realizada com sucesso!");
        } catch (IllegalArgumentException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
        System.out.println("------------------------------");
        
        CarroEletrico carro2 = new CarroEletrico("Nissan Leaf", 0, 50);
        carro2.visualizar();
        
        try {
            carro2.Acelerar(-10);
            System.out.println("Aceleração realizada com sucesso!");
        } catch (IllegalArgumentException erro) {
            System.out.println("Erro: " + erro.getMessage());
        }
        System.out.println("------------------------------");
        
        CarroEletrico carro3 = new CarroEletrico("Chevrolet Bolt", 0, 10);
        carro3.visualizar();
        
        try {
            carro3.Acelerar(10);
            System.out.println("Depois da aceleração: ");
            carro3.visualizar();
        } catch (IllegalArgumentException erro) {
            System.out.println("Depois da aceleração: ");
            System.out.println("Erro: " + erro.getMessage());
        }
        System.out.println("------------------------------");
        
        System.out.println("Nível de bateria negativo");
        String modelo4 = "BMW i3";
        System.out.println("Tentando criar carro: " + modelo4);
        
        try {
            CarroEletrico carro4 = new CarroEletrico(modelo4, 0, -5);
            carro4.visualizar();
        } catch (IllegalArgumentException erro) {
            System.out.println("Erro no carro " + modelo4 + ": " + erro.getMessage());
        }
        System.out.println("------------------------------");
        
        System.out.println("Nível de bateria acima de 100");
        String modelo5 = "Audi e-tron";
        System.out.println("Tentando criar carro: " + modelo5);
        
        try {
            CarroEletrico carro5 = new CarroEletrico(modelo5, 0, 120);
            carro5.visualizar();
        } catch (IllegalArgumentException erro) {
            System.out.println("Erro no carro " + modelo5 + ": " + erro.getMessage());
        }
        System.out.println("------------------------------");
    }
}
