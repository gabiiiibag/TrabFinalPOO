package br.edu.atitus.TrabFinal.TrabPedido.Repositories;

import java.util.Optional;
import org.springframework.stereotype.Repository;
import br.edu.atitus.TrabFinal.TrabPedido.Entities.Usuario;

@Repository
public interface UsuarioRepository extends GenericRepository<Usuario>{
	
	Optional<Usuario> findByEmail(String email);

}