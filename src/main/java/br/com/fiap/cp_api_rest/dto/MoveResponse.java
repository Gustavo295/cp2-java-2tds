package br.com.fiap.cp_api_rest.dto;

import br.com.fiap.cp_api_rest.entity.Move;
import br.com.fiap.cp_api_rest.entity.Pokemon;
import br.com.fiap.cp_api_rest.enums.Category;
import br.com.fiap.cp_api_rest.enums.Type;

import java.util.List;

public record MoveResponse(
         String name,
         String description,
         Type type,
         Category category,
         double power,
         double accuracy,
         int ppMax,
         int ppCurrent
) {
    public static MoveResponse fromEntity(Move move) {
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
