package br.com.fiap.cp_api_rest.controller;

import br.com.fiap.cp_api_rest.entity.PokemonTrainer;
import br.com.fiap.cp_api_rest.service.PokemonTrainerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainer")
public class PokemonTrainerController {

    private final PokemonTrainerService service;

    public PokemonTrainerController(PokemonTrainerService service) {
        this.service = service;
    }

    @GetMapping
    public List<PokemonTrainer> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PokemonTrainer> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<PokemonTrainer> create(@RequestBody PokemonTrainer trainer) {
        return ResponseEntity.ok(service.save(trainer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PokemonTrainer> update(@PathVariable Long id, @RequestBody PokemonTrainer trainer) {
        return ResponseEntity.ok(service.update(id, trainer));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
