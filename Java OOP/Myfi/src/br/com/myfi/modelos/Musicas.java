package br.com.myfi.modelos;

public class Musicas extends Faixa{

    //atributos subclasse
    private String artista;
    private String album;

    //constructor
    public Musicas(String nome, double duracao, String artista, String album, int ano,String formato, boolean curtir){
        this.setNome(nome);
        this.setDuracaoMinutos(duracao);
        this.setArtista(artista);
        this.setAlbum(album);
        this.setAnoLancamento(ano);
        this.setFormato(formato);
        this.setCurtida(curtir);
    }

    //Métodos

    //exibir ficha sobreescrito
    @Override
    public void exibeFicha() {
        System.out.println("");
        System.out.println("Artista: " + artista);
        System.out.println("Música: " + getNome());
        System.out.println("Tempo: " + getDuracaoMinutos() + " min");
        System.out.println("Formato: " + getFormato());
        System.out.println("Álbum: " + album);
        System.out.println("Likes: " + getLikes());
        System.out.println("Deslikes: " + getDeslikes());

    }

    //getters and setters
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
}
