package br.com.fiap.cp_api_rest.Entity;

import br.com.fiap.cp_api_rest.Enum.Gender;
import br.com.fiap.cp_api_rest.Enum.Nature;

import java.util.Date;
import java.util.List;

public class PokemonTrainer extends Pokemon{
    private String nickname;
    private Gender gender;
    private String ability;
    private Nature nature;
    private Status status;
    private String location;
    private Trainer trainer;
    private Date dateCapture;
    private List<Move> moves;
    private boolean shiny;
}
