package com.projeto.acesso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.acesso.models.Produto;

public interface ProdutosRepository extends JpaRepository<Produto,Integer>{


}
