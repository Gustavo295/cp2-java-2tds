package br.com.fiap.cp_api_rest.Repository;

import br.com.fiap.cp_api_rest.Entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StatusRepository extends JpaRepository<Status, Long> {
}
