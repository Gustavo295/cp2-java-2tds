package br.com.fiap.cp_api_rest.dto;

import br.com.fiap.cp_api_rest.entity.Pokemon;
import br.com.fiap.cp_api_rest.enums.Category;
import br.com.fiap.cp_api_rest.enums.Type;

import java.util.List;

public record MoveRequest(
        String name,
        String description,
        Type type,
        Category category,
        double power,
        double accuracy,
        int ppMax,
        int ppCurrent,
        List<Pokemon> pokemonsLearn
) {
}
