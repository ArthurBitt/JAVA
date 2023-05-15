package br.com.Fintech.Modulos;
import java.util.Random;
import java.util.Scanner;

public class Token {
    private String token;
    private String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private int comprimento = 3;
    private StringBuilder sb = new StringBuilder(comprimento);
    private Scanner sc = new Scanner(System.in);

//métodos da classe
    private String geraToken(){
        Random random = new Random();
        for (int i = 0; i < comprimento; i++) {
            int indiceAleatorio = random.nextInt(caracteres.length());
            char caractereAleatorio = caracteres.charAt(indiceAleatorio);
            sb.append(caractereAleatorio);
        }
        String stringAleatoria = sb.toString();

        return stringAleatoria;
    }

    public String Token(){
        return this.token = geraToken().toLowerCase();
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
