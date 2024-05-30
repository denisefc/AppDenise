package br.edu.infnet.AppDenise.model.service;

import br.edu.infnet.AppDenise.model.domain.Mesa;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MesaService {
    private static Map<Integer, Mesa> mapa = new HashMap<>();

    private static Integer id = 0;

    public void incluir(Mesa mesa){
        mesa.setId(++id);
        mapa.put(mesa.getId(), mesa);
    }

    public Collection<Mesa> obterLista(){
        return mapa.values();
    }

    public Mesa obterPorId(Integer id) {
        return mapa.get(id);
    }

    public void excluir(Integer id) {
        mapa.remove(id);
    }
}
