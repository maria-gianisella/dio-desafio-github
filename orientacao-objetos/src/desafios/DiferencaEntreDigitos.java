package desafios;

import java.util.Arrays;
import java.util.Scanner;

public class DiferencaEntreDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");

        int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

        int produto = 1;
        int soma = 0;

        for (int i = 0; i < ints.length; i++) {
            produto *= ints[i];
            soma += ints[i];
        }

        int diferenca = produto - soma;

        System.out.println(diferenca);

        scan.close();
    }
}
