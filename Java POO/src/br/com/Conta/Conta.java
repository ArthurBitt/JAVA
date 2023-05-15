package br.com.Conta;

public class Conta {

    //Variáveis Atributos
    String nomeTitular;
    int numConta;
    int numAgencia;
    double saldo = 0;
    Data dataAbertura;
    private static int  quantContas;

    public Conta(Data dataAbertura, String nomeTitular, int numeroConta, int numeroAgencia){
        this.dataAbertura = dataAbertura;
        this.nomeTitular = nomeTitular;
        this.numConta = numeroAgencia;
        this.numAgencia = numeroAgencia;
        Conta.quantContas += 1;
    }
//getters e setters da classe
public static int getQuantContas() {
    return Conta.quantContas;
}

public double getRendimento(){
        double rendimento = this.saldo * 0.1;
        this.saldo += rendimento;
        return this.saldo;
    }

    //Métodos da Classe
    double saca(double valor){
        this.saldo -= valor;
        return this.saldo;
    }

    double deposita(double valor){
        this.saldo += valor;
        return this.saldo;
    }


    void consultaSaldo(){
        System.out.println(this.saldo);
    }

    String recuperaDadosParaImpressao() {
        String dadosImpressos = String.format("""
                ********************************
                    Titular:          %s
                    Conta:            %d
                    Agência:          %d
                    Saldo:            %.2f
                    Data Abertura:    %s
                ********************************                       
                """, nomeTitular, numConta, numAgencia, saldo, Data.recuperaData());
        return dadosImpressos;

    }

}
