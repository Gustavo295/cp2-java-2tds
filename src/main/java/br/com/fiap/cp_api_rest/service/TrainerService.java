package br.com.fiap.cp_api_rest.service;

import br.com.fiap.cp_api_rest.entity.Trainer;
import br.com.fiap.cp_api_rest.repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainerService {
    @Autowired
    private  TrainerRepository repository;

    public List<Trainer> findAll() {
        return repository.findAll();
    }

    public Optional<Trainer> findById(Long id) {
        return repository.findById(id);
    }

    public Trainer save(Trainer trainer) {
        return repository.save(trainer);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}