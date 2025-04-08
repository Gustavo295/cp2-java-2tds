package br.com.fiap.cp_api_rest.Entity;


import br.com.fiap.cp_api_rest.Enum.Category;
import br.com.fiap.cp_api_rest.Enum.Effect;
import br.com.fiap.cp_api_rest.Enum.Type;
import jdk.jfr.Percentage;

import java.util.List;

public class Move {
    private Long id;
    private String name;
    private String description;
    private Type type;
    private Category category;
    private double power;
    private double accuracy;
    private int ppMax;
    private int ppCurrent;
    private Effect effectMove;
    @Percentage
    private double chanceEffectMove;
    private Effect effectSecondary;
    @Percentage
    private double chanceEffectSecondary;
    private List<Pokemon> pokemonsLearn;



}
