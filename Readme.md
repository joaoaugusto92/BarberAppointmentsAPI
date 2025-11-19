# BarberAppointmentsAPI 💈📅

API de backend desenvolvida em Java com Spring Boot para gerenciar o agendamento de horários em barbearias. O sistema é responsável pela persistência e gestão dos dados de clientes, barbeiros, serviços e agendamentos.

## 🛠️ Stack Tecnológica

As seguintes tecnologias e ferramentas foram utilizadas na construção deste projeto:

* **Linguagem:** Java (versão recomendada: 25+)
* **Framework:** Spring Boot 3.x
* **Banco de Dados:** PostgreSQL (Produção/Desenvolvimento)
* **Migração de BD:** Flyway
* **ORM:** Spring Data JPA / Hibernate
* **Servidor Web:** Tomcat embarcado
* **Documentação API:** Springdoc OpenAPI (Swagger UI)
* **Gerenciador de Dependências:** Maven
* **Testes:** JUnit 5, Spring Boot Test, H2 Database (em memória)

---

## 🚀 Pré-requisitos

Antes de começar, você deve ter as seguintes ferramentas instaladas em seu ambiente:

1.  **Git**
2.  **Java JDK** (versão 25)
3.  **Maven** (3.8.7 ou superior)
4.  **PostgreSQL** (Rodando localmente ou com acesso remoto para o ambiente de desenvolvimento)

---

## ⚙️ Configuração do Ambiente

O projeto utiliza variáveis de ambiente para a configuração de acesso ao banco de dados e parâmetros de segurança.

### 1. Variáveis de Ambiente

Crie um arquivo `.env` ou configure as seguintes variáveis no seu ambiente de execução:

| Variável       | Descrição | Exemplo (PostgreSQL) |
|:---------------| :--- | :--- |
| `DB_URL`       | URL de conexão com o PostgreSQL. | `jdbc:postgresql://localhost:5432/barberdb` |
| `DB_USER`      | Usuário do banco de dados. | `barberuser` |
| `DB_PASSWORD`  | Senha do banco de dados. | `sua_senha_segura` |
| `TOKEN_SECRET` | Chave secreta usada para JWT. | `seu_segredo_para_jwt` |

### 2. Configuração do Flyway

As migrações do banco de dados são gerenciadas pelo **Flyway**, localizadas em `src/main/resources/db/migration`. Ao iniciar a aplicação, o Flyway garantirá que o schema do banco de dados esteja atualizado.

---

## 💻 Instalação e Execução

Siga os passos abaixo para instalar e rodar a aplicação localmente.

### 1. Clonar o Repositório

```bash 

git clone https://github.com/joaoaugusto92/BarberAppointmentsAPI.git
cd BarberAppointmentsAPI
```
### Baixar as dependências do maven
```bash

# Baixa as dependências do Maven
mvn clean install
```

### Executar a Aplicação
   Certifique-se de que as variáveis de ambiente (do item ⚙️ Configuração do Ambiente) estão carregadas em seu terminal.

```bash

# Executa a aplicação Spring Boot
mvn spring-boot:run
```

A aplicação estará rodando em http://localhost:8080.

📝 Documentação da API (Swagger UI)
A documentação interativa da API é gerada automaticamente pelo Springdoc OpenAPI (Swagger UI).

Com a aplicação rodando, acesse a documentação em seu navegador:

http://localhost:8080/swagger-ui.html

Utilize a interface do Swagger para visualizar todos os endpoints disponíveis (/agendamentos, /barbeiros, etc.), os modelos de dados e testar as requisições.

## 🧪 Testes
O projeto utiliza JUnit 5 e Spring Boot Test para testes de unidade e integração. Para os testes de integração, o banco de dados H2 em memória é utilizado, e o Flyway é desativado, garantindo isolamento e rapidez.

Para executar toda a suíte de testes (unidade e integração):
```bash

mvn test 
```
### 👨‍💻 Desenvolvedor:
**João Augusto**

- Função: Programador Back End

- Linguagem principal: Java com Spring framework

- GitHub: https://github.com/joaoaugusto92
