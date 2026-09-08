package br.edu.aula.produtos.service;

import br.edu.aula.produtos.entity.Produto;
import br.edu.aula.produtos.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;

    }

    public void addProduto(Produto produto) {
        produtoRepository.save(produto);
    }

    public List<Produto> getProdutos() {
        return produtoRepository.findAll();
    }

    public Produto findById(Long id) {
        return produtoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Produto nao encontrado"));
    }
}
