package estruturasrepeticao;

import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, soma = 0, maior = 0, contador = 0;
        double media;
        do {
            System.out.println("Digite o numero: ");
            numero = entrada.nextInt();
            soma += numero;
            if (maior < numero)
                maior = numero;
            contador++;
        } while (contador < 5);
        media = soma / 5.0;
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        entrada.close();
    }
}
