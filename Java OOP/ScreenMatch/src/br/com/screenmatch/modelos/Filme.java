package br.com.screenmatch.modelos;

public class Filme extends Titulo { //TTodo filme é um título
    // classes filhas só contém o que a superclasse não contém, isto é, suas excessões apenas.

    //Atributos classe filme
    private String diretor;

    //métodos getter e setter para o atributo diretor
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;


    }
}




