package br.com.Myfi.Principal;
import br.com.Myfi.Modelos.Faixa;
import br.com.Myfi.Modelos.Musicas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Musicas musica1 = new Musicas("Way down we go",3.33);
        Musicas musica2 = new Musicas("Hot Blood",3.39);
        Musicas musica3 = new Musicas("Broken Bones",4.06);

        ArrayList<Faixa> lista = new ArrayList<>();
        lista.add(musica1);
        lista.add(musica2);
        lista.add(musica3);


        //foreach Method reference

        lista.forEach(System.out::println);

//        //foreach - para cada Objeto do tipo Faixa na lista, guarde-o em i e print esse i
//        for (Faixa i:lista
//             ) {
//            Musicas musicas = (Musicas) i; //cast, acessar métodos específico da subclasse
//            System.out.println("\n" + i);
//            System.out.println("Tempo: " + i.getDuracaoMinutos());
//
//        }


//        int i = 0;
//        while ( i < lista.size()) {
//            System.out.println("Titulo: " + lista.get(i).getNome() + " (" + lista.get(i).getDuracaoMinutos() + ")");
//            i++;
//        }


    }
}
