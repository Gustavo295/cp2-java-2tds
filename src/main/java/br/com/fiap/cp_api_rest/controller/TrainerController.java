package br.com.fiap.cp_api_rest.controller;

import br.com.fiap.cp_api_rest.entity.Trainer;
import br.com.fiap.cp_api_rest.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainers")
public class TrainerController {

   @Autowired
   private  TrainerService service;

    @GetMapping
    public List<Trainer> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Trainer findById(@PathVariable Long id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping
    public Trainer save(@RequestBody Trainer trainer) {
        return service.save(trainer);
    }

    @PutMapping("/{id}")
    public Trainer update(@PathVariable Long id, @RequestBody Trainer trainer) {
        trainer.setId(id);
        return service.save(trainer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
