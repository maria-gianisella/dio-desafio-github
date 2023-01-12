package introducao;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Vermelho", "UNO", 50);
        Carro carro2 = new Carro("Branco", "Celta");

        carro2.setCapacidadeTanque(55);
        carro1.imprimirRelatorio();
        carro2.imprimirRelatorio();

        carro1.calcularValorEncherTanque(5.55);
        carro2.calcularValorEncherTanque(5.55);
    }
}
