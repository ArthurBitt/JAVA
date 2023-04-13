package br.com.screenmatch.modelos;

public class Titulo { //Superclasse Titulo - contém classes Filmes e Series

    //ATRIBUTOS

    // - INSTANCIÁVEIS - RECEBEM VALOR A CADA NOVA INSTÂNCIA DE OBJETO DA CLASSE - PRECISAM SER SEMPRE PRIVADOS
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    //public int teste;

    //MÉTODOS

    // - SÃO AÇÕES QUE A CLASSE, LOGO SUAS INSTÂNCIAS, EXECUTAM. PODEM SER CHAMADOS ATRAVÉS DE OBJETO.MÉTODO();
    public void exibeFichaTecnica(){ // VOID NÃO RETORNA VALOR, SÓ EXIBE. NÃO GUARDA A INFORMAÇÃO.
        System.out.println(" ");
        System.out.println("Título: " + nome);
        System.out.println("Ano: " + anoDeLancamento);
        System.out.println("Duração: " + duracaoEmMinutos);
        System.out.println("Total de avaliações: " + totalDeAvaliacoes);
        System.out.println(String.format("Media das avaliações: %.2f " , pegaMedia()));
    }


    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    //Getters viabiliza em outros pacotes a exibição de um atributo privado
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    //Setters são métodos que recebem valores para os atributos definidos como privados
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public double pegaMedia() { // QUANDO SE RETORNA VALOR O VOID NÃO PODE SER USADO, O MÉTODO É DECLARADO COM O TIPO DO RETURN.
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }


}
