# App As Minas da Cidade

Aplicação inicial em **Java 17** com **Spring Boot 3**, arquitetura modular por camadas e estrutura de **BDD com Cucumber**.

## Arquitetura

- **domain**: regras e contratos de negócio.
- **application**: casos de uso.
- **infrastructure**: implementações técnicas (repositórios, integrações).
- **interfaces**: entrada/saída (REST controllers).
- **shared**: DTOs e utilitários compartilhados.

## Endpoint inicial

- `GET /api/v1/greetings`

Resposta exemplo:

```json
{
  "message": "App inicial da As Minas da Cidade no ar!",
  "generatedAt": "2026-01-01T12:00:00Z"
}
```

## BDD

Feature em `src/test/resources/features/greeting.feature` com step definitions em `src/test/java/br/com/asminasdacidade/bdd`.

Executar:

```bash
mvn clean test
```

## Executando localmente

```bash
mvn spring-boot:run
```

## Deploy no Heroku

O projeto já inclui `Procfile` para publicação.

### Build e release

```bash
heroku create <nome-do-app>
git push heroku main
heroku ps:scale web=1
```

### Observações

- Heroku injeta a variável `PORT`, utilizada no `Procfile`.
- O artifact gerado é `target/app-asminasdacidade-0.0.1-SNAPSHOT.jar`.
