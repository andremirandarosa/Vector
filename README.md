# Vector
### Desafio Vector

> André Luiz Miranda da Rosa (andremirandarosa@gmail.com)

*Linguagem de Programação: Java (JDK: 1.8)*

------------

Sistema de Cadastro de Contas Bancárias. Front-End desenvolvido em Angular e com o Back-End 1 que recebe requisições de cadastro de conta bancária e envia mensagens para o Kafka. O Back-End 2 recebe as mensagens do Kafka e salva no DB H2 em memória.

*OBS:* O build do Front-End já está encapsulado na aplicação web do Back-End 1.

------------
### EXECUÇÃO:

**Criar Package nos Sub-Diretórios Backend1 e Backend2:** mvn package

**Executar Docker-Compose na Raíz do Projeto:** sudo docker-compose up

------------

### ACESSOS:

**BACKEND 1:** http://localhost:8080

**CONSOLE H2:** http://localhost:8081/h2

---
*Dados de Acesso H2:*

**JDBC URL:** jdbc:h2:mem:vector

**Username:** admin

**Password:** admin

**Tabela de Contas:** CONTA

