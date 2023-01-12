package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class OrdenacaoSeries {
    public static void main(String[] args) {

        System.out.println("Ordem aleatória:");
        Set<Serie> series = new HashSet<>() {
            {
                add(new Serie("got", "fantasia", 60));
                add(new Serie("dark", "drama", 60));
                add(new Serie("that 70s show", "comedia", 25));

            }
        };

        for (Serie serie : series)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("Ordem inserção:");
        Set<Serie> series1 = new LinkedHashSet<>() {
            {
                add(new Serie("got", "fantasia", 60));
                add(new Serie("dark", "drama", 60));
                add(new Serie("that 70s show", "comedia", 25));

            }
        };

        for (Serie serie : series1)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("Ordem natural (Tempo de episódio)");
        Set<Serie> series2 = new TreeSet<>(series1);
        for (Serie serie : series2)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

        System.out.println("Ordem Nome/Gênero/Tempo de episódio");
        Set<Serie> series3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        series3.addAll(series);
        for (Serie serie : series3)
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());

    }
}
