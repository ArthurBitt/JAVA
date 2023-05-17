package Fbr.com.FintechMain;
import java.util.Scanner;

import br.com.Fintech.Modulos.*;

<<<<<<< HEAD
<<<<<<< HEAD:Projeto Fintech FIAP/src/Fbr/com/FintechMain/FintechAppMain.java
/**
 * App main
 */
public class FintechAppMain {
=======
public class TesteFintechApp {
>>>>>>> parent of 573c5f9 (.):Projeto Fintech FIAP/src/Fbr/com/FintechMain/TesteFintechApp.java
=======
public class TesteFintechApp {
>>>>>>> parent of 573c5f9 (.)
    public static void main(String[] args) {


//instancias
        Menu menu = new Menu();
        Data data = new Data(14, 05, 2023);
        Clientes cliente1 = new Clientes("Arthur");
        Conta conta1 = new Conta(data, cliente1, 1234, 6);
        Token password = new Token();
        Scanner sc = new Scanner(System.in);

//variaveis da main
        Conta conta = conta1;
        int i = 0;
        String inicializar;

        //Main Program
        System.out.println("Deseja iniciar a aplicação S/N: ");
        inicializar = sc.nextLine().toUpperCase();
        while (inicializar.equals("S") && i != 4) {
            //Token random
            System.out.println(password.Token());
            password.validaToken();
            System.out.println(conta.recuperaDadosParaImpressao());
            while (i != 4 || password.validaToken() != false) {
                conta1.recuperaDadosParaImpressao();
                menu.chamaMenu();
                i = sc.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("...Consultando Saldo");
                        System.out.println(String.format("Saldo: " + conta.getSaldo()));
                        break;
                    case 2:
                        System.out.println("valor a depositar: ");
                        conta.deposita(sc.nextDouble());
                        break;
                    case 3:
                        System.out.println("Valor do saque: ");
                        conta.Saca(sc.nextDouble());
                        break;
                    case 4:
                        System.out.println("...");
                        if (i == 4) {
                            System.out.println("Não deseja se manter na aplicação: N/S ");
                            inicializar = sc.next().toUpperCase();
                        }
                        if (inicializar.equals("N")) {
                            System.out.printf("...Saindo");
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        System.out.println(conta.recuperaDadosParaImpressao());
                        break;
                    case 6:
                        System.out.println("Rendimentos: " + conta.getRendimento());
                        break;
                    default:
                        System.out.println("...opção inválida");
                        break;

                }//fim switch
                if (!inicializar.equals("S")) {
                    break;
                }// fim verificação inicializar
            }//fim segundo while
        }//fim while entrada
    }//fim main
}//fim classe





