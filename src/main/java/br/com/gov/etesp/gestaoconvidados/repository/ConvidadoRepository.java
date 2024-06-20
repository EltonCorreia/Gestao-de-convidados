package br.com.gov.etesp.gestaoconvidados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.gov.etesp.gestaoconvidados.entity.ConvidadoEntity;

@Repository
public interface ConvidadoRepository extends JpaRepository<ConvidadoEntity, Long> {

}
