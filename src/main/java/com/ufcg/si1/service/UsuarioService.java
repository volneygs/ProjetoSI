package com.ufcg.si1.service;

import com.ufcg.si1.model.Produto;

public interface UsuarioService {
	
	Produto pesquisaPorNome(String nomeProduto);

	Produto pesquisaPorId(long idProduto);
	
	void mudarSenha(String password);
	
	void encerrarSessao();

	void deletarConta();


}
