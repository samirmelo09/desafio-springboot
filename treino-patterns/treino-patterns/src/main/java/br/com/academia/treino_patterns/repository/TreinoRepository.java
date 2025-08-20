package br.com.academia.treino_patterns.repository;


import br.com.academia.treino_patterns.model.Treino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, Long> {
}
