package br.edu.atitus.TrabFinal.TrabPedido.Services;

import org.springframework.security.core.userdetails.UserDetailsService;

import br.edu.atitus.TrabFinal.TrabPedido.Entities.Usuario;

public interface UsuarioService extends GenericService<Usuario>, UserDetailsService{
	
	void alteraStatus(long id) throws Exception;

}