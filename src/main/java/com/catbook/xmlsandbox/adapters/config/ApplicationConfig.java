package com.catbook.xmlsandbox.adapters.config;

import com.catbook.xmlsandbox.application.LivrosUseCase;
import com.catbook.xmlsandbox.ports.output.LivroPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {
    @Bean
    public LivrosUseCase livrosUseCase(LivroPort livroPort) {
        return new LivrosUseCase(livroPort);
    }
}
