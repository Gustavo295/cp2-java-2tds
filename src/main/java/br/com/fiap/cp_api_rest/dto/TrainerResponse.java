package br.com.fiap.cp_api_rest.dto;

import java.util.Date;
import java.util.List;

public record TrainerResponse(
        Long id,
        String name,
        Date startJourney,
        Number money,
        int pokemonHasCaught,
        int pokemonHasView,
        int numberBadge,
        String city,
        List<PokemonTrainerResponse> pokemons
) {}
