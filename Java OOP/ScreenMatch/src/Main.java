public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme ();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1979;
        meuFilme.duracaoEmMinutos = 200;
        meuFilme.avaliacao = 9.1;
        meuFilme.incluidoNoPlano = true;
        meuFilme.totalDeAvaliacoes = 2000;


        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDeLancamento);
        System.out.println(meuFilme.duracaoEmMinutos);
    }
}
