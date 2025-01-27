# XML Sandbox

Este projeto é uma aplicação **Spring Boot** que demonstra como manipular dados em XML utilizando **Jackson** e **JPA**. Ele inclui endpoints para criação, recuperação, listagem e exclusão de livros.

## Requisitos

- **Java 23**
- **Maven**
- **Spring Boot 3.4.2**

---

## Configuração

### 1. Clone o repositório

```bash
git clone https://github.com/your-username/xml-sandbox.git
cd xml-sandbox
```

### 2. Construa o projeto
```bash
mvn clean install
```

### 3. Execute a aplicação
```bash
mvn spring-boot:run
```

A aplicação será iniciada em: http://localhost:8080.

<hr>

## Endpoints
### Criar um livro
**URL:** /api/livros
**Método:** POST
**Consumes:** application/xml
**Exemplo de Corpo da Requisição:**
```xml
<livro>
  <id>1</id>
  <titulo>Example Book</titulo>
  <autor>Example Author</autor>
  <isbn>123-4567890123</isbn>
  <dataPublicacao>2023-10-01</dataPublicacao>
  <preco>29.99</preco>
</livro>
```
<hr>
## H2
Para acessar o console do banco de dados H2, certifique-se de que a aplicação esteja em execução e acesse:
http://localhost:8080/h2-console

#### **Credenciais de Acesso:**
**JDBC URL:** jdbc:h2:mem:testdb
**Usuário:** sa
**Senha:** password

<hr>

## Licença
*Este projeto está licenciado sob a licença MIT.*

*Essa versão utiliza formatação Markdown adequada, como títulos, listas e blocos de código, para melhorar a legibilidade.*