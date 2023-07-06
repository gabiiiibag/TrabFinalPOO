package br.edu.atitus.TrabFinal.TrabPedido.ServiceImpl;

import org.springframework.stereotype.Service;

import br.edu.atitus.TrabFinal.TrabPedido.Entities.Produto;
import br.edu.atitus.TrabFinal.TrabPedido.Repositories.GenericRepository;
import br.edu.atitus.TrabFinal.TrabPedido.Repositories.ProdutoRepository;
import br.edu.atitus.TrabFinal.TrabPedido.Services.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService{

	final ProdutoRepository produtoRepository;
	public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
		super();
		this.produtoRepository = produtoRepository;
	}


	@Override
	public GenericRepository<Produto> getRepository() {
		return produtoRepository;
	}

}