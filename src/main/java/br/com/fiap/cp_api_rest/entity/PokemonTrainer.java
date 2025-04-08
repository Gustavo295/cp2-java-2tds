package br.com.fiap.cp_api_rest.entity;

import br.com.fiap.cp_api_rest.enums.Gender;
import br.com.fiap.cp_api_rest.enums.GroupExp;
import br.com.fiap.cp_api_rest.enums.Nature;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
public class PokemonTrainer {
    @Id

    private Long id;
    private String nickname;
    private GroupExp groupExp;

    @ManyToOne
    private Pokemon pokemon;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String ability;
    @Enumerated(EnumType.STRING)
    private Nature nature;

    @OneToOne(cascade = CascadeType.ALL)
    private Status status;
    private String location;
    @ManyToOne
    private Trainer trainer;
    private Date dateCapture;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Move> moves;
    private boolean shiny;
}
