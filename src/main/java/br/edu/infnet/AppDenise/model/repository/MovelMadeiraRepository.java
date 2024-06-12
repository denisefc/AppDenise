package br.edu.infnet.AppDenise.model.repository;

import br.edu.infnet.AppDenise.model.domain.MovelMadeira;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovelMadeiraRepository extends CrudRepository<MovelMadeira, Integer> {
}
