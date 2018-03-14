package com.ufcg.si1.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ufcg.si1.model.Produto;

@Service
public class EstoqueService {
	
	private ProdutoService produtoService = new ProdutoServiceImpl();
	private LoteService loteService = new LoteServiceImpl();
	
	public ResponseEntity listAllUsers() {
		
		List<Produto> produtos = produtoService.findAllProdutos();

		if (produtos.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Produto>>(produtos, HttpStatus.OK);
		
	}
	
	public void criarProduto() {
		
	}
	
	public void consultarProduto() {
		
	}
	
	public void updateProduto() {
		
	}
	
	public void deleteUser() {
		
		
	}
	
	public void criarLote() {
		
		
	}
	
	public void listAllLotes() {
		
	}

	
	
}
