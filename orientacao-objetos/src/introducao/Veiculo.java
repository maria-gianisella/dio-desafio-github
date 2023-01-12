package introducao;

public class Veiculo {
    protected String cor;
    protected String modelo;
    protected int capacidadeTanque;

    public Veiculo(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    public void calcularValorEncherTanque(double valorGasolina) {
        double valor = this.getCapacidadeTanque() * valorGasolina;
        System.out.println("Valor a ser pago: " + valor);
    }

    public void imprimirRelatorio() {
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Capacidade do tanque: " + capacidadeTanque + " litros.");
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

}
