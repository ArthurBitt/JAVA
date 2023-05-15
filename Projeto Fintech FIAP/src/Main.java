import br.com.Fintech.Conta;
import br.com.Fintech.Data;

public class Main {
    public static void main(String[] args) {

        Data data = new Data(14,05,2023);
        Conta conta1 = new Conta(data,"Arthur",1234,6);
        Conta conta2 = new Conta(data,"Arthur",1234,6);


        System.out.println(conta1.recuperaDadosParaImpressao());
        System.out.println(Conta.getQuantContas());
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getRendimento());





        // se conta2 = conta1  seriam iguais, referencias apontando para mesmo espaço da memória
        if (conta1 == conta2){
            System.out.println("iguais!");
        }else{
            System.out.println("Diferentes");
        }
    }
}