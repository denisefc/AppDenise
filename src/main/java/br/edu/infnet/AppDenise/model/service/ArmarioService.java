package br.edu.infnet.AppDenise.model.service;

import br.edu.infnet.AppDenise.model.domain.Armario;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ArmarioService {
    private static Map<Integer, Armario> mapa = new HashMap<>();
    private static Integer id = 0;

    public void incluir(Armario armario){
        armario.setId(++id);
        mapa.put(armario.getId(), armario);
    }

    public Collection<Armario> obterLista(){
        return mapa.values();
    }
}
