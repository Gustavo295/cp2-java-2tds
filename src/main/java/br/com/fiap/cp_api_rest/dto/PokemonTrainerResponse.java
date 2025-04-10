package br.com.fiap.cp_api_rest.dto;

import br.com.fiap.cp_api_rest.enums.Gender;
import br.com.fiap.cp_api_rest.enums.GroupExp;
import br.com.fiap.cp_api_rest.enums.Nature;

import java.util.Date;
import java.util.List;

public record PokemonTrainerResponse(
        Long id,
        String nickname,
        GroupExp groupExp,
        String name,
        Gender gender,
        String ability,
        Nature nature,
        StatusResponse status,
        String location,
        String trainerName,
        Date dateCapture,
        List<String> moveNames,
        boolean shiny
) {}
