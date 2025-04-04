package br.com.fiap.cp_api_rest.Entity;

import br.com.fiap.cp_api_rest.Enum.Gender;
import br.com.fiap.cp_api_rest.Enum.Nature;
import br.com.fiap.cp_api_rest.Enum.Type;

import java.util.Date;
import java.util.List;

public class Pokemon {
    private Long id;
    private int number;
    private String name;
    private List<Gender> possibleGender;
    private List<String> possibleAbility;
    private Type typePrimary;
    private Type typeSecondary;
    private int lineEvolution;
    private List<Move> possibleMovesLearn;

}
