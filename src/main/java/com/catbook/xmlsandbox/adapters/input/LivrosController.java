package com.catbook.xmlsandbox.adapters.input;

import com.catbook.xmlsandbox.application.LivrosUseCase;
import com.catbook.xmlsandbox.domain.Livro;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/livros")
public class LivrosController {

    private final LivrosUseCase livrosUseCase;

    public LivrosController(LivrosUseCase livrosUseCase) {
        this.livrosUseCase = livrosUseCase;
    }

    @PostMapping(consumes = "application/xml")
    public ResponseEntity<Livro> salvarLivro(@RequestBody Livro livro) {
        Logger logger = LoggerFactory.getLogger(LivrosController.class);
        logger.info("Recebendo requisição para salvar livro: {}", livro);

        Livro novoLivro = livrosUseCase.salvarLivro(livro);

        logger.info("Livro salvo com sucesso: {}", novoLivro);

        return ResponseEntity.ok(novoLivro);
    }
}
