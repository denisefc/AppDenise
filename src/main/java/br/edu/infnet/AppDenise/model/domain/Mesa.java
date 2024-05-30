package br.edu.infnet.AppDenise.model.domain;

import lombok.*;

@Getter
@Setter
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
