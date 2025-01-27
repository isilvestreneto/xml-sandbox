package com.catbook.xmlsandbox.adapters.output;

import com.catbook.xmlsandbox.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {
    // Métodos adicionais de consulta, se necessário
}
