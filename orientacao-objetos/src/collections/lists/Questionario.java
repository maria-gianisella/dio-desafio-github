package collections.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class Questionario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Questao> questoes = new ArrayList<>() {
            {
                add(new Questao("Telefonou para a vítima?"));
                add(new Questao("Eeteve no local do crime?"));
                add(new Questao("Mora perto da vítima?"));
                add(new Questao("Devia para a vítima?"));
                add(new Questao("Já trabalhou com a vítima?"));
            }
        };
        String resposta;
        int respostasPositivas = 0;

        for (Questao questao : questoes) {
            System.out.println(questao.getPergunta());
            resposta = entrada.next();
            questao.setResposta(resposta);
            if (resposta.toLowerCase().equals("sim")) {
                respostasPositivas++;
            }
        }

        if (respostasPositivas == 2) {
            System.out.println("Suspeita");
        } else if (respostasPositivas == 3 || respostasPositivas == 4) {
            System.out.println("Cúmplice");
        } else if (respostasPositivas == 5) {
            System.out.println("Assassina");
        } else {
            System.out.println("Inocente");
        }

        entrada.close();
    }
}