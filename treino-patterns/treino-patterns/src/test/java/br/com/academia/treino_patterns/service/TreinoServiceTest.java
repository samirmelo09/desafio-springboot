package br.com.academia.treino_patterns.service;

import br.com.academia.treino_patterns.model.Treino;
import br.com.academia.treino_patterns.repository.TreinoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@DataJpaTest
public class TreinoServiceTest {

    @Autowired
    private TreinoRepository treinoRepository;

    @Test
    void deveSalvarETrazerTreino() {
        // cria treino
        Treino treino = new Treino();
        treino.setNomeAluno("Samir");
        treino.setObjetivo("Hipertrofia");
        treino.setDescricao("Treino de peito e tríceps");

        // salva no banco H2
        Treino salvo = treinoRepository.save(treino);

        // verifica se foi salvo
        assertThat(salvo.getId()).isNotNull();
        assertThat(salvo.getNomeAluno()).isEqualTo("Samir");

        // busca todos e verifica se contém o salvo
        List<Treino> lista = treinoRepository.findAll();
        assertThat(lista).isNotEmpty();
        assertThat(lista.get(0).getObjetivo()).isEqualTo("Hipertrofia");
    }
}
