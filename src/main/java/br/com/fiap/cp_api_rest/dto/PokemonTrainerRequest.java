package br.com.fiap.cp_api_rest.dto;

import br.com.fiap.cp_api_rest.entity.Move;
import br.com.fiap.cp_api_rest.entity.Pokemon;
import br.com.fiap.cp_api_rest.entity.Status;
import br.com.fiap.cp_api_rest.entity.Trainer;
import br.com.fiap.cp_api_rest.enums.Gender;
import br.com.fiap.cp_api_rest.enums.GroupExp;
import br.com.fiap.cp_api_rest.enums.Nature;
import jakarta.validation.constraints.*;

import java.util.Date;
import java.util.List;

public record PokemonTrainerRequest(

        @NotBlank
        @Size(min = 2, max = 100)
        String nickname,

        @NotNull
        GroupExp groupExp,

        @NotNull
        Pokemon pokemon,

        @NotNull
        Gender gender,

        @NotBlank
        String ability,

        @NotNull
        Nature nature,

        @NotNull
        StatusRequest status,

        @NotBlank
        String location,

        @NotNull
        Trainer trainer,

        @NotNull
        @PastOrPresent(message = "A data de captura tem que ter ocorrido")
        Date dateCapture,

        @NotEmpty
        List<@NotNull Move> moves,

        boolean shiny

) {}
