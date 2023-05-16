package br.com.Fintech.Modulos;
import java.util.Random;
public class Clientes {
    private String nome;
    private Endereco endereco;
    private int identificador;


    //construtores
    public Clientes(String nomeTitular){
        this.nome = nomeTitular;
        Random rand = new Random();
        this.identificador = rand.nextInt();

    }

    public Clientes(Clientes nome, Endereco endereco){
        Random rand = new Random();
        this.identificador = rand.nextInt();
        this.endereco = endereco;
        this.nome = this.nome;
    }

//getters e setters
    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public int getIdentificador() {
        return identificador;
    }

    //métodos da classe




    @Override
    public String toString() {
        return this.nome + "\nidentificador: " + getIdentificador();
    }



}

