package br.edu.aula.produtos.repository;

import br.edu.aula.produtos.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
