package streams;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import br.com.mathsena.streams.Campeonato;

import br.com.mathsena.streams.CampeonatoManager;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Slf4j
class CampeonatoManagerTest {

    private CampeonatoManager manager;

    @BeforeEach
    public void setUp() {
        log.info("Setting up the test environment...");
        manager = new CampeonatoManager();
    }

    @Test
    @DisplayName("TESTE DE INICIALIZAÇÃO")
    void testInitializeCampeonatos() {
        log.info("Testing initialization of campeonatos...");
        List<Campeonato> campeonatos = manager.initializeCampeonatos();
        assertEquals(4, campeonatos.size());
        log.info("Initialization test passed.");
    }

    @Test
    @DisplayName("TESTE DE LISTA DE CAMPEONATOS")
    void testFilterCampeonatosWithAtLeastEightTeams() {
        log.info("Testing filter for campeonatos with at least 8 teams...");
        List<Campeonato> campeonatos = manager.initializeCampeonatos();
        List<Campeonato> filtered = manager.filterCampeonatosWithAtLeastEightTeams(campeonatos);
        assertEquals(3, filtered.size());
        log.info("Filtering test passed.");
    }

    @Test
    @DisplayName("TESTE DE QUANTIDADE DE TIMES")
    void testGetTotalNumberOfTeams() {
        log.info("Testing total number of teams calculation...");
        List<Campeonato> campeonatos = manager.initializeCampeonatos();
        int total = manager.getTotalNumberOfTeams(campeonatos);
        assertEquals(118, total);
        log.info("Total number of teams test passed.");
    }
}




