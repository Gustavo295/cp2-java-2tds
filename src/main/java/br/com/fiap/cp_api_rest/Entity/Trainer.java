package br.com.fiap.cp_api_rest.Entity;

import java.util.Date;
import java.util.List;

public class Trainer {
    private Long id;
    private String name;
    private Date startJourney;
    private Number money;
    private int pokemonHasCaught;
    private int pokemonHasView;
    private int numberBadge;
    private String city;
    private List<Pokemon> pokemons;
    //TODO: ADIONAR HISTORICO DE VITÓRIAS E DERROTAS QUANDO HOUVER A CLASSE BATTLE
}
