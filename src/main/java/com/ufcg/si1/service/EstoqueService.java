package com.ufcg.si1.service;

import com.ufcg.si1.model.Produto;

public interface EstoqueService {

	public Produto produtoPorNome(String nomeProduto);
	public Produto produtoPorId(long idProduto);
	
}
