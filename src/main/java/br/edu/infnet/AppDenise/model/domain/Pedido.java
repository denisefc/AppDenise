package br.edu.infnet.AppDenise.model.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Entity
@Getter
@Setter
@Table(name = "TPedido")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int numeroPedido;
    private float totalReais;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, orphanRemoval = true)
    @JoinColumn(name = "idPedido")
    private List<MovelMadeira> moveisMadeira;

    public Pedido() {
        this.moveisMadeira = new ArrayList<MovelMadeira>();
    }

    public Pedido(Integer id) {
        this();
        this.setId(id);
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
