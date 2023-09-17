package br.com.mathsena.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {
        // Obtendo a data de hoje
        LocalDate hoje = LocalDate.now();
        System.out.println("Data atual: " + hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        // Definindo uma data específica (Olimpíadas de Paris)
        LocalDate olimpiadasParis = LocalDate.of(2024, Month.AUGUST, 12);
        System.out.println("Data das Olimpíadas de Paris: " + olimpiadasParis);

        // Calculando o número de anos até as Olimpíadas de Paris
        int anosAteOlimpiadasParis = olimpiadasParis.getYear() - hoje.getYear();
        System.out.println("Anos até as Olimpíadas de Paris: " + anosAteOlimpiadasParis);

        // Obtendo o período entre hoje e as Olimpíadas de Paris
        Period periodoAteOlimpiadasParis = Period.between(hoje, olimpiadasParis);
        System.out.println("Meses até as Olimpíadas de Paris: " + periodoAteOlimpiadasParis.getMonths());

        // Calculando a data das próximas Olimpíadas após Paris
        LocalDate proximasOlimpiadas = olimpiadasParis.plusYears(4);
        System.out.println("Data das próximas Olimpíadas após Paris: " + proximasOlimpiadas);

        // Obtendo data e hora atuais
        LocalDateTime agora = LocalDateTime.now();
        System.out.println("Data e hora atual: " + agora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

        // Manipulando datas: Adicionando e subtraindo dias
        System.out.println("10 dias após hoje: " + hoje.plusDays(10));
        System.out.println("3 semanas antes de hoje: " + hoje.minusWeeks(3));

        // Verificando se uma data é antes ou depois de outra
        if (hoje.isBefore(olimpiadasParis)) {
            System.out.println("Hoje é antes das Olimpíadas de Paris!");
        } else {
            System.out.println("Hoje é após as Olimpíadas de Paris!");
        }
    }
}
