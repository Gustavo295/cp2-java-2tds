package br.com.fiap.cp_api_rest.Repository;

import br.com.fiap.cp_api_rest.Entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
