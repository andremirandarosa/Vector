# Vector
### Desafio Vector - Sistema de Cadastro de Contas Bancárias

> André Luiz Miranda da Rosa (andremirandarosa@gmail.com)

*Linguagem de Programação: Java (JDK: 1.8)*

------------

Front-End desenvolvido em Angular, com o Back-End 1 que recebe requisições de cadastro de contas bancárias (Agência e Conta) e envia mensagens para o Kafka. O Back-End 2 recebe as mensagens do Kafka e salva no DB H2 em memória.

**OBS:** O Build do Front-End está encapsulado na aplicação web do Back-End 1.

------------
### EXECUÇÃO:

**Criar Package nos Sub-Diretórios Backend1 e Backend2:** mvn package

**Executar Docker-Compose (Raíz do Projeto):** sudo docker-compose up

------------

### ACESSOS:

**APLICAÇÃO WEB DO BACK-END 1:** http://localhost:8080

**CONSOLE H2 DO BACK-END 2:** http://localhost:8081/h2

---
*Dados de Acesso do Console H2:*

**JDBC URL:** jdbc:h2:mem:vector

**Username:** admin

**Password:** admin

**Tabela de Contas:** CONTA

