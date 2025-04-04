package br.com.fiap.cp_api_rest.Entity;

import br.com.fiap.cp_api_rest.Enum.Gender;
import br.com.fiap.cp_api_rest.Enum.Nature;
import br.com.fiap.cp_api_rest.Enum.Type;

import java.util.Date;
import java.util.List;

public class Pokemon {
    private Long id;
    private String name;
    private int number;
    private boolean shiny;
    private Trainer trainer;
    private String location;
    private Nature nature;
    private Type typePrimary;
    private Type typeSecondary;
    private Gender gender;
    private Date dateCapture;
    private Status status;
    private int lineEvolution;
    private List<Move> moves;
    private String ability;
}
