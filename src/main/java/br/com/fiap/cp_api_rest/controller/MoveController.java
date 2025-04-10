package br.com.fiap.cp_api_rest.controller;

import br.com.fiap.cp_api_rest.entity.Move;
import br.com.fiap.cp_api_rest.service.MoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moves")
public class MoveController {

    @Autowired
    private  MoveService service;

    @GetMapping
    public List<Move> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Move findById(@PathVariable Long id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping
    public Move save(@RequestBody Move move) {
        return service.save(move);
    }

    @PutMapping("/{id}")
    public Move update(@PathVariable Long id, @RequestBody Move move) {
        move.setId(id);
        return service.save(move);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}