package br.edu.aula.produtos.controller;

import br.edu.aula.produtos.entity.Produto;
import br.edu.aula.produtos.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos") // Boa pratica: centraliza a rota base aqui
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public ResponseEntity<Void> cadastrarProduto(@RequestBody Produto produto) {
        produtoService.addProduto(produto);
        // Retorna 201 Created sem corpo (ou use .build() se nao enviar nada)
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id) {

        produtoService.deleteById(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> atualizarProduto(@PathVariable Long id, @RequestBody Produto produto) {
        Produto produto1 = produtoService.findById(id);

        produto1.setNome(produto.getNome());
        produto1.setPreco(produto.getPreco());
        produto1.setCategoria(produto.getCategoria());

        produtoService.atualizarProduto(produto1);

        return  ResponseEntity.status(HttpStatus.CREATED).build();
    }



    @GetMapping
    public ResponseEntity<List<Produto>> listarProdutos() {
        List<Produto> produtos = produtoService.getProdutos();
        return ResponseEntity.ok(produtos); // Retorna 200 OK com a lista
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getProduto(@PathVariable Long id) {
        Produto produto = produtoService.findById(id);
        return ResponseEntity.ok(produto); // Retorna 200 OK com o produto
    }
}
