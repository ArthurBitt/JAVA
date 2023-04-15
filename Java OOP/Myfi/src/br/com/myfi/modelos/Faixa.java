package br.com.myfi.modelos;

public class Faixa {

                                                                        //atributos superclasse

    private String nome;
    private String formato;
    private double duracaoMinutos;
    private int anoLancamento;
    private double i = 0.1;
    private boolean curtida;
    private int likes;
    private int deslikes;

                                                                            //Métodos

    //exibir ficha
    public void exibeFicha(){
        System.out.println();
    }

    //reproduzir
    public double reproduzir() {
       while (i < duracaoMinutos) {
           System.out.println(String.format("...reproduzindo %.2f min", i += 0.01));
       }
        return i;
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(double duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public int setCurtida(boolean curtida) {
        this.curtida = curtida;
        if (curtida == true){

            likes ++;
            return likes;


        }else{

            return deslikes++;
        }

    }

    public int getLikes() {
        return likes;
    }

    public int getDeslikes() {
        return deslikes;
    }


}



