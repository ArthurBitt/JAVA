package FintechTestes;

import br.com.Fintech.Modulos.Clientes;
import br.com.Fintech.Modulos.Conta;
import br.com.Fintech.Modulos.Data;

public class TesteConta {
    public static void main(String[] args) {
        Data d1 = new Data(1,1,1);
        Clientes c1 = new Clientes("Arthur");
        Conta conta = new Conta(d1,c1,1,1);

        System.out.println(conta.getNomeTitular());

    }





}
