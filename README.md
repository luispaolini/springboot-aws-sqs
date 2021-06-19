<h2> Desenvolviment de aplicação para exemplificar o envio e consumo de mensagems para uma fila AWS SQS.</h2>

Neste exemplo, a aplicação emula a ação de um microserviço que recebe uma requisição via REST API e publica essa requisição em uma fila AWS SQS pré determinada.
Além disso, vamos usar a mesma aplicação para emular o papel de um microserviço consumidor destas mensagens.

Este projeto assume que você já tenha uma fila criada no AWS SQS e também já tenha um usuário com credenciais de acesso à esta fila.

Tópicos abordados:

* Trabalhando com filas na AWS SQS
* Usando o Spring Boot Framework para trabalhar filas SQS na AWS.

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após enviar mensagens, basta apenas usar o seguinte endereço em uma ferramenta como o Postman e enviar uma requisição JSON do tipo POST:

```
http://localhost:8080/send
```

```
{
    "message": "My first message"
}
```

São necessários os seguintes pré-requisitos para a execução do projeto:

* Java 8 ou superior
* Maven 3.8.1 ou superior
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.

Abaixo, seguem links bem bacanas, sobre tópicos mencionados:

* [Referência para o AWS SQS](https://aws.amazon.com/pt/sqs/)
* [Referência para o o AWS IAM[(https://aws.amazon.com/pt/iam/)
* [Site oficial do Spring](https://spring.io/)
* [Referência para o Spring Cloud AWS](https://cloud.spring.io/spring-cloud-aws/spring-cloud-aws.html)
