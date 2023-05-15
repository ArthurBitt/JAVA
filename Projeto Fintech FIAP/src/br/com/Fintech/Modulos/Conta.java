package br.com.Fintech.Modulos;

public class Conta {

    //Variáveis Atributos
    private String nomeTitular;
    private int numConta;
    private int numAgencia;
    private double saldo = 0;
    private Data dataAbertura;
    private static int  quantContas;

    //construtor
    public Conta(Data dataAbertura, String nomeTitular, int numeroConta, int numeroAgencia){
        this.dataAbertura = dataAbertura;
        this.nomeTitular = nomeTitular;
        this.numConta = numeroAgencia;
        this.numAgencia = numeroAgencia;
        Conta.quantContas += 1;
    }

    //getters e setters da classe
    public static int getQuantContas() {


        return quantContas;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRendimento(){
        double rendimento = this.saldo * 0.1;
        this.saldo += rendimento;
        return this.saldo;
    }

    //Métodos da Classe
    public String recuperaDadosParaImpressao() {
        String dadosImpressos = String.format("""
                *************** Conta *****************
                    Titular:          %s
                    Conta:            %d
                    Agência:          %d
                    Saldo:            %.2f
                    Data Abertura:    %s
                **************************************                       
                """, nomeTitular, numConta, numAgencia, saldo, Data.recuperaData());
        return dadosImpressos;

    }

    public double Saca(double valor){
        if (valor <= this.saldo) {
            return this.saldo -= valor;
        }else{
            System.out.println("Valor não disponível para saque");
        }return this.saldo;
    }

    public double deposita(double valor){
        return this.saldo += valor;
    }
}
