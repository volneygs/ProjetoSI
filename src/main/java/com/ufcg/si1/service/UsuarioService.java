package com.ufcg.si1.service;

import com.ufcg.si1.model.Produto;

public interface UsuarioService {
	
	Produto pesquisaPorNome(String nome);

	Produto pesquisaPorId(long id);
	
	void mudarSenha(String password);
	
	void encerrarSessao();

	void deletarConta();


}
