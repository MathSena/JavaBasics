package br.com.mathsena.defaultMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {
        System.out.println("Jeito antigo...Imprimindo pelo tamanho do nome");

        List<String> words = new ArrayList<String>();

        words.add("Corinthians");
        words.add("Palmeiras");
        words.add("Santos");
        words.add("São Paulo");
        words.add("Ponte Preta");
        words.add("Flamengo");
        words.add("Vasco da Gama");
        words.add("Fluminense");
        words.add("Botafogo");
        words.add("Grêmio");
        words.add("Internacional");
        words.add("Atlético Mineiro");
        words.add("Cruzeiro");
        words.add("Bahia");
        words.add("Vitória");
        words.add("Sport");
        words.add("Ceará");
        words.add("Fortaleza");
        words.add("Chapecoense");
        words.add("Athletico Paranaense");
        words.add("Coritiba");
        words.add("Goiás");
        words.add("Atlético Goianiense");
        words.add("São Caetano");
        words.add("Brasiliense");
        words.add("Avaí");
        words.add("Figueirense");
        words.add("Paraná");
        words.add("Joinville");
        words.add("Náutico");
        words.add("América-MG");
        words.add("Guarani");
        words.add("Sampaio Corrêa");
        words.add("Paysandu");
        words.add("Santa Cruz");
        words.add("CSA");
        words.add("Bragantino");
        words.add("Juventude");
        words.add("Portuguesa");
        words.add("Barueri");
        words.add("Ipatinga");
        words.add("Criciúma");
        words.add("Bangu");
        words.add("Coritiba");
        words.add("Desportiva Ferroviária");

        Comparator<String> comparator = new ComparadorPorTamanho();
        words.sort(comparator);

//        for(String w: words) {
//            System.out.println(w);
//        }

        Consumer<String> consumidor = new ImprimeNaLinha();
        words.forEach(consumidor);

        System.out.println(words);
    }
}

class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);

    }
}

