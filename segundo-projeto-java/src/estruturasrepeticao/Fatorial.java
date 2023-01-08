package estruturasrepeticao;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, fatorial = 1;
        System.out.println("Insira um valor inteiro:");
        numero = entrada.nextInt();
        for (int i = numero; i > 0; i--) {
            fatorial *= i;
        }
        System.out.println("Fatorial de " + numero + ": " + fatorial);
        entrada.close();
    }
}
