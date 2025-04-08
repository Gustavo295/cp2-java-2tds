package br.com.fiap.cp_api_rest.entity;

import br.com.fiap.cp_api_rest.enums.Gender;
import br.com.fiap.cp_api_rest.enums.Type;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class Pokemon {
    @Id

    private Long id;
    private int number;
    private String name;
    private String title;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<Gender> possibleGender;
    @ElementCollection
    private List<String> possibleAbility;
    @Enumerated(EnumType.STRING)
    private Type typePrimary;
    @Enumerated(EnumType.STRING)
    private Type typeSecondary;
    private int lineEvolution;
    @ManyToMany
    private List<Move> possibleMovesLearn;
    //TODO: CRIAR CLASSE EVOLUÇÃO E APLICAR UMA LISTA DE EVOLUÇÕES AO POKEMON
}
