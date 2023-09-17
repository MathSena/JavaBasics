package br.com.mathsena.methodReference;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@Slf4j
public class OrdenaStrings {

    private static final List<String> words = new ArrayList<>();

    static {
        log.info("Usando uma função lambda para adicionar times à lista.");
        // Adiciona times à lista usando Stream e Method Reference
        Stream.of(
                        "Corinthians", "Palmeiras", "Santos", "São Paulo", "Ponte Preta",
                        "Flamengo", "Vasco da Gama", "Fluminense", "Botafogo", "Grêmio",
                        "Internacional", "Atlético Mineiro", "Cruzeiro", "Bahia", "Vitória",
                        "Sport", "Ceará", "Fortaleza", "Chapecoense", "Athletico Paranaense",
                        "Coritiba", "Goiás", "Atlético Goianiense", "São Caetano", "Brasiliense",
                        "Avaí", "Figueirense", "Paraná", "Joinville", "Náutico", "América-MG",
                        "Guarani", "Sampaio Corrêa", "Paysandu", "Santa Cruz", "CSA", "Bragantino",
                        "Juventude", "Portuguesa", "Barueri", "Ipatinga", "Criciúma", "Bangu",
                        "Coritiba", "Desportiva Ferroviária")
                .forEach(words::add); // Usando Method Reference

        log.debug("Times adicionados à lista: {}", words);
    }

    public static void main(String[] args) {
        log.info("Ordenando a lista de times pelo tamanho do nome usando Method Reference.");
        // Ordena a lista pelo tamanho das strings usando Method Reference
        words.sort(Comparator.comparingInt(String::length)); // Usando Method Reference

        log.info("Imprimindo cada time em uma nova linha usando Method Reference.");
        // Imprime cada palavra em uma nova linha usando Method Reference
        words.forEach(log::debug); // Usando Method Reference
    }

}






