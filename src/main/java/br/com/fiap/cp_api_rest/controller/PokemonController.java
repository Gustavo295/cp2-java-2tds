package br.com.fiap.cp_api_rest.controller;

import br.com.fiap.cp_api_rest.entity.Pokemon;
import br.com.fiap.cp_api_rest.service.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private final PokemonService service;

    public PokemonController(PokemonService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pokemon> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pokemon> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Pokemon> create(@RequestBody Pokemon pokemon) {
        return ResponseEntity.ok(service.save(pokemon));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pokemon> update(@PathVariable Long id, @RequestBody Pokemon pokemon) {
        return ResponseEntity.ok(service.update(id, pokemon));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
