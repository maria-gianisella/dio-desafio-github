package desafios;

import java.util.Scanner;

public class QuantidadeNecessaria {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int n;
        int x;
        int totalPedacos;
        int totalPizzas = 0;

        for (int i = 0; i < T; i++) {
            n = scanner.nextInt();
            x = scanner.nextInt();
            totalPedacos = n * x;
            totalPizzas = totalPedacos / SLICE;
            if (totalPedacos % SLICE > 0)
                totalPizzas++;
        }

        System.out.println(totalPizzas);

        scanner.close();
    }
}
