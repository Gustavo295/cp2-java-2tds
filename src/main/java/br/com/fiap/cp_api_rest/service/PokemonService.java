package br.com.fiap.cp_api_rest.service;

import br.com.fiap.cp_api_rest.entity.Pokemon;
import br.com.fiap.cp_api_rest.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PokemonService {
    @Autowired
    private  PokemonRepository repository;

    public List<Pokemon> findAll() {
        return repository.findAll();
    }

    public Optional<Pokemon> findById(Long id) {
        return repository.findById(id);
    }

    public Pokemon save(Pokemon pokemon) {
        return repository.save(pokemon);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
