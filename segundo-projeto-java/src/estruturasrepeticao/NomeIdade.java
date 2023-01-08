package estruturasrepeticao;

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = " ";
        int idade;

        while (!nome.equals("0")) {
            System.out.println("Digite o nome:");
            nome = entrada.next();
            System.out.println("Digite a idade:");
            idade = entrada.nextInt();
            System.out.println("Nome: " + nome + ", idade: " + idade);
        }
        entrada.close();

    }
}