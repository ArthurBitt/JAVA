import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;


public class Main {
    public static void main(String[] args) {
        //objeto serie - extends titulo
        Serie theWalkinDead = new Serie();

        theWalkinDead.setNome("The Walking Dead");
        theWalkinDead.setAnoDeLancamento(2010);
        theWalkinDead.setTemporadas(11);
        theWalkinDead.setMinutosPorEpisodios(50);
        theWalkinDead.setEpisodios(300);
        System.out.println("dd" + theWalkinDead.getDuracaoEmMinutos());

        //
        theWalkinDead.avalia(8);
        theWalkinDead.avalia(5);
        theWalkinDead.avalia(10);

       theWalkinDead.exibeFichaTecnica();


        /*System.out.println(String.format("Nome: %s",theWalkinDead.getNome()));
        System.out.println(String.format("Ano: %d",theWalkinDead.getAnoDeLancamento()));
        System.out.println(String.format("Duração: %d",theWalkinDead.getDuracaoEmMinutos()));*/

        //objeto classe filme - extends titulo
        Filme filme1 = new Filme();
        filme1.setNome("How to train your dragon");// objeto.setter recebe valor
        filme1.setDuracaoEmMinutos(120);
        filme1.setAnoDeLancamento(2008);
        filme1.setDiretor("Arthur");
        System.out.println(filme1.getDuracaoEmMinutos());
        //filme1.teste = 1; //objeto.atributo recebe valor


        //filme1.exibeFichaTecnica();// chamada de método definido como public em outro packge
        filme1.avalia(8);// objeto acessa método e passa parâmetro int
        filme1.avalia(5);
        filme1.avalia(10);

        filme1.exibeFichaTecnica();

        /*//Getters - pegam o valor atribuído aos atributos do objeto filme pelos setters
        System.out.println(String.format("Nome: %s",filme1.getNome()));
        System.out.println(String.format("Ano: %d",filme1.getAnoDeLancamento()));
        System.out.println(String.format("Duração: %d",filme1.getDuracaoEmMinutos()));
        System.out.println(String.format("Diretor: %s",filme1.getDiretor()));
        //get os valores recebidos pelo método avalia e gera o total das avaliações por totalDeAvaliacoes++;
        System.out.println(String.format("Total de Avaliações: %d",filme1.getTotalDeAvaliacoes()));
        //executa o método pegamedia
        System.out.println(String.format("Média avaliação: %.2f", filme1.pegaMedia()));*/
    }
}

