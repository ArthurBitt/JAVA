// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //objetos
        Musicas musica1 = new Musicas();
        musica1.setNome("Way down we go");
        musica1.setDuracaoMinutos(3.33);
        musica1.setAnoLancamento(2016);
        musica1.setAlbum("A/B");
        musica1.setArtista("Kaleo");
        musica1.setFormato(".flac");

        musica1.setCurtida(true);
        musica1.setCurtida(true);
        musica1.setCurtida(true);
        musica1.setCurtida(false);
        musica1.exibeFicha();
        musica1.reproduzir();


//        Podcasts podcast1 = new Podcasts();
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