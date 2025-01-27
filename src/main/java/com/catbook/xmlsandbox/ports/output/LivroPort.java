package com.catbook.xmlsandbox.ports.output;

import com.catbook.xmlsandbox.domain.Livro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LivroPort {
    Livro buscarLivroPorId(Long id);
    List<Livro> listarTodosLivros();
    Livro salvarLivro(Livro livro);
    void deletarLivro(Long id);
}
