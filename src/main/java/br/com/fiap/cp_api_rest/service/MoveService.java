package br.com.fiap.cp_api_rest.service;

import br.com.fiap.cp_api_rest.entity.Move;
import br.com.fiap.cp_api_rest.repository.MoveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoveService {
    @Autowired
    private  MoveRepository repository;

    public List<Move> findAll() {
        return repository.findAll();
    }

    public Optional<Move> findById(Long id) {
        return repository.findById(id);
    }

    public Move save(Move move) {
        return repository.save(move);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}
