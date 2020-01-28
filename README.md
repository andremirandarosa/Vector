# Vector
### Desafio Vector - Sistema de Cadastro de Contas Bancárias

> André Luiz Miranda da Rosa (andremirandarosa@gmail.com)

*Linguagens de Programação: Front-End: Angular (8) - Back-End: Java (JDK: 1.8)*

------------

O Front-End envia requisições de cadastro das contas bancárias (Agência e Conta) para o Back-End 1, que as recebe e gera mensagens para o Kafka. O Back-End 2 recebe as mensagens do Kafka e salva no DB H2 (em memória).

------------
### EXECUÇÃO:

**Criar Package com Maven nos Sub-Diretórios Backend1 e Backend2:** 

mvn package

**Executar Docker-Compose (Raíz do Projeto):** 

sudo docker-compose build

sudo docker-compose up

------------

### ACESSOS:

**FRONTEND:** http://localhost:4200

**BACKEND 1:** http://localhost:8080

**BACKEND 2:** http://localhost:8081

**CONSOLE H2 DO BACK-END 2:** http://localhost:8081/h2

---
*Dados de Acesso do Console H2:*

**JDBC URL:** jdbc:h2:mem:vector

**Username:** admin

**Password:** admin

**Tabela de Contas:** CONTA

