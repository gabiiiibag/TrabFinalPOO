package br.edu.atitus.TrabFinal.TrabPedido.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.edu.atitus.TrabFinal.TrabPedido.Entities.Usuario;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario>{
	
	@Query(value = "UPDATE usuario set status = not status where id = :id", nativeQuery = true)
	@Modifying
	void alteraStatus(@Param("id") long id);
	
	boolean existsByEmailAndIdNot(String email, long id);
	
	Optional<Usuario> findByEmail(String email);

}