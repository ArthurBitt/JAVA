import java.util.Scanner;

public class ExercicioPraticoConceitos {
    public static void main(String[] args) {
        int i = 0;
        int menu = 0;
        double saldo = 2500;
        double valor = 0;
        String nome;
        String token;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira seu Token de acesso com 3 dígitos: [xxx] ");
        token = sc.nextLine();


            if (token.equals("abc")) {
                System.out.println("""
                                                            
                        Token digitado corretamente!
                                                            
                        ...carregando aplicação
                                                            
                        """);
                while (i != 4) {
                    System.out.println("""
                                                
                                                
                            ***************** DADOS CLIENTE ****************
                            Cliente                     Arthur Bittencourt
                            Tipo da Conta               Conta Corrente
                            Saldo Disponível            R$     2500,00    
                            ************************************************ 
                                                
                                                
                            """);


                    System.out.println("""
                                                    
                                                    
                            ********* MENU **********
                            1- Consultar Saldo
                            2- Depositar
                            3- Transferir
                            4- Sair
                            *************************
                                                    
                                                    
                            """);
                    i = sc.nextInt();

                    switch (i) {
                        case 1:
                            System.out.println("...Consultando Saldo");
                            System.out.println(String.format("%.2f",saldo));
                            break;
                        case 2:
                            System.out.println("valor a depositar: ");
                            valor = sc.nextDouble();
                            saldo += valor;
                            System.out.println(String.format("Seu saldo atual é %.2f", saldo));
                            break;
                        case 3:
                            System.out.println("Valor da transferência: ");
                            valor = sc.nextDouble();
                            saldo -= valor;
                            System.out.println(String.format("Seu saldo atual é %.2f", saldo));
                            break;
                        default:
                            System.out.println("...Saindo da aplicação");
                            break;
                    }//fim switch
                }//fim while
            } else {
                System.out.println("""
                                        Token inválido
                                        Reinicie a aplicação para uma nova tentativa de acesso
                                        
                                        ...encerrando""");
                    }//fim else

    }
}








