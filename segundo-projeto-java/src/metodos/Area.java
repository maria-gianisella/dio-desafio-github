package metodos;

public class Area {
    public static int calcularArea(int lado) {
        int area = lado * lado;
        return area;
    }

    public static int calcularArea(int base, int altura) {
        int area = base * altura;
        return area;
    }

    public static double calcularArea(int baseMenor, int baseMaior, int altura) {
        double area = ((baseMaior + baseMenor) * altura) / 2.0;
        return area;
    }
}
