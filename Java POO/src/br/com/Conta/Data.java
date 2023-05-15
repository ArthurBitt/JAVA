package br.com.Conta;

public class Data {
    int dia;
    int mes;
    int ano;

    String recuperaData(){
        String textoData = String.format("""
                    Data de Abertura: %d %d %d
                """, dia, mes, ano);
        return textoData;
    }


}
