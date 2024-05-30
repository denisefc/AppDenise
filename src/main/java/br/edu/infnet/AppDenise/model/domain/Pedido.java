package br.edu.infnet.AppDenise.model.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Getter
@Setter
public class Pedido {
    private Integer id;
    private int numeroPedido;
    private float totalReais;

    private List<MovelMadeira> moveisMadeira;

    public Pedido() {
        this.moveisMadeira = new ArrayList<MovelMadeira>();
    }


    @Override
    public String toString() {
        return String.format("%d - %.2f - %d",
                numeroPedido,
                totalReais,
                moveisMadeira.size()
        );
    }
}
