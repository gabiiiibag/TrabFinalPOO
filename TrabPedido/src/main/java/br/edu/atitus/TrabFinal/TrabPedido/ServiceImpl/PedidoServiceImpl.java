package br.edu.atitus.TrabFinal.TrabPedido.ServiceImpl;

import org.springframework.stereotype.Service;

import br.edu.atitus.TrabFinal.TrabPedido.Repositories.PedidoRepository;
import br.edu.atitus.TrabFinal.TrabPedido.Services.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService{

	final PedidoRepository pedidoRepository;
	public PedidoServiceImpl(PedidoRepository pedidoRepository) {
		super();
		this.pedidoRepository = pedidoRepository;
	}


	@Override
	public PedidoRepository getRepository() {
		return pedidoRepository;
	}
}