package br.com.fiap.cp_api_rest.repository;

import br.com.fiap.cp_api_rest.entity.Move;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoveRepository extends JpaRepository<Move, Integer> {
}
