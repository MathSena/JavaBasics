package br.com.mathsena.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CampeonatoManager {

    public List<Campeonato> initializeCampeonatos() {
        var campeonatos = new ArrayList<Campeonato>();

        campeonatos.add(new Campeonato("Campeonato Brasileiro", 20));
        campeonatos.add(new Campeonato("Copa do Brasil", 64));
        campeonatos.add(new Campeonato("Libertadores", 32));
        campeonatos.add(new Campeonato("Recopa Brasileira", 2));

        return campeonatos;
    }

    public List<Campeonato> filterCampeonatosWithAtLeastEightTeams(List<Campeonato> campeonatos) {
        return campeonatos.stream()
                .filter(c -> c.getParticipantes() >= 8)
                .collect(Collectors.toList());
    }

    public int getTotalNumberOfTeams(List<Campeonato> campeonatos) {
        return campeonatos.stream().mapToInt(Campeonato::getParticipantes).sum();
    }
}
