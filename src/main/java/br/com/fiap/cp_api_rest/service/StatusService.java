package br.com.fiap.cp_api_rest.service;

import br.com.fiap.cp_api_rest.entity.Status;
import br.com.fiap.cp_api_rest.repository.StatusRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {

    private final StatusRepository repository;

    public StatusService(StatusRepository repository) {
        this.repository = repository;
    }

    public List<Status> findAll() {
        return repository.findAll();
    }

    public Status findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Status não encontrado com id " + id));
    }

    public Status save(Status status) {
        return repository.save(status);
    }

    public Status update(Long id, Status atualizado) {
        findById(id);
        atualizado.setId(id);
        return repository.save(atualizado);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
