package br.com.screenmatch.calculos;
import br.com.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    //SOBRECARGA DE MÉTODOS
//        public void inclui(Filme f){
//        this.tempoTotal+= f.getDuracaoEmMinutos();
//
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal+= s.getDuracaoEmMinutos();
//
//    }
    public void inclui (Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
