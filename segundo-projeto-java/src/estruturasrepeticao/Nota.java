package estruturasrepeticao;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota = 5;

        while (true) {
            System.out.println("Digite uma nota entre 0 e 10");
            nota = entrada.nextDouble();
            if (0 <= nota && 10 >= nota) {
                break;
            }
            System.out.println("Valor inválido.");
        }
        entrada.close();
    }
}
