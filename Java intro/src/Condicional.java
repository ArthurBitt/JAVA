public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2023;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.0;
        String tipoPlano = "Plus";

        if (anoDeLancamento >= 2023){// if(){} else {}
            System.out.println("Lançamento!");
        }else{
            System.out.println("Não é lançamento");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("Plus")){ // &&(and) || or
            System.out.println("Liberado");
        } else {
            System.out.println("Comprar Plano");
        }




    }
}
