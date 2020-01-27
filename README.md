# Vector
### Desafio Vector

> André Luiz Miranda da Rosa (andremirandarosa@gmail.com)

*Linguagem de Programação: Java (JDK: 1.8)*

------------

Sistema de Cadastro de Contas Bancárias. FrontENd desenvolvido em Angular e com o BackEnd 1 que recebe a requisição de cadastro de conta bancária e envia uma mensagem para o Kafka. O BackEnd 2 recebe as mensagens do Kafka e salva no DB em memória H2.

*OBS:* O build do FrontEnd fui encapsulado na aplicação web do BackEnd 1.

------------
### DOCKER:

**Criar Package:** mvn package

**Criar Imagem Docker:** sudo docker build -t vector .

**Criar e Executar Container:** sudo docker run --network host -d --name vector vector

------------

### ACESSOS:

**BACKEND 1:** http://localhost:8080

**CONSOLE H2:** http://localhost:8081/h2

---
*Dados de Acesso H2:*

**JDBC URL:** jdbc:h2:mem:vector

**Username:** admin

**Password:** admin

**Tabela:** CONTA

