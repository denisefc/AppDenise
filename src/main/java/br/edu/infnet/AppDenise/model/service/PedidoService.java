package br.edu.infnet.AppDenise.model.service;

import br.edu.infnet.AppDenise.model.domain.Pedido;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class PedidoService {
    private static Map<Integer, Pedido> mapa = new HashMap<>();

    private static Integer id = 0;

    public void incluir(Pedido pedido){
        pedido.setId(++id);
        mapa.put(pedido.getId(), pedido);
    }

    public Collection<Pedido> obterLista(){
        return mapa.values();
    }

    public Pedido obterPorId(Integer id) {
        return mapa.get(id);
    }

    public void excluir(Integer id) {
        mapa.remove(id);
    }
}
