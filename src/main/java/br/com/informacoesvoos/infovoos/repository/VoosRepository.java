package br.com.informacoesvoos.infovoos.repository;

import br.com.informacoesvoos.infovoos.domain.Voos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoosRepository extends CrudRepository<Voos, String> {

}
