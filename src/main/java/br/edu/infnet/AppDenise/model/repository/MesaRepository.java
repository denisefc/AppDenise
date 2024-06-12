package br.edu.infnet.AppDenise.model.repository;

import br.edu.infnet.AppDenise.model.domain.Mesa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MesaRepository extends CrudRepository<Mesa, Integer> {
}
