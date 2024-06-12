package br.edu.infnet.AppDenise.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "TArmario")
public class Armario extends MovelMadeira{
    private boolean puxadores;
    private int quantidadeGavetas;

    @Override
    public String toString() {
        return String.format("%s - %s - %d gavetas",
                super.toString(),
                puxadores ? "puxadores=S" : "puxadores=N",
                quantidadeGavetas
        );
    }

}
