package MyStreaming;

public class Filmes {
    String nome;
    int anoLancamento;
    boolean incluidNoPlano;
    double somaAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


    void exibeFichaTecnica(){
        System.out.println("Nome: "+ this.nome);
        System.out.println("Ano: "+this.anoLancamento);
        System.out.println("Duração: "+ this.anoLancamento + "min");
    }

    void avalia(double nota){
        this.somaAvaliacoes += nota; //será usado para média
        totalDeAvaliacoes++; // quant avaliaçõe - dividirá a soma
    }

    double mediaAvaliacoes(){
        double media = somaAvaliacoes/totalDeAvaliacoes;
        return media;
    }

}
