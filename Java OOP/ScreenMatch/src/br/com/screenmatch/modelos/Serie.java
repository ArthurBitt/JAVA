package br.com.screenmatch.modelos;

import br.com.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private boolean ativa;
    private int episodios;
    private int minutosPorEpisodios;


    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }

    @Override// a sobreescrita de métodos altera os comportamentos determinados pela classes mãe se adequando a especidicação da subclasse
    public int getDuracaoEmMinutos() {
        return temporadas*minutosPorEpisodios*episodios;
    }

    @Override
    public int getclassificacao() {
        return 0;
    }
}
