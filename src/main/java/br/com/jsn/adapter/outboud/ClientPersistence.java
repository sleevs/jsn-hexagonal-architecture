package br.com.jsn.adapter.outboud;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jsn.adapter.entity.ClientEntity;



@Repository
public interface ClientPersistence extends JpaRepository<ClientEntity, Long>{

	
}
