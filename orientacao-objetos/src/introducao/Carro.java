package introducao;

public class Carro extends Veiculo {

    public Carro(String cor, String modelo, int capacidadeTanque) {
        super(cor, modelo, capacidadeTanque);
    }

    public Carro(String cor, String modelo) {
        super(cor, modelo, 50);
    }
}
