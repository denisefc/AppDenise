package br.edu.infnet.AppDenise.model.service;

import br.edu.infnet.AppDenise.model.domain.Pedido;
import br.edu.infnet.AppDenise.model.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public void incluir(Pedido pedido){
        pedidoRepository.save(pedido);
    }

    public Collection<Pedido> obterLista(){
        return (Collection<Pedido>) pedidoRepository.findAll();
    }

    public Pedido obterPorId(Integer id) {
        return pedidoRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        pedidoRepository.deleteById(id);
    }

    public long obterQtde() {
        return pedidoRepository.count();
    }
}
