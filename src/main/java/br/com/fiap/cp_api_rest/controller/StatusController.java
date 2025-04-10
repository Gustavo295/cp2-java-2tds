package br.com.fiap.cp_api_rest.controller;

import br.com.fiap.cp_api_rest.entity.Status;
import br.com.fiap.cp_api_rest.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {

    @Autowired
    StatusService service;

    @GetMapping
    public List<Status> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Status findById(@PathVariable Long id) {
        return service.findById(id).orElse(null);
    }

    @PostMapping
    public Status save(@RequestBody Status status) {
        return service.save(status);
    }

    @PutMapping("/{id}")
    public Status update(@PathVariable Long id, @RequestBody Status status) {
        status.setId(id);
        return service.save(status);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
