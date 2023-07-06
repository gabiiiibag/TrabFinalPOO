package br.edu.atitus.TrabFinal.TrabPedido.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.atitus.TrabFinal.TrabPedido.Entities.Pedido;
import br.edu.atitus.TrabFinal.TrabPedido.Services.GenericService;
import br.edu.atitus.TrabFinal.TrabPedido.Services.PedidoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pedidos")
public class PedidoController extends GenericController<Pedido> {
	
	final PedidoService pedidoService;
	public PedidoController(PedidoService pedidoService) {
		super();
		this.pedidoService = pedidoService;
	}
	
	@Override
	GenericService<Pedido> getService() {
		return pedidoService;
	}
}