package sistemasmarttv;

public class SmartTv {
    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTv() {
        ligada = false;
        canal = 1;
        volume = 25;
    }

    public void ligar() {
        if (!this.ligada) {
            this.ligada = true;
        }
        System.out.println("TV Ligada.");
    }

    public void desligar() {
        if (this.ligada) {
            this.ligada = false;
        }
        System.out.println("TV Desligada.");
    }

    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public void aumentarCanal() {
        this.canal++;
    }

    public void diminuirCanal() {
        this.canal--;
    }

    public void mudarCanal(int novoCanal) {
        this.canal = novoCanal;
    }

    public void imprimirStatus() {
        System.out.println("TV Ligada? " + this.isLigada());
        System.out.println("Canal Atual: " + this.getCanal());
        System.out.println("Volume Atual: " + this.getVolume());
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
