package br.com.fiap.cp_api_rest.controller;

import br.com.fiap.cp_api_rest.entity.PokemonTrainer;
import br.com.fiap.cp_api_rest.service.PokemonTrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon-trainers")
public class PokemonTrainerController {


    @Autowired
    PokemonTrainerService service;

    @GetMapping
    public List<PokemonTrainer> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public PokemonTrainer findById(@PathVariable Long id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping
    public PokemonTrainer save(@RequestBody PokemonTrainer pt) {
        return service.save(pt);
    }

    @PutMapping("/{id}")
    public PokemonTrainer update(@PathVariable Long id, @RequestBody PokemonTrainer pt) {
        pt.setId(id);
        return service.save(pt);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
