public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Data data = new Data();

        conta1.nomeTitular = "Arthur";
        conta1.numConta = 12345;
        conta1.numAgencia = 1;
        conta1.saldo = 1000;
        conta1.dataAbertura = data;

        Conta conta2 = new Conta();
        conta2.nomeTitular = "Arthur";
        conta2.numConta = 12345;
        conta2.numAgencia = 1;
        conta2.saldo = 1000;

        System.out.println(conta1.recuperaDadosParaImpressao());
        System.out.println(conta1.dataAbertura);
        conta1 = conta2;

        if (conta1 == conta2){
            System.out.println("iguais!");
        }else{
            System.out.println("Diferentes");


        }

    }
}