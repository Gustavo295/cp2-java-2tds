package br.com.fiap.cp_api_rest.service;

import br.com.fiap.cp_api_rest.dto.MoveRequest;
import br.com.fiap.cp_api_rest.dto.MoveResponse;
import br.com.fiap.cp_api_rest.entity.Move;
import br.com.fiap.cp_api_rest.enums.Category;
import br.com.fiap.cp_api_rest.enums.Type;
import br.com.fiap.cp_api_rest.repository.MoveRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MoveService {

    private final MoveRepository repository;

    public MoveService(MoveRepository repository) {
        this.repository = repository;
    }

    public List<MoveResponse> findAll() {
        return repository.findAll().stream()
                .map(this::MoveToResponse)
                .collect(Collectors.toList());
    }

    public MoveResponse findById(Long id) {
        Move move = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Move não encontrado com id " + id));
        return MoveToResponse(move);
    }

    public MoveResponse save(MoveRequest request) {
        Move move = RequestToMove(request);
        return MoveToResponse(repository.save(move));
    }

    public MoveResponse update(Long id, MoveRequest request) {
        Move moveExistente = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Move não encontrado com id " + id));

        moveExistente.setName(request.name());
        moveExistente.setDescription(request.description());
        moveExistente.setType(request.type());
        moveExistente.setCategory(request.category());
        moveExistente.setPower(request.power());
        moveExistente.setAccuracy(request.accuracy());
        moveExistente.setPpMax(request.ppMax());
        moveExistente.setPokemonsLearn(request.pokemonsLearn());

        return MoveToResponse(repository.save(moveExistente));
    }

    public void delete(Long id) {
        repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Move não encontrado com id " + id));
        repository.deleteById(id);
    }

    // ========== Conversão DTO <-> Entity ==========

    private Move RequestToMove(MoveRequest request) {
        Move move = new Move();
        move.setName(request.name());
        move.setDescription(request.description());
        move.setType(request.type());
        move.setCategory(request.category());
        move.setPower(request.power());
        move.setAccuracy(request.accuracy());
        move.setPpMax(request.ppMax());
        move.setPokemonsLearn(request.pokemonsLearn());
        return move;
    }

    private MoveResponse MoveToResponse(Move move) {
        return new MoveResponse(
                move.getName(),
                move.getDescription(),
                move.getType(),
                move.getCategory(),
                move.getPower(),
                move.getAccuracy(),
                move.getPpMax(),
                move.getPpCurrent()
                );
    }
}
