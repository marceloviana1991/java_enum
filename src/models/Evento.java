package models;

import java.util.Arrays;

public class Evento {
    private int id;
    private String nome;
    private DiasDaSemana[] diasDaSemanas;

    public Evento (int id, String nome, DiasDaSemana[] diasDaSemana) {
        this.id = id;
        this.nome = nome;
        this.diasDaSemanas = diasDaSemana;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diasDaSemanas=" + Arrays.toString(diasDaSemanas) +
                '}';
    }
}
