package br.com.screenmatch.calculos;

import br.com.screenmatch.modelos.Titulo;

public class FiltroRecomendacao {


    public void filtra(Classificavel classificavel){
        if (classificavel.getclassificacao() >= 4){
            System.out.println("Preferidos");
        }else if (classificavel.getclassificacao() >= 2){
            System.out.println("Bem avaliado");

        }else {
            System.out.println("Ruim");
        }
    }
}
