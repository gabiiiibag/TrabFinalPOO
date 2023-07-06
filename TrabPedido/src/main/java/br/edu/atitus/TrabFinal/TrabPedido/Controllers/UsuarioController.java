package br.edu.atitus.TrabFinal.TrabPedido.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.atitus.TrabFinal.TrabPedido.Entities.Usuario;
import br.edu.atitus.TrabFinal.TrabPedido.Services.GenericService;
import br.edu.atitus.TrabFinal.TrabPedido.Services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioController extends GenericController<Usuario>{
	
	final UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}
	
	@Override
	GenericService<Usuario> getService() {
		return usuarioService;
	}

}
