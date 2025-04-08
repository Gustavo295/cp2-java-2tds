package br.com.fiap.cp_api_rest.entity;


import br.com.fiap.cp_api_rest.enums.Category;
import br.com.fiap.cp_api_rest.enums.Effect;
import br.com.fiap.cp_api_rest.enums.Type;
import jakarta.persistence.*;
import jdk.jfr.Percentage;

import java.util.List;
@Entity
public class Move {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

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
    private double chanceEffectMove;
    private Effect effectSecondary;
    private double chanceEffectSecondary;
    @ManyToMany
    private List<Pokemon> pokemonsLearn;



}
