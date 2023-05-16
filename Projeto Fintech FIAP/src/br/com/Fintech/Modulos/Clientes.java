package br.com.Fintech.Modulos;
import java.util.Random;
public class Clientes {
    private String nome;
    private Endereco endereco;
    private int identificador;

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public int getIdentificador() {
        return identificador;
    }

    public Clientes(String nomeTitular){
        this.nome = nomeTitular;
        Random rand = new Random();
        this.identificador = rand.nextInt();

    }

    public Clientes(Endereco endereco, String nome){
        Random rand = new Random();
        this.identificador = rand.nextInt();
        this.endereco = endereco;
        this.nome = this.nome;
        }

}

