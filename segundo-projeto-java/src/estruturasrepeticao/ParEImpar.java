package estruturasrepeticao;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, numero, pares = 0, impares = 0, contador = 0;
        System.out.println("Digite o valor de N:");
        n = entrada.nextInt();
        if (n > 0) {
            do {
                System.out.println("Digite o número:");
                numero = entrada.nextInt();
                if (numero % 2 == 0)
                    pares++;
                else
                    impares++;
                contador++;
            } while (contador < n);
            System.out.println("Números pares: " + pares);
            System.out.println("Números ímpares: " + impares);
            entrada.close();
        }
    }
}
