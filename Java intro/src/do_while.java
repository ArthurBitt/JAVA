import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        int totalDeNotas = 0;
        while(nota != -1 ) {
            System.out.println("Digite sua avaliação ou -1 para encerrar: ");
            nota = sc.nextDouble();

            if (nota != -1){
                media+=nota;
                totalDeNotas ++;

            } else {
                System.out.println("...encerrando");


            }
        }
        System.out.println(String.format("A media das avaliações é: %.1f", (media)/totalDeNotas));
    }

}
