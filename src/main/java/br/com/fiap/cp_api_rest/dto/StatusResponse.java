package br.com.fiap.cp_api_rest.dto;

public record StatusResponse(
        int hp,
        int attack,
        int spAttack,
        int defense,
        int spDefense,
        int speed,
        int total
) {}
