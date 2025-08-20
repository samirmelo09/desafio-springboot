package br.com.academia.treino_patterns.controller;

import br.com.academia.treino_patterns.model.Treino;
import br.com.academia.treino_patterns.service.TreinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treinos")
public class TreinoController {

    private final TreinoService treinoService;

    @Autowired
    public TreinoController(TreinoService treinoService) {
        this.treinoService = treinoService;
    }

    // Criar novo treino
    @PostMapping
    public Treino salvar(@RequestBody Treino treino) {
        return treinoService.salvarTreino(treino);
    }

    // Listar todos os treinos
    @GetMapping
    public List<Treino> listar() {
        return treinoService.listarTreinos();
    }

}
