package br.com.Fintech.Modulos;

/**
 * Classe responsável por gerar as contas
 */
public class Conta {

    //Variáveis Atributos
    private Clientes nomeTitular;
    private int numConta;
    private int numAgencia;
    private double saldo = 0;
    private Data dataAbertura;
    private static int  quantContas;



    //construtor
    public Conta(Data dataAbertura, Clientes nomeTitular, int numeroConta, int numeroAgencia){
        this.dataAbertura = dataAbertura;
        this.nomeTitular = nomeTitular;
        this.numConta = numeroConta;
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

    public Clientes getNomeTitular() {
        return nomeTitular;
    }

    public int getNumConta() {
        return numConta;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public Data getDataAbertura() {
        return dataAbertura;
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
                """, getNomeTitular(), getNumConta(), getNumAgencia(), getSaldo(), Data.recuperaData().toString());
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
