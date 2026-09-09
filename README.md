# DAW II — CRUD Básico com Spring Boot

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Hibernate](https://img.shields.io/badge/Hibernate-ORM-blueviolet)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-336791)
![Status](https://img.shields.io/badge/Status-Finalizado-green)

Atividade prática da disciplina **DAW II**, com o objetivo de entender na prática o funcionamento do **JPA**, **Hibernate** e **ORM** através da construção de um CRUD básico com Spring Boot.

---

## Índice

- [Visão Geral](#visão-geral)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Pré-requisitos](#pré-requisitos)
- [Variáveis de Ambiente](#variáveis-de-ambiente)
- [Roadmap](#roadmap)
  - [1. Preparar o Ambiente](#1-preparar-o-ambiente)
  - [2. Criação do Projeto](#2-criação-do-projeto)
  - [3. Testar a API](#3-testar-a-api)
  - [4. Encerramento](#4-encerramento)
- [Como Executar](#como-executar)
- [Referências](#referências)

---

## Visão Geral

Este repositório contém uma atividade de **CRUD básico** desenvolvida para fixar os conceitos de:

- **JPA** (Java Persistence API)
- **Hibernate** (implementação de ORM)
- **ORM** (Object-Relational Mapping)

A aplicação expõe uma API REST simples para gerenciar `Produtos`, persistindo os dados em um banco **PostgreSQL**.

## Tecnologias Utilizadas

| Tecnologia | Finalidade |
|---|---|
| Java | Linguagem principal |
| Spring Boot | Framework da aplicação |
| Spring Data JPA | Camada de persistência |
| Hibernate | Implementação ORM |
| PostgreSQL | Banco de dados relacional |
| Maven | Gerenciador de dependências e build |

## Estrutura do Projeto

```
src/main/java/.../daw2
├── entity/
│   └── Produto.java
├── repository/
│   └── ProdutoRepository.java
├── service/
│   └── ProdutoService.java
└── controller/
    └── ProdutoController.java
```

## Pré-requisitos

- JDK instalado (17+)
- Maven instalado (ou usar o `mvnw` incluso no projeto)
- PostgreSQL instalado e em execução
- Uma IDE (IntelliJ, Eclipse, VS Code etc.)

## Variáveis de Ambiente

O projeto inclui um arquivo [`.env.example`](.env.example) com o modelo das variáveis necessárias. Para configurar:

```bash
# Copiar o modelo e preencher com seus dados
cp .env.example .env
```

Edite o `.env` com as credenciais do seu banco local (exemplo):

```env
DB_URL=jdbc:postgresql://localhost:5432/daw2
DB_USER=postgres
DB_PASSWORD=sua_senha
```


## Roadmap

### 1. Preparar o Ambiente

- [x] Criar o projeto no [Spring Initializr](https://start.spring.io/) com as dependências **Spring Web**, **Spring Data JPA**, **PostgreSQL Driver** e **Hibernate**
- [x] Testar o build com `mvn`
- [x] Criar `.env.example` com o modelo das variáveis (`DB_USER`, `DB_PASSWORD`, `DB_URL` etc.)
- [x] Validar se as variáveis de ambiente estão sendo lidas corretamente pela aplicação

### 2. Criação do Projeto

- [x] Criar a entidade `Produto`
- [x] Criar o `ProdutoRepository`
- [x] Criar o `ProdutoService`
- [x] Criar o `ProdutoController` (REST)

### 3. Testar a API

- [x] Implementar e testar o endpoint `GET`
- [x] Implementar e testar o endpoint `POST`
- [x] Implementar e testar os endpoints `PUT`/`PATCH` e `DELETE` *(se aplicável)*

### 4. Encerramento

- [x] Verificar se as operações estão refletindo corretamente no banco de dados
- [x] Revisar código e organizar commits finais

## Como Executar

```bash
# Clonar o repositório
git clone <url-do-repositorio>
cd <nome-do-repositorio>

# Configurar variáveis de ambiente (ver seção acima)
cp .env.example .env

# Rodar a aplicação
./mvnw spring-boot:run
```

## Referências

- Aula do Professor Felipe
- [Documentação Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [Documentação Hibernate](https://hibernate.org/orm/documentation/)
