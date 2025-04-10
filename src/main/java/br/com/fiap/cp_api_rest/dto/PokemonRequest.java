package br.com.fiap.cp_api_rest.dto;

import br.com.fiap.cp_api_rest.entity.Move;
import br.com.fiap.cp_api_rest.enums.Gender;
import br.com.fiap.cp_api_rest.enums.Type;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;

import java.util.List;

public record PokemonRequest(
        int number,
        String name,
        String title,
        String description,
        List<Gender> possibleGender,
        List<String> possibleAbility,
        Type typePrimary,
        Type typeSecondary,
        int lineEvolution,
        List<Move> possibleMovesLearn

) {
}
