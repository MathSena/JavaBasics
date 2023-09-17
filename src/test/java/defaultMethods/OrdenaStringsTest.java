package defaultMethods;

import br.com.mathsena.defaultMethods.ComparadorPorTamanho;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
public class OrdenaStringsTest {

    private List<String> words;
    private ComparadorPorTamanho comparator;

    @BeforeEach
    public void setup() {
        words = new ArrayList<String>();

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

        comparator = new ComparadorPorTamanho();
    }

    @Test
    @DisplayName("Teste Ordenação por tamanho")
    public void testOrdenacaoPorTamanho() {

        words.sort(comparator);

        for (int i = 0; i < words.size() - 1; i++) {
            assertTrue(words.get(i).length() <= words.get(i+1).length(),
                    "Lista não foi ordenada corretamente pelo tamanho");
        }


    }
}
