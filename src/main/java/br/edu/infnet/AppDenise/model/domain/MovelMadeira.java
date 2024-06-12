package br.edu.infnet.AppDenise.model.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "TMovelMadeira")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class MovelMadeira {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private int codigo;
    private float preco;
    private boolean disponivel;
    private String tipoMadeira;
    @ManyToOne
    @JoinColumn(name = "idPedido")
    private Pedido pedido;

    @Override
    public String toString() {
        return String.format("%d - %s - %.2f - %d - %s - %s",
                id,
                descricao,
                preco,
                codigo,
                disponivel ? "disponivel=S" : "disponivel=N",
                tipoMadeira
        );
    }
}
