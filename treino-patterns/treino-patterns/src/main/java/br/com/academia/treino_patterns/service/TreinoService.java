package br.com.academia.treino_patterns.service;


import br.com.academia.treino_patterns.model.Treino;
import br.com.academia.treino_patterns.repository.TreinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreinoService {

    private final TreinoRepository treinoRepository;

    @Autowired
    public TreinoService(TreinoRepository treinoRepository) {
        this.treinoRepository = treinoRepository;
    }

    public Treino salvarTreino(Treino treino) {
        return treinoRepository.save(treino);
    }

    public List<Treino> listarTreinos() {
        return treinoRepository.findAll();
    }
}
