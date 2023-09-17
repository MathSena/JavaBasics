package datas;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class DatasJava8DemoTest {

    @Test
    @DisplayName("Testar manipulações de datas")
    void testDatas() {
        log.info("Iniciando o teste de manipulação de datas.");

        LocalDate hoje = LocalDate.now();
        assertEquals(LocalDate.now(), hoje, "Data atual não está correta.");
        log.debug("Validação da data atual passou.");

        LocalDate olimpiadasParis = LocalDate.of(2024, Month.AUGUST, 12);
        assertEquals(LocalDate.of(2024, Month.AUGUST, 12), olimpiadasParis, "Data das Olimpíadas de Paris não está correta.");
        log.debug("Validação da data das Olimpíadas de Paris passou.");

        int anosAteOlimpiadasParis = olimpiadasParis.getYear() - hoje.getYear();
        assertTrue(anosAteOlimpiadasParis > 0, "O número de anos até as Olimpíadas de Paris deve ser positivo.");

        Period periodoAteOlimpiadasParis = Period.between(hoje, olimpiadasParis);
        assertTrue(periodoAteOlimpiadasParis.getMonths() >= 0, "O número de meses até as Olimpíadas de Paris deve ser não negativo.");

        LocalDate proximasOlimpiadas = olimpiadasParis.plusYears(4);
        assertEquals(LocalDate.of(2028, Month.AUGUST, 12), proximasOlimpiadas, "Data das próximas Olimpíadas após Paris não está correta.");
        log.debug("Validação da data das próximas Olimpíadas passou.");

        LocalDateTime agora = LocalDateTime.now();
        assertEquals(LocalDateTime.now().getYear(), agora.getYear(), "Ano da data e hora atuais não está correto.");
        assertEquals(LocalDateTime.now().getMonth(), agora.getMonth(), "Mês da data e hora atuais não está correto.");
        assertEquals(LocalDateTime.now().getDayOfMonth(), agora.getDayOfMonth(), "Dia da data e hora atuais não está correto.");

        LocalDate maisDezDias = hoje.plusDays(10);
        assertEquals(hoje.getDayOfYear() + 10, maisDezDias.getDayOfYear(), "A adição de 10 dias não está correta.");
        log.debug("Validação da adição de 10 dias passou.");

        LocalDate menosTresSemanas = hoje.minusWeeks(3);
        assertEquals(hoje.getDayOfYear() - 21, menosTresSemanas.getDayOfYear(), "A subtração de 3 semanas não está correta.");
        log.debug("Validação da subtração de 3 semanas passou.");

        assertTrue(hoje.isBefore(olimpiadasParis), "Hoje deve ser antes das Olimpíadas de Paris.");
        log.debug("Validação de comparação entre datas passou.");

        log.info("Finalizando o teste de manipulação de datas.");
    }
}