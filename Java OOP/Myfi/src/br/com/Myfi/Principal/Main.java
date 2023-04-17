package br.com.Myfi.Principal;

import br.com.Myfi.Modelos.Musicas;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //objetos

        //exemplo objeto instanciado a partir de um construtor
        Musicas musica1 = new Musicas("Way down we go",3.33);
        Musicas musica2 = new Musicas("Hot Blood",3.39);
        Musicas musica3 = new Musicas("Broken Bones",4.06);

        musica1.setFormato(".flac");
        musica1.setAlbum("A/B");
        musica1.setArtista("Kaleo");
        musica1.exibeFicha();

        //Utilizando um Arraylist para adicionar as músicas e println com toString override na classe Musicas para
        // exibir o nome das música na array

//        var listaDeMusicas = new ArrayList<>();
//        listaDeMusicas.add(musica1);
//        listaDeMusicas.add(musica2);
//        listaDeMusicas.add(musica3);
//        System.out.println(listaDeMusicas);


//        objeto instanciado a partir de métodos
//        br.com.myfi.Modelos.Podcasts podcast1 = new br.com.myfi.Modelos.Podcasts();
//        podcast1.setNome("Guia de Carreira");
//        podcast1.setTema("Tech");
//        podcast1.setTituloEpisodio("Java");
//        podcast1.setDuracaoMinutos(61);
//        podcast1.setFormato(".Mp4");
//        podcast1.setParticipantes("""
//                                         Alexandre Aquiles
//                                         Max Arruda
//                                         Jacqueline Oliveira
//                                         Paulo Silveira
//                                                        """);
//
//        podcast1.setSinopse("4º ep. da temporada! Com o Guia de Carreira Java, saiba o que é e para que serve o Java e descubra o passo a passo para sair do INICIANTE ao AVANÇADO. Desde os fundamentos e a Orientação a Objetos (POO), passando por testes, pacotes e coleções, até mergulhos mais profundos nessa linguagem de programação que você vai se interessar, como: Spring Framework e Spring Boot, velocidade de Compilação, JVM, Maven, Padrões de Projeto, SOLID, SQL, Kafka, Microsserviços, JUnit, Mock, Git, GitHub e muito mais!");
//
//        podcast1.exibeFicha();



    }
}