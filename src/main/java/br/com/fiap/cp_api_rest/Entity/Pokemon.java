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
    private Gender gender;
    private Type typePrimary;
    private Type typeSecondary;
    private String ability;
    private Nature nature;
    private Status status;
    private String location;
    private Trainer trainer;
    private Date dateCapture;
    private List<Move> moves;
    private int lineEvolution;
    private boolean shiny;
}
