package br.com.fiap.cp_api_rest.Entity;

import java.util.Date;
import java.util.List;

public class Trainer {
    private Long id;
    private String name;
    private Date birthDate;
    private Date startJourney;
    private Number money;
    private int pokemonHasCaught;
    private int pokemonHasView;
    private String city;
    private List<Pokemon> pokemons;
}
