package br.com.Conta;

public class Conta {

    //Variáveis Atributos
    String nomeTitular;
    int numConta;
    int numAgencia;
    double saldo;
    Data dataAbertura;


    public Conta(Data dataAbertura){
        this.dataAbertura = dataAbertura;
    }

    //Métodos da Classe
    // saca;deposita;calculaRendimento(saldox0.1 - regra )


    double saca(double valor){
        this.saldo -= valor;
        return this.saldo;
    }

    double deposita(double valor){
        this.saldo += valor;
        return this.saldo;
    }

    double calculaRendimento(){
        double rendimento = this.saldo * 0.1;
        this.saldo += rendimento;
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
                    Data:             %d
                ********************************                       
                """, nomeTitular, numConta, numAgencia, saldo,dataAbertura);
        return dadosImpressos;



    }

}
