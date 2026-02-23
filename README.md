# app-asminasdacidade

Aplicação web para controlar e divulgar trabalhos freelances para mulheres.

## Estrutura inicial do repositório

```text
.
├── infra/                  # Infraestrutura (IaC, containers e scripts)
│   ├── docker/
│   ├── kubernetes/
│   ├── terraform/
│   └── scripts/
├── backend/                # Backend em Java
│   └── src/
│       ├── main/
│       │   ├── java/
│       │   └── resources/
│       └── test/
│           └── java/
└── frontend/               # Frontend em Angular
    └── src/
        ├── app/
        ├── assets/
        └── environments/
```

## Próximos passos sugeridos

1. Inicializar o backend com Spring Boot (`backend`).
2. Inicializar o frontend com Angular CLI (`frontend`).
3. Definir containers e provisionamento em `infra`.
