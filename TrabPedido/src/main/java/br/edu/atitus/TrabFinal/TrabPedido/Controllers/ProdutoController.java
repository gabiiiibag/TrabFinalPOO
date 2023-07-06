package br.edu.atitus.TrabFinal.TrabPedido.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.atitus.TrabFinal.TrabPedido.Entities.Produto;
import br.edu.atitus.TrabFinal.TrabPedido.Services.GenericService;
import br.edu.atitus.TrabFinal.TrabPedido.Services.ProdutoService;


@RestController
@RequestMapping("/produtos")
public class ProdutoController extends GenericController<Produto>{

	final ProdutoService produtoService;
	public ProdutoController(ProdutoService produtoService) {
		super();
		this.produtoService = produtoService;
	}


	@Override
	GenericService<Produto> getService() {
		return produtoService;
	}
}