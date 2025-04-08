package br.com.fiap.cp_api_rest.Repository;

import br.com.fiap.cp_api_rest.Entity.Move;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoveRepository extends JpaRepository<Move, Long> {
}
