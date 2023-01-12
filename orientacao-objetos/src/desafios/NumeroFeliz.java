package desafios;

import java.util.Scanner;

public class NumeroFeliz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int contador = 0;
        int soma = 0;
        String auxiliar;

        auxiliar = Integer.toString(n);

        while (n != 1 && contador < 100) {

            auxiliar = Integer.toString(n);
            soma = 0;
            for (int i = 0; i < auxiliar.length(); i++) {

                soma += Integer.parseInt(String.valueOf(auxiliar.charAt(i)))
                        * Integer.parseInt(String.valueOf(auxiliar.charAt(i)));
            }
            n = soma;
            contador++;
        }

        if (n == 1)
            System.out.println("true");
        else
            System.out.println("false");

        scan.close();

    }
}
