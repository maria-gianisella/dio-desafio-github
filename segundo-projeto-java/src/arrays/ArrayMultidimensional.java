package arrays;

import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matriz = new int[4][4];
        int menor = 10, linha = 0, coluna = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int numero = random.nextInt(10);
                matriz[i][j] = numero;
                if (menor > numero) {
                    menor = numero;
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("Matriz: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("Menor numero: " + menor + " linha: " + linha + ", coluna: " + coluna);
    }
}
