package com.ufcg.si1.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ufcg.si1.model.Produto;
import com.ufcg.si1.util.CustomErrorType;

import exceptions.ObjetoInvalidoException;

@Service
public class EstoqueService {
	
	private static final AtomicLong counter = new AtomicLong();
	private ProdutoService produtoService = new ProdutoServiceImpl();
	private LoteService loteService = new LoteServiceImpl();
	
	public ResponseEntity listAllUsers(List<Produto> produtos) {

		if (produtos.isEmpty()) {
			return new ResponseEntity(HttpStatus.NO_CONTENT);
			// You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Produto>>(produtos, HttpStatus.OK);
		
	}
	
	public ResponseEntity criarProduto(List<Produto> produtos, Produto produto) {
		
		boolean produtoExiste = false;

		for (Produto p : produtos) {
			if (p.getCodigoBarra().equals(produto.getCodigoBarra())) {
				produtoExiste = true;
			}
		}

		if (produtoExiste) {
			return new ResponseEntity(new CustomErrorType("O produto " + produto.getNome() + " do fabricante "
					+ produto.getFabricante() + " ja esta cadastrado!"), HttpStatus.CONFLICT);
		}

		try {
			produto.mudaSituacao(Produto.INDISPONIVEL);
		} catch (ObjetoInvalidoException e) {
			return new ResponseEntity(new CustomErrorType("Error: Produto" + produto.getNome() + " do fabricante "
					+ produto.getFabricante() + " alguma coisa errada aconteceu!"), HttpStatus.NOT_ACCEPTABLE);
		}
		
		produto.mudaId(counter.incrementAndGet());
		
		return new ResponseEntity<Produto>(produto, HttpStatus.CREATED);
		
	}
	
	public ResponseEntity consultarProduto(List<Produto> produtos, long id) {
		
		Produto p = null;

		for (Produto produto : produtos) {
			if (produto.getId() == id) {
				p = produto;
			}
		}

		if (p == null) {
			return new ResponseEntity(new CustomErrorType("Produto with id " + id + " not found"),
					HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Produto>(p, HttpStatus.OK);
		
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
