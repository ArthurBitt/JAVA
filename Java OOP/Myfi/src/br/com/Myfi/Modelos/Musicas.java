package br.com.Myfi.Modelos;

public class Musicas
        extends Faixa {

    //atributos subclasse
    private String artista;
    private String album;

    //constructor subclasse
    public Musicas(String nome, double duracaoMinutos){

        super(nome, duracaoMinutos);
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

    @Override
    public String toString() {
         return "Nome: " + this.getNome();

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
