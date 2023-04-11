import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //instância da classe Scanner
        double media = 0;
        double nota =0;

        for (int i = 0; i < 4; i++) {
            System.out.println("Digite qual nota gostaria de atribuir a esse filme: ");
            nota = input.nextDouble();
            media += nota;

        }

        System.out.println(String.format("A media das avaliações é: %.2f", (media)/3));
        System.out.println("A media de avaliações é     :" + media/3);






    }

}
