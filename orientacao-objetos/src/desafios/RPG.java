package desafios;

import java.util.Scanner;

public class RPG {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int dados = leitor.nextInt();
        int vidaDoJogador = leitor.nextInt();
        int ataqueDoJogador = leitor.nextInt();
        int defesaDoJogador = leitor.nextInt();
        int vidaDoInimigo = leitor.nextInt();
        int ataqueDoInimigo = leitor.nextInt();

        if (dados != 9)
            vidaDoJogador -= ataqueDoInimigo - (defesaDoJogador + dados);
        else
            vidaDoJogador -= ataqueDoInimigo - (defesaDoJogador + dados) * 2;

        if (vidaDoJogador <= 0)
            System.out.println("Jogador nao sobreviveu");
        else {
            if (dados != 9)
                vidaDoInimigo -= ataqueDoJogador + dados;
            else
                vidaDoInimigo -= (ataqueDoJogador + dados) * 2;

            if (vidaDoInimigo <= 0)
                System.out.println("Jogador sobreviveu e derrotou o inimigo");
            else
                System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
        }

        leitor.close();
    }
}
