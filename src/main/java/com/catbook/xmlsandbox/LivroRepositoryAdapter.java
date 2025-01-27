package com.catbook.xmlsandbox;

import com.catbook.xmlsandbox.adapters.output.LivroRepository;
import com.catbook.xmlsandbox.domain.Livro;
import com.catbook.xmlsandbox.ports.output.LivroPort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class LivroRepositoryAdapter implements LivroPort {

    private final LivroRepository livroRepository;

    public LivroRepositoryAdapter(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @Override
    public Livro buscarLivroPorId(Long id) {
        return livroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Livro não encontrado."));
    }

    @Override
    public List<Livro> listarTodosLivros() {
        return livroRepository.findAll();
    }

    @Override
    public Livro salvarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    @Override
    public void deletarLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
