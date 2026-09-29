package br.edu.aula.produtos.controller;

import br.edu.aula.produtos.entity.Categoria;
import br.edu.aula.produtos.service.CategoriaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping
    public List<Categoria> findAll() {
        return categoriaService.findAll();
    }

    @PostMapping
    public Categoria save(@RequestBody Categoria categoria) {
        return categoriaService.save(categoria);
    }
}
