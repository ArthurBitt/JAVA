package Fbr.com.FintechMain;

import br.com.Fintech.Modulos.Endereco;

public class TesteEndereco {
    public static void main(String[] args) {
        Endereco end1 = new Endereco("rua","bairro","cidade","estado","cep");

        System.out.println(end1.toString());


    }


}
