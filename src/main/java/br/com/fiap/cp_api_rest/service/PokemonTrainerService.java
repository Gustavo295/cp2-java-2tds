package br.com.fiap.cp_api_rest.service;

import br.com.fiap.cp_api_rest.entity.PokemonTrainer;
import br.com.fiap.cp_api_rest.repository.PokemonTrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonTrainerService {
    @Autowired
    private  PokemonTrainerRepository repository;

    public List<PokemonTrainer> findAll() {
        return repository.findAll();
    }

    public Optional<PokemonTrainer> findById(Long id) {
        return repository.findById(id);
    }

    public PokemonTrainer save(PokemonTrainer pt) {
        return repository.save(pt);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}