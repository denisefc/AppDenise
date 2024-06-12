package br.edu.infnet.AppDenise.model.service;

import br.edu.infnet.AppDenise.model.domain.Armario;
import br.edu.infnet.AppDenise.model.repository.ArmarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ArmarioService {
    @Autowired
    private ArmarioRepository armarioRepository;

    public void incluir(Armario armario){
        armarioRepository.save(armario);
    }

    public Collection<Armario> obterLista(){
        return (Collection<Armario>) armarioRepository.findAll();
    }

    public Armario obterPorId(Integer id) {
        return armarioRepository.findById(id).orElse(null);
    }

    public void excluir(Integer id) {
        armarioRepository.deleteById(id);
    }

    public long obterQtde() {
        return armarioRepository.count();
    }
}
