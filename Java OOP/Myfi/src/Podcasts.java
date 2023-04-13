public class Podcasts extends Faixa{

    //atributos subclasse
        private String participantes;
        private String tema;
        private String sinopse;
        private String tituloEpisodio;


        //Métodos

    //exibir ficha sobreescrito
    @Override
    public void exibeFicha() {
        System.out.println("");
        System.out.println("Nome: " + getNome());
        System.out.println("Ano: " + getAnoLancamento());
        System.out.println("Tema: " + tema);
        System.out.println("Título episódio: " + tituloEpisodio);
        System.out.println("Participantes: " + participantes);
        System.out.println("Formato: " + getFormato());
        System.out.println("Tempo: " + getDuracaoMinutos() + " Min");
        System.out.println("\nSinopse: " + sinopse);




    }

    //getters and setters
    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getTituloEpisodio() {
        return tituloEpisodio;
    }

    public void setTituloEpisodio(String tituloEpisodio) {
        this.tituloEpisodio = tituloEpisodio;
    }
}
