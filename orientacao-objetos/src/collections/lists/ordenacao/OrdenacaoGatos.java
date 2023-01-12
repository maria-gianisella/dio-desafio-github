package collections.lists.ordenacao;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoGatos {

    public static void main(String[] args) {

        ArrayList<Gato> gatos = new ArrayList<>() {
            {
                add(new Gato("Jon", 18, "preto"));
                add(new Gato("Simba", 6, "tigrado"));
                add(new Gato("Jon", 12, "amarelo"));
            }
        };

        System.out.println("Ordem de inserção:");
        System.out.println(gatos);

        System.out.println("Ordem aleatória:");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("Ordem natural (nome):");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("Ordem idade:");
        // Collections.sort(gatos, new ComparatorIdade());
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("Ordem cor:");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("Ordem Nome/Cor/Idade:");
        gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);
    }
}
