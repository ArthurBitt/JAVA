import java.util.Scanner;
import br.com.Fintech.Conta;
import br.com.Fintech.Data;
import br.com.Fintech.Token;
import br.com.Fintech.Menu;

public class TesteFintechApp {
    public static void main(String[] args) {


//instancias
        Menu menu = new Menu();
        Data data = new Data(14, 05, 2023);
        Conta conta1 = new Conta(data, "Arthur", 1234, 6);
        Token password = new Token("abc");

//variaveis da main
        Conta conta = conta1;
        int i = 0;
        String inicializar;
        Scanner sc = new Scanner(System.in);


        System.out.println("Deseja iniciar a aplicação S/N: ");
        inicializar = sc.nextLine().toUpperCase();
        while (inicializar.equals("S") && i != 4) {
            password.validaToken();
            while (i != 4 || password.validaToken() != false) {
                conta1.recuperaDadosParaImpressao();
                menu.chamaMenu();
                i = sc.nextInt();
                switch (i) {
                    case 1:
                        System.out.println("...Consultando Saldo");
                        System.out.println(String.format("Saldo: " + conta.getSaldo()));
                        ;
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
                    default:
                        System.out.println("...opção inválida");
                        break;

                }//fim switch
                if (!inicializar.equals("S")) {
                    break;
                }// fim main while
            }//fim if else entrada
        }//fim while entrada
    }//fim main
}





