public class Conta {
    private String titular;
    private double saldo;
    private int numConta;
    private static int quantContas;
    private int numAgencia;
    Conta(String titular){
    }

    Conta(String titular, int numeroConta, int numAgencia){
        this(titular);
        this.numConta = numeroConta;
        this.numAgencia = numAgencia;
    }

    //saca deposita exibe dados


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
                ********************************                       
                """, titular, numConta, numAgencia, saldo);
        return dadosImpressos;






    }
