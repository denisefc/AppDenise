package br.edu.infnet.AppDenise.model.repository;

import br.edu.infnet.AppDenise.model.domain.Armario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmarioRepository extends CrudRepository<Armario, Integer> {
}
