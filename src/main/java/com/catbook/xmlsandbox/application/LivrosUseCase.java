package com.catbook.xmlsandbox.application;

import com.catbook.xmlsandbox.domain.Livro;
import com.catbook.xmlsandbox.ports.output.LivroPort;

import java.util.List;

public class LivrosUseCase {

    private final LivroPort livroPort;

    public LivrosUseCase(LivroPort livroPort) {
        this.livroPort = livroPort;
    }

    public Livro buscarLivro(Long id) {
        return livroPort.buscarLivroPorId(id);
    }

    public List<Livro> listarTodosLivros() {
        return livroPort.listarTodosLivros();
    }

    public Livro salvarLivro(Livro livro) {
        if (livro.getTitulo() == null || livro.getTitulo().isEmpty()) {
            throw new IllegalArgumentException("O título do livro é obrigatório.");
        }
        return livroPort.salvarLivro(livro);
    }

    public void deletarLivro(Long id) {
        livroPort.deletarLivro(id);
    }
}