package desafios;

import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();
        int jogadaInimigo = leitor.nextInt();

        if (jogadaJogador == jogadaInimigo)
            System.out.println("Empatou");
        else if (jogadaJogador == 1) {
            if (jogadaInimigo == 2)
                System.out.println("Perdeu");
            else
                System.out.println("Ganhou");
        } else if (jogadaJogador == 2) {
            if (jogadaInimigo == 1)
                System.out.println("Ganhou");
            else
                System.out.println("Perdeu");
        } else if (jogadaJogador == 3) {
            if (jogadaInimigo == 1)
                System.out.println("Perdeu");
            else
                System.out.println("Ganhou");
        }

        leitor.close();
    }
}
