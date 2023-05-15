package br.com.Fintech;

public class Data {
    private static int dia;
    private static int mes;
    private static int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public static String recuperaData(){
        String textoData = String.format("""
               %d /%d/ %d
                """, dia, mes, ano);
        return textoData;
    }


}
