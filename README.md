# **GlobalTracker API - Sistema de Rastreamento de Despesas Globais**

Este projeto é uma API REST desenvolvida em Java com Spring Boot para o gerenciamento de despesas internacionais. O sistema automatiza o enriquecimento de dados através da integração com APIs externas de geolocalização e cotação de moedas.

## **🚀 Funcionalidades Principais**

*   **Enriquecimento de Dados de Localização**: Integração com a API ViaCEP para preenchimento automático de logradouro e localidade a partir do CEP informado.
*   **Conversão de Moeda em Tempo Real**: Integração com a AwesomeAPI (Economia API) para conversão automática de despesas em moedas estrangeiras (USD, EUR, ARS, etc.) para Real (BRL).
*   **Gestão de Entidades**: Cadastro e relacionamento entre Usuários, Categorias e Despesas (relacionamento ManyToOne).
*   **Persistência de Dados**: Utilização de Spring Data JPA com banco de dados H2 (em memória) para facilitar testes e demonstrações.
*   **Documentação Automática**: Interface visual via Swagger UI para teste de todos os endpoints.

## **🛠️ Tecnologias Utilizadas**

| Tecnologia | Finalidade |
| :--- | :--- |
| **Java 17+** | Linguagem de programação principal |
| **Spring Boot 3.x** | Framework para desenvolvimento da API |
| **Spring Data JPA** | Abstração para persistência de dados |
| **Spring Cloud OpenFeign** | Cliente HTTP para consumo de APIs externas |
| **Lombok** | Redução de código boilerplate (getters/setters) |
| **H2 Database** | Banco de dados SQL em memória |
| **Swagger / OpenAPI** | Documentação e testes da API |

## **📖 Como Executar o Projeto**

1.  Clone o repositório para sua máquina local.
2.  Certifique-se de ter o **Java 17** ou superior instalado.
3.  Execute a aplicação através do VS Code ou via terminal: `./mvnw spring-boot:run`
4.  Acesse a documentação interativa em: `http://localhost:8080/swagger-ui/index.html`

## **🧪 Exemplo de Uso (JSON)**
```json
{  
  "descricao": "Jantar em Paris",  
  "valorOriginal": 80.0,  
  "moeda": "EUR",  
  "cep": "60170001",  
  "usuario": { "id": 1 },  
  "categoria": { "id": 1 }  
}
