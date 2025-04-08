package br.com.fiap.cp_api_rest.Repository;

import br.com.fiap.cp_api_rest.Entity.PokemonTrainer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonTrainerRepository extends JpaRepository<PokemonTrainer, Long> {
}
