package br.edu.infnet.AppDenise.model.service;

import br.edu.infnet.AppDenise.model.domain.Mesa;
import br.edu.infnet.AppDenise.model.repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MesaService {
    @Autowired
    private MesaRepository mesaRepository;

    public void incluir(Mesa mesa){
        mesaRepository.save(mesa);
    }

    public Collection<Mesa> obterLista(){
        return (Collection<Mesa>) mesaRepository.findAll();
    }

    public Mesa obterPorId(Integer id) {
        return mesaRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        mesaRepository.deleteById(id);
    }

    public long obterQtde() {
        return mesaRepository.count();
    }
}
