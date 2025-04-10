package br.com.fiap.cp_api_rest.service;

import br.com.fiap.cp_api_rest.entity.Pokemon;
import br.com.fiap.cp_api_rest.repository.PokemonRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    private final PokemonRepository repository;

    public PokemonService(PokemonRepository repository) {
        this.repository = repository;
    }

    public List<Pokemon> findAll() {
        return repository.findAll();
    }

    public Pokemon findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Pokemon não encontrado com id " + id));
    }

    public Pokemon save(Pokemon pokemon) {
        return repository.save(pokemon);
    }

    public Pokemon update(Long id, Pokemon atualizado) {
        Pokemon existente = findById(id);
        atualizado.setId(id);
        return repository.save(atualizado);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
