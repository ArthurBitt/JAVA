package br.com.Fintech;

import java.util.Scanner;

public class Token {
    private String token;
    Scanner sc = new Scanner(System.in);

    public Token(String token){

        this.token = token.toLowerCase();
    }

    public boolean validaToken(){

        System.out.println("Insira seu Token de acesso com 3 dígitos: [xxx] ");
        String senha = sc.nextLine();


        if (!this.token.equals(senha.toLowerCase())) {
            System.out.println("""
                            Token inválido
                            Reinicie a aplicação para uma nova tentativa de acesso
                                                                    
                            """);
            return false;

        }else{
            System.out.println("""
                                                                
                            Token digitado corretamente!
                                                                
                            ...carregando aplicação
                                                                
                            """);

            return true;
        }

        }
}
