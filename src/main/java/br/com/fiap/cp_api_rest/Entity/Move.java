package br.com.fiap.cp_api_rest.Entity;


import br.com.fiap.cp_api_rest.Enum.Category;
import br.com.fiap.cp_api_rest.Enum.Type;

import java.util.List;

public class Move {
    private Long id;
    private String name;
    private String description;
    private Type type;
    private Category category;
    private double power;
    private double accuracy;
    private boolean signature;
    private int ppMax;
    private int ppCurrent;
    private String effectMove;
    private double chanceEffectMove;
    private String effectSecondary;
    private double chanceEffectSecondary;
    private List<Pokemon> pokemonsLearn;



}
