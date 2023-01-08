package estruturasrepeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        while (1 > numero || 10 < numero) {
            System.out.println("Digite um número entre 1 e 10:");
            numero = entrada.nextInt();
        }
        System.out.println("Tabuada do " + numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + (numero * i));
        }
        entrada.close();
    }
}
