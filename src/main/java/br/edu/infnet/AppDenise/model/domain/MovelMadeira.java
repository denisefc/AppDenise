package br.edu.infnet.AppDenise.model.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public abstract class MovelMadeira {
    private Integer id;
    private String descricao;
    private int codigo;
    private float preco;
    private boolean disponivel;
    private String tipoMadeira;

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
