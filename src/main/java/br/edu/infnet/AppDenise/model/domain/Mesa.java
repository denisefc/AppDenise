package br.edu.infnet.AppDenise.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "TMesa")
public class Mesa extends MovelMadeira{
    private boolean vidro;
    private String formato;

    @Override
    public String toString() {
        return String.format("%s - %s - %s",
                super.toString(),
                vidro ? "vidro=S" : "vidro=N",
                formato
        );
    }
}
