package br.com.fiap.cp_api_rest.controller;

import br.com.fiap.cp_api_rest.entity.Pokemon;
import br.com.fiap.cp_api_rest.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

   @Autowired
    private  PokemonService service;

    @GetMapping
    public List<Pokemon>   findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Pokemon findById(@PathVariable Long id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping
    public Pokemon save(@RequestBody Pokemon pokemon) {
        return service.save(pokemon);
    }

    @PutMapping("/{id}")
    public Pokemon update(@PathVariable Long id, @RequestBody Pokemon pokemon) {
        pokemon.setId(id);
        return service.save(pokemon);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
