package br.com.fiap.cp_api_rest.service;

import br.com.fiap.cp_api_rest.entity.Status;
import br.com.fiap.cp_api_rest.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusService {
    @Autowired
    private  StatusRepository repository;

    public List<Status> findAll() {
        return repository.findAll();
    }

    public Optional<Status> findById(Long id) {
        return repository.findById(id);
    }

    public Status save(Status status) {
        return repository.save(status);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
