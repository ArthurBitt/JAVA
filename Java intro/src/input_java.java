import java.util.Scanner;

public class input_java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //instância da classe Scanner

        System.out.println("Digite seu filme favorito: ");
        String filmeFavorito = input.nextLine();
        System.out.println("Digite o ano de lançamento desse filme: ");
        int anoDeLancamento = input.nextInt();
        System.out.println("Digite qual nota gostaria de atribuir a esse filme: ");
        double notaRating = input.nextDouble();


        System.out.println(String.format("\nSeu filme favorito: %s \nLançamento %d \nAvaliação: %f" , filmeFavorito, anoDeLancamento, notaRating));



    }
}