// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = false;

        double notaDoFilme = 8.0;

        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println("A média do filme é: "+ media);

        int estrelasFilme = (int) media / 2;
        System.out.println(String.format("Maverick tem: %d estrelas", estrelasFilme));

        String sinopse;
        sinopse = """ 
                    Filme de aventura 
                    com galã dos anos 80
                    Ano de lançamento:  
                    """ + anoDeLancamento;

        System.out.println(sinopse);

        //Em Java, é possível comparar duas Strings utilizando o operador ==. Porém, esse operador verifica apenas se as duas variáveis apontam para o mesmo objeto na memória, e não se o conteúdo das Strings é igual. Para comparar o conteúdo de duas Strings, é necessário utilizar o método equals(). Por exemplo:
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }
        //Em Java, é possível formatar textos e números de diversas maneiras. Isso pode ser útil em diversas situações, como ao exibir valores para o usuário de uma maneira mais legível.
        //
        //Uma das maneiras mais comuns de se formatar textos em Java é utilizando o método format(), da classe String. Esse método permite formatar um texto utilizando diversos placeholders, que são representados pelo caractere % seguido de uma letra que indica o tipo de dado que será inserido no placeholder. Por exemplo, %s indica que uma String será inserida no placeholder, %d indica um valor inteiro e %f indica um valor decimal. Vamos ver um exemplo:

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

        //Nesse exemplo, os valores das variáveis nome, idade e valor são passados como parâmetros para o método String.format, substituindo os placeholders %s, %d e %.2f, respectivamente. O resultado impresso será "Meu nome é Maria, eu tenho 30 anos e hoje gastei 55,99 reais". Perceba também que o placeholder %.2f indica que o valor deve ser formatado com duas casas decimais.

    }
}


