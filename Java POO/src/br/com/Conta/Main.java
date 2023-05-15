package br.com.Conta;

public class Main {
    public static void main(String[] args) {

        Data data = new Data();
        data.dia = 9;
        data.mes = 5;
        data.ano = 2023;
        Conta conta1 = new Conta(data);

        conta1.nomeTitular = "Arthur";
        conta1.numConta = 12345;
        conta1.numAgencia = 1;
        conta1.saldo = 1000;
        conta1.dataAbertura = data;

        Conta conta2 = new Conta(data);
        conta2.nomeTitular = "Arthur";
        conta2.numConta = 12345;
        conta2.numAgencia = 1;
        conta2.saldo = 1000;

        conta1 = conta2;
        System.out.println(conta1.dataAbertura);//sai em hash - precisaria utilizar um override de toString
        if (conta1 == conta2){
            System.out.println("iguais!");
        }else{
            System.out.println("Diferentes");


        }

    }
}