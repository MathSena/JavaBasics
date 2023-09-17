package br.com.mathsena.lambdaFunction;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

@Slf4j
public class OrdenaStrings {

    private static final List<String> words = new ArrayList<>();

    static {
        log.info("Usando uma função lambda para adicionar times à lista.");
        // Adiciona times à lista usando Stream e Lambda
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
                .forEach(word -> {
                    words.add(word);
                    log.debug("Time adicionado à lista: {}", word);
                });
    }

    public static void main(String[] args) {
        log.info("Ordenando a lista de times pelo tamanho do nome usando uma função lambda.");
        // Ordena a lista pelo tamanho das strings usando Lambda
        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        log.info("Imprimindo cada time em uma nova linha usando uma função lambda.");
        // Imprime cada palavra em uma nova linha usando Lambda
        words.forEach(word ->
            log.debug("Time impresso: {}", word)
        );
    }

}






