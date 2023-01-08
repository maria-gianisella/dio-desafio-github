package metodos;

public class AreaTeste {
    public static void main(String[] args) {
        int quadrado = Area.calcularArea(5);
        int retangulo = Area.calcularArea(5, 10);
        double trapezio = Area.calcularArea(5, 10, 2);

        System.out.println("Área do quadrado: " + quadrado);
        System.out.println("Área do retângulo: " + retangulo);
        System.out.println("Área do trapezio: " + trapezio);
    }
}
