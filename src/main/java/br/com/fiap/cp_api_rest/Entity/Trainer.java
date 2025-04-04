package br.com.fiap.cp_api_rest.Entity;

import java.util.Date;
import java.util.List;

public class Trainer {
    private Long id;
    private String name;
    private Date date;
    private Number money;
    private int pokedex;
    private String city;
    private List<Pokemon> pokemons;
}
