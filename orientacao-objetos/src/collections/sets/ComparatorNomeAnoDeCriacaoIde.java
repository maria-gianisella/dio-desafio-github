package collections.sets;

import java.util.Comparator;

public class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        int nome = lf1.getNome().compareToIgnoreCase(lf2.getNome());
        int anoDeCriacao = Integer.compare(lf1.getAnoDeCriacao(), lf2.getAnoDeCriacao());
        if (nome != 0)
            return nome;
        if (anoDeCriacao != 0)
            return anoDeCriacao;
        return lf1.getIde().compareToIgnoreCase(lf2.getIde());
    }

}
