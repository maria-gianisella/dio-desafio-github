package metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int S = input.nextInt();

        int porcentagem = 100 - (100 * S) / M;

        System.out.println("O desconto foi de " + porcentagem + "%");

    }
}