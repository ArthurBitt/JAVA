import java.util.Scanner;

public class app_contabancaria {
    public static void main(String[] args) {
        //inicializar dados do cliente
        //menu de opções vizualizar, depositar, tranferir e sair
       //envia valor
       //recebe valor
        Scanner sc = new Scanner(System.in);
        int resposta = 0;
        double saldo = 2500;
        double valor = 0;


        System.out.println("**********************************************");
        System.out.println(String.format(""" 
                                Dados iniciais do Cliente:
                                
                                Nome:               Arthur Bittencourt
                                Tipo de Conta:      Conta Corrente
                                Saldo Inicial:      %.2f
                                """, saldo));
        System.out.println("***********************************************");



        while (resposta!=4){

            System.out.println("""
                                
                                Operações
                                
                                1- Consultar Valores
                                2- Receber Valor
                                3- Transferir Valor
                                4- Sair""");


            System.out.println("\n Digite a opção desejada?: ");

            resposta = sc.nextInt();

            if (resposta > 4 || resposta < 1){
                System.out.println("\n Opção inválida!");

            } else {

                switch (resposta) {

                    case 1:
                        resposta = 1;
                        System.out.println(String.format("Seu saldo atual é de: %.2f R$", saldo));
                        break;

                    case 2:
                        resposta = 2;
                        System.out.println("\nDigite o valor que deseja depositar: ");
                        valor = sc.nextDouble();
                        saldo += valor;
                        System.out.println(String.format("\nSeu saldo atual é de: %.2f", saldo));
                        break;

                    case 3:
                        resposta = 3;
                        System.out.println("Digite o valor que deseja transferir: ");
                        valor = sc.nextDouble();
                        saldo -= valor;
                        System.out.println(String.format("seu saldo atual é de %.2f R$", saldo));
                        break;

                    case 4:
                        resposta = 4;
                        System.out.println("...Saindo");
                        break;
             }

            }
        }
    }

}
