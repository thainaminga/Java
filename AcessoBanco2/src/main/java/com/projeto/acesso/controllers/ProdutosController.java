package com.projeto.acesso.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.acesso.models.Produto;
import com.projeto.acesso.repository.ProdutosRepository;

@RestController
public class ProdutosController {

	@Autowired
	private ProdutosRepository produtosRepo;

		@GetMapping("/produtos/listar")
		public List<Produto> listar() {
		return produtosRepo.findAll();
	}
		
		@PostMapping("/produtos/cadastrar")
		public String cadastrar(@RequestBody Produto produtos) {
			
		produtosRepo.save(produtos);
		return "Cadastrou";
	}
		@PutMapping("/produtos/atualizar/{id}")
		public String atualizar(@PathVariable Integer id, @RequestBody Produto produtos) {
			String msg = "";
			Optional<Produto> c = produtosRepo.findById(id);
			
			if(c.isPresent()) {
				produtos.setIdproduto(id);
				produtosRepo.save(produtos);
				msg = "Produto atualizado";
				
			}
			else {
				msg = "Produto não encontrado";
				
			}
			return msg;
		}
		@DeleteMapping("/produto/apagar/{id}")
		public String apagar(@PathVariable Integer id) {
			String msg = "";
			Optional<Produto> c = produtosRepo.findById(id);
			
			if(c.isPresent()) {
				produtosRepo.deleteById(id);
				msg = "Produto apagado";
			}else {
				msg = "Produto não localizado";
				
			}
			return msg;
		}

}
