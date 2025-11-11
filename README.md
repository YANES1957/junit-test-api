 🔴 JUnit-Test API

Bem-vindo ao repositório **JUnit-Test API**, um projeto Java com **Spring Boot 3.5.7** que demonstra de forma completa **todos os tipos de testes** possíveis em uma aplicação: **unitários, integração, BDD (Cucumber), e testes automatizados**.  
Este projeto criei parar diversificar meu portfólio, e demonstrar minhas habilidades em QA e desenvolvimento de APIs.



 🚀 Descrição do Projeto:

A JUnit-Test API é uma aplicação de exemplo que gerencia **entidades `Pessoa`**, permitindo operações de **CRUD (Create, Read, Update, Delete)**.  
O diferencial deste projeto é que ele incorpora **todos os tipos de testes possíveis, untitários e automatizados** em um único projeto, mostrando como implementar QA de ponta a ponta em uma API Java.



 🛠 Tecnologias Utilizadas:

- **Java 21**  
- **Spring Boot 3.5.7**  
- **Maven 3.9.11**  
- **Spring Web, Spring Data JPA, Spring Validation**  
- **Banco de dados H2 (em memória)**  
- **JUnit 5 (Jupiter)** para testes unitários  
- **Mockito** para mocks  
- **AssertJ** para asserts avançados  
- **Cucumber (7.31.0)** para testes BDD  
- **Spring Boot Test** para integração  
- **Maven Surefire Plugin** para execução de testes  



 📂 Estrutura do Projeto:

junit-test-api/
├── src/
│ ├── main/
│ │ ├── java/com/roberto/junittest/
│ │ │ ├── controller/ # PessoaController.java
│ │ │ ├── model/ # Pessoa.java
│ │ │ ├── repository/ # PessoaRepository.java
│ │ │ └── service/ # PessoaService.java
│ │ └── resources/
│ │ └── application.properties
│ └── test/
│ ├── java/com/roberto/junittest/
│ │ ├── unit/ # Testes unitários (PessoaUnitTest.java)
│ │ ├── integration/ # Testes de integração (PessoaIntegrationTest.java)
│ │ ├── bdd/
│ │ │ ├── features/ # Arquivos .feature
│ │ │ ├── steps/ # PessoaSteps.java
│ │ │ └── futures/ # Funcionalidades futuras de teste
│ │ └── api/ # Testes de API e automação
│ └── runner/ # PessoaRunner.java
└── pom.xml




 ✅ Tipos de Testes Implementados:

 1. Testes Unitários
- **Classe:** `PessoaUnitTest.java`  
- Testam cada método individualmente (`salvar`, `buscarPorId`, `deletar`, etc.)  
- Utiliza **JUnit 5 + Mockito + AssertJ**  

 2. Testes de Integração
- **Classe:** `PessoaIntegrationTest.java`  
- Testam a integração entre **controller, service e repository**  
- Valida a comunicação com o **banco H2 em memória**  

 3. Testes BDD (Behavior Driven Development)
- **Framework:** Cucumber  
- **Pasta features:** arquivos `.feature` descrevendo cenários  
- **Steps:** `PessoaSteps.java`  
- **Runner:** `PessoaRunner.java`  
- Permite **testar comportamento do sistema de forma compreensível para stakeholders**  

 4. Testes Automatizados
- Cobrem **API endpoints** simulando requisições HTTP  
- Verificam status, payload e validações do Spring MVC  



 ⚙️ Como Rodar os Testes

 Unitários
```bash
mvn test
BDD / Cucumber
bash
Copiar código
mvn test -Dcucumber.options="classpath:features"
Integração e API
Executar com Spring Boot:

bash
Copiar código
mvn spring-boot:run
Testes de API automatizados rodarão junto com o Maven Test.

Todos os testes podem ser visualizados no console ou em relatórios gerados pelo Maven Surefire Plugin.

💡 Observações
Projeto preparado para portfólio e LinkedIn, mostrando qualquer tipo de teste em um único projeto.

Pode ser expandido para novos cenários BDD, novos endpoints e testes futuros na pasta futures.🚀


