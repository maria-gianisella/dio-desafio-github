package sistemasmarttv;

public class SistemaTeste {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        smartTv.imprimirStatus();

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.imprimirStatus();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        smartTv.imprimirStatus();

        smartTv.mudarCanal(13);

        smartTv.imprimirStatus();
    }
}
