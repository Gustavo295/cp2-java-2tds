package br.com.fiap.cp_api_rest.controller;

import br.com.fiap.cp_api_rest.entity.Status;
import br.com.fiap.cp_api_rest.service.StatusService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/status")
public class StatusController {

    private final StatusService service;

    public StatusController(StatusService service) {
        this.service = service;
    }

    @GetMapping
    public List<Status> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Status> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<Status> create(@RequestBody Status status) {
        return ResponseEntity.ok(service.save(status));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Status> update(@PathVariable Long id, @RequestBody Status status) {
        return ResponseEntity.ok(service.update(id, status));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
