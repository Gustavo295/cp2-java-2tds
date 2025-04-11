package br.com.fiap.cp_api_rest.dto;

import br.com.fiap.cp_api_rest.enums.Type;

public record PokemonResponse (
        int number,
        String name,
        String title,
        String description,
        Type typePrimary,
        Type typeSecondary,
        int lineEvolution

){
}
