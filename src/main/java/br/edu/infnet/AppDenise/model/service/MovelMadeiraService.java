package br.edu.infnet.AppDenise.model.service;

import br.edu.infnet.AppDenise.model.domain.MovelMadeira;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class MovelMadeiraService {
    private static Map<Integer, MovelMadeira> mapa = new HashMap<>();

    private static Integer id = 0;

    public void incluir(MovelMadeira movelMadeira){
        movelMadeira.setId(++id);
        mapa.put(movelMadeira.getId(), movelMadeira);
    }

    public Collection<MovelMadeira> obterLista(){
        return mapa.values();
    }
}
