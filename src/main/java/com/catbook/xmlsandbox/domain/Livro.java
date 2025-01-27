package com.catbook.xmlsandbox.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JacksonXmlRootElement(localName = "livro")
@Entity
public class Livro {

    @Id
    @JacksonXmlProperty(localName = "id")
    private Long id;

    @JacksonXmlProperty(localName = "titulo")
    private String titulo;

    @JacksonXmlProperty(localName = "autor")
    private String autor;

    @JacksonXmlProperty(localName = "isbn")
    private String isbn;

    @JacksonXmlProperty(localName = "dataPublicacao")
    private LocalDate dataPublicacao;

    @JacksonXmlProperty(localName = "preco")
    private Double preco;

    public String getTitulo() {
        return titulo;
    }
}
