package br.com.fiap.cp_api_rest.service;

import br.com.fiap.cp_api_rest.entity.PokemonTrainer;
import br.com.fiap.cp_api_rest.repository.PokemonTrainerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonTrainerService {

    private final PokemonTrainerRepository repository;

    public PokemonTrainerService(PokemonTrainerRepository repository) {
        this.repository = repository;
    }

    public List<PokemonTrainer> findAll() {
        return repository.findAll();
    }

    public PokemonTrainer findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Treinador não encontrado com id " + id));
    }

    public PokemonTrainer save(PokemonTrainer trainer) {
        return repository.save(trainer);
    }

    public PokemonTrainer update(Long id, PokemonTrainer atualizado) {
        findById(id);
        atualizado.setId(id);
        return repository.save(atualizado);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
