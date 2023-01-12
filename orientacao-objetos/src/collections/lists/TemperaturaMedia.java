package collections.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class TemperaturaMedia {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Mes> meses = new ArrayList<>() {
            {
                add(new Mes("Janeiro"));
                add(new Mes("Fevereiro"));
                add(new Mes("Março"));
                add(new Mes("Abril"));
                add(new Mes("Maio"));
                add(new Mes("Junho"));
            }
        };
        double temperatura, soma = 0, media;

        System.out.println("Insira a temperatura média dos 6 primeiros meses do ano:");
        for (Mes mes : meses) {
            temperatura = entrada.nextDouble();
            soma += temperatura;
            mes.setTemperaturaMedia(temperatura);
        }

        media = soma / meses.size();
        System.out.println("Média da temperatura semestral: " + media + "°C");

        System.out.println("Meses em que a temperatura esteve acima da média:");
        for (Mes mes : meses) {
            if (mes.getTemperaturaMedia() > media) {
                System.out.println(mes.getNome() + ": " + mes.getTemperaturaMedia() + "°C");
            }
        }

        entrada.close();

    }
}
