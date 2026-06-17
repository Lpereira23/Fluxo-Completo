# Agenda Saúde Web

Sistema web para gerenciamento de atendimentos e exames na área da saúde.

Projeto desenvolvido como material educacional para demonstração do ciclo completo de desenvolvimento de software utilizando arquitetura cliente-servidor, containers, integração contínua e publicação em ambiente web.

# Tecnologias Utilizadas

| Camada            | Tecnologia                  |
| ----------------- | --------------------------- |
| Backend           | Java 17                     |
| Framework Backend | Spring Boot 3.2             |
| Frontend          | React 18                    |
| Banco de Dados    | PostgreSQL 15               |
| Build Backend     | Maven                       |
| Build Frontend    | Node.js 20 + npm            |
| Versionamento     | Git + GitHub                |
| CI/CD             | GitHub Actions              |
| Containers        | Docker + Docker Compose     |
| Produção          | AWS (ECS + RDS + ECR + ALB) |

---

# Estrutura do Projeto

```text
agenda-saude-web/

├── backend/
│   ├── pom.xml
│   ├── Dockerfile
│   └── src/
│
├── frontend/
│   ├── package.json
│   ├── Dockerfile
│   └── src/
│
├── docker-compose.yml
├── README.md
├── .github/workflows/
│   └── ci-cd.yml
│
└── docs/
```

---

# Funcionalidades

## Profissional de Saúde

Cadastro e gerenciamento dos profissionais cadastrados.

### Atributos

* id
* nome
* telefone
* endereço
* categoria

### Categorias

* Médico
* Psicólogo
* Fisioterapeuta

### Operações

* Inserir
* Alterar
* Consultar por ID
* Consultar por Nome
* Consultar por Categoria
* Excluir

---

## Atendimento

Registro dos atendimentos realizados.

### Atributos

* id
* dataHorario
* titulo
* linkVideoConferencia
* video
* receita

### Operações

* Inserir
* Alterar
* Consultar
* Excluir

---

## Exame Laboratorial

Controle de exames e recomendações.

### Atributos

* id
* descricao
* atividadeFisica
* atividadeMental
* posologia

### Operações

* Inserir
* Alterar
* Consultar
* Excluir

---

# Arquitetura

```text
React
↓

Spring Boot REST API
↓

JPA / Hibernate
↓

PostgreSQL
```

---

# Pré-requisitos

Instalar:

* Java 17+
* Maven 3.9+
* Node.js 20+
* Docker Desktop
* Git

Verificar instalação:

```bash
java -version
mvn -version
node -v
docker -v
```

---

# Como Executar (Desenvolvimento)

## Clonar o repositório

```bash
git clone https://github.com/SEU_USUARIO/agenda-saude-web.git

cd agenda-saude-web
```

# Licença

Projeto desenvolvido exclusivamente para fins acadêmicos e educacionais.
