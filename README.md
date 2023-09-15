# Desafios de Código em Java

## [Versão em Inglês](#java-code-challenges-english-version)

Neste repositório, você encontrará uma coleção de desafios resolvidos em Java, que foram parte integrante do bootcamp. Cada desafio está organizado em sua própria pasta com um nome descritivo. Abaixo, você encontrará uma breve descrição de cada desafio e os requisitos específicos.

## Certificado de Conclusão
[Certificado de Conclusão do Bootcamp](https://www.dio.me/certificate/8B527812)

## Sumário
- [Desafios de Código em Java](#desafios-de-código-em-java)
  - [Versão em Inglês](#versão-em-inglês)
  - [Certificado de Conclusão](#certificado-de-conclusão)
  - [Sumário](#sumário)
    - [Desafio 1: Validando a Força de Senhas no IAM](#desafio-1-validando-a-força-de-senhas-no-iam)
    - [Desafio 2: Velocidade de Download na AWS](#desafio-2-velocidade-de-download-na-aws)
    - [Desafio 3: Calculando Seus Custos na AWS](#desafio-3-calculando-seus-custos-na-aws)
    - [Desafio 4: Regras Para Dimensionamento de Infraestrutura com EKS](#desafio-4-regras-para-dimensionamento-de-infraestrutura-com-eks)
    - [Desafio 5: Monitoramento e Análise de Logs AWS](#desafio-5-monitoramento-e-análise-de-logs-aws)
  - [Java Code Challenges (English Version)](#java-code-challenges-english-version)
  - [Completion Certificate](#completion-certificate)
  - [Table of Contents](#table-of-contents)
    - [Challenge 1: Validating Password Strength in IAM](#challenge-1-validating-password-strength-in-iam)
    - [Challenge 2: AWS Download Speed](#challenge-2-aws-download-speed)
    - [Challenge 3: Calculating Your Costs on AWS](#challenge-3-calculating-your-costs-on-aws)
    - [Challenge 4: Scaling Rules for EKS Infrastructure](#challenge-4-scaling-rules-for-eks-infrastructure)
    - [Challenge 5: AWS Logs Monitoring and Analysis](#challenge-5-aws-logs-monitoring-and-analysis)

---

### Desafio 1: Validando a Força de Senhas no IAM

**Pasta:** "Password Validating"

Descrição:
Você está trabalhando para uma empresa que utiliza extensivamente os serviços da AWS, e após algumas análises, a equipe de segurança identificou que algumas senhas dos usuários no IAM são fracas e podem representar um risco à segurança dos dados da empresa. Para resolver esse problema, foi solicitado que você desenvolva um programa capaz de analisar as senhas dos usuários e fornecer uma validação de força com base em critérios predefinidos.

**Requisitos de segurança para a senha:**
- A senha deve ter no mínimo 8 caracteres.
- A senha deve conter pelo menos uma letra maiúscula (A-Z).
- A senha deve conter pelo menos uma letra minúscula (a-z).
- A senha deve conter pelo menos um número (0-9).
- A senha deve conter pelo menos um caractere especial, como !, @, #, $, %, etc.

**Entrada:**
A entrada será uma única string representando a senha que precisa ser validada.

**Saída:**
Seu programa deve retornar uma mensagem indicando se a senha fornecida pelo usuário atende aos requisitos de segurança ou não, juntamente com um feedback explicativo sobre os critérios considerados.

---

### Desafio 2: Velocidade de Download na AWS

**Pasta:** "Download Speed"

Descrição:
Você foi contratado como desenvolvedor pela "DIOCloudTech Solutions", que é especializada em serviços em nuvem baseados na AWS. Sua tarefa será criar uma calculadora de velocidade de download que leve em consideração a localização geográfica do servidor de origem e do dispositivo do usuário. Quanto mais próximo o servidor, menor será a latência e, portanto, a velocidade de download será melhor. Isso permitirá que os usuários estimem a velocidade de download para diferentes locais e servidores AWS em todo o mundo.

**Fórmula para Cálculo da Velocidade de Download (em Mbps):**
A velocidade de download estimada (VD) será dada pela fórmula:
VD = VelocidadePlano / (1 + (DistanciaServidores / 100))

**Observação:**
- A velocidade de download estimada não pode exceder a velocidade do plano de internet contratado.

**Entrada:**
O programa deve ser capaz de receber dois valores:
1. Distância física entre o servidor de origem e o dispositivo do usuário (em quilômetros).
2. Velocidade do plano de internet contratado pelo usuário (em Mbps).

**Saída:**
A calculadora deve fornecer a estimativa da velocidade de download (em Mbps) com base na fórmula de cálculo que considera a distância física e a velocidade do plano de internet.

---

### Desafio 3: Calculando Seus Custos na AWS

**Pasta:** "AWS Costs Calculate"

Descrição:
Você é um jovem engenheiro de software recém-contratado pela empresa "TechCloud". Sua equipe é responsável por desenvolver aplicativos e serviços que serão implantados na Amazon Web Services (AWS), a principal plataforma de computação em nuvem do mercado.

Sua primeira tarefa é desenvolver um programa simples em Java que auxilie os desenvolvedores a calcular os custos de execução de seus aplicativos na AWS. Para isso, você precisa coletar algumas informações e aplicar uma fórmula para determinar o custo total.

**Passos:**
1. **Defina as taxas:**
   - O custo por hora de um servidor é de R$ 0,15.
   - O custo por hora de um banco de dados é de R$ 0,05.

2. **Coletando informações:**
   - O programa deve solicitar ao usuário a quantidade de servidores e a quantidade de bancos de dados necessários para o aplicativo funcionar corretamente.

3. **Calcule os custos:**
   - Multiplique a quantidade de servidores pelo custo por hora de um servidor.
   - Multiplique a quantidade de bancos de dados pelo custo por hora de um banco de dados.
   - Some esses valores para obter o custo total.

**Entrada:**
O programa deverá receber duas entradas:
1. A quantidade de servidores necessários.
2. A quantidade de bancos de dados necessários.

**Saída:**
A saída deverá retornar um texto informando o custo total de uso da AWS por hora.

---

### Desafio 4: Regras Para Dimensionamento de Infraestrutura com EKS

**Pasta:** "EKS Rules"

Descrição:
Você é um engenheiro responsável por ajudar as equipes de desenvolvimento a calcular o número mínimo de nodes e servidores necessários para suportar seus aplicativos no cluster do EKS.

**Regras Básicas:**
- Cada node pode suportar até 10 pods.
- Cada servidor (EC2) pode suportar até 4 pods.

**Passos:**
1. **Inicialização:**
   - Defina as regras básicas de dimensionamento, ou seja, a capacidade de pods por node e pods por servidor.

2. **Recebendo as informações:**
   - Solicite ao usuário que digite o número total de pods do aplicativo.

3. **Cálculo:**
   - Calcule o número mínimo de nodes necessários, arredondando para cima o resultado da divisão do número total de pods pelo número de pods por node.
   - Calcule o número mínimo de servidores necessários, arredondando para cima o resultado da divisão do número total de pods pelo número de pods por servidor.

**Recomendações:**
- Se o número mínimo de nodes for menor ou igual a 1, exiba a recomendação de usar um único node.
- Se o número mínimo de servidores for menor ou igual a 1, exiba a recomendação de usar um único servidor.

---

### Desafio 5: Monitoramento e Análise de Logs AWS

**Pasta:** "AWS Logs Monitoring"

Descrição:
Neste desafio, você deve criar um programa em Java para realizar o monitoramento e análise de logs gerados na infraestrutura da AWS (Amazon Web Services). O programa receberá informações de eventos de diferentes serviços da AWS e realizará uma análise simples desses logs.

**Entrada:**
- Linha 1: A quantidade de logs a serem analisados.
- Linhas Seguintes: Cada linha terá as informações de log de um determinado serviço AWS, no seguinte formato:

```
yyyy-MM-dd HH:mm:ss,{AWS Service Name},{Log of the Event Registered in This AWS Service}
```

**Saída:**
O programa exibirá os resultados da análise, apresentando:
- A quantidade de eventos específicos para cada log de serviço AWS lido na Entrada (em ordem de leitura):

```
Eventos por servico:
{Nome do 1º Serviço AWS}:{Quantidade de Logs do 1º Serviço AWS}
{Nome do 2º Serviço AWS}:{Quantidade de Logs do 2º Serviço AWS}
{Nome do Nº Serviço AWS}:{Quantidade de Logs do Nº Serviço AWS}
```

- O serviço AWS que teve a maior quantidade de eventos registrados.
- O serviço AWS que teve a menor quantidade de eventos registrados.

**Observação:**
- Tenha como verdade que sempre teremos um serviço com maior incidência e outro com menor, ou seja, nunca teremos um empate.

---

Aproveite os desafios e divirta-se programando em Java! Se tiver alguma dúvida ou sugestão, sinta-se à vontade para entrar em contato. Boa codificação!

---

## Java Code Challenges (English Version)

In this repository, you will find a collection of Java code challenges that were an integral part of the bootcamp. Each challenge is organized in its own folder with a descriptive name. Below, you will find a brief description of each challenge and its specific requirements.

## Completion Certificate
[Bootcamp Completion Certificate](https://www.dio.me/certificate/8B527812)

## Table of Contents
- [Desafios de Código em Java](#desafios-de-código-em-java)
  - [Versão em Inglês](#versão-em-inglês)
  - [Certificado de Conclusão](#certificado-de-conclusão)
  - [Sumário](#sumário)
    - [Desafio 1: Validando a Força de Senhas no IAM](#desafio-1-validando-a-força-de-senhas-no-iam)
    - [Desafio 2: Velocidade de Download na AWS](#desafio-2-velocidade-de-download-na-aws)
    - [Desafio 3: Calculando Seus Custos na AWS](#desafio-3-calculando-seus-custos-na-aws)
    - [Desafio 4: Regras Para Dimensionamento de Infraestrutura com EKS](#desafio-4-regras-para-dimensionamento-de-infraestrutura-com-eks)
    - [Desafio 5: Monitoramento e Análise de Logs AWS](#desafio-5-monitoramento-e-análise-de-logs-aws)
  - [Java Code Challenges (English Version)](#java-code-challenges-english-version)
  - [Completion Certificate](#completion-certificate)
  - [Table of Contents](#table-of-contents)
    - [Challenge 1: Validating Password Strength in IAM](#challenge-1-validating-password-strength-in-iam)
    - [Challenge 2: AWS Download Speed](#challenge-2-aws-download-speed)
    - [Challenge 3: Calculating Your Costs on AWS](#challenge-3-calculating-your-costs-on-aws)
    - [Challenge 4: Scaling Rules for EKS Infrastructure](#challenge-4-scaling-rules-for-eks-infrastructure)
    - [Challenge 5: AWS Logs Monitoring and Analysis](#challenge-5-aws-logs-monitoring-and-analysis)

---

### Challenge 1: Validating Password Strength in IAM

**Folder:** "Password Validating"

Description:
You are working for a company that extensively uses AWS services, and after some analysis, the security team identified that some user passwords in IAM are weak and may pose a risk to the security of the company's data. To solve this problem, you have been asked to develop a program capable of analyzing user passwords and providing strength validation based on predefined criteria.

**Password security requirements:**
- The password must be at least 8 characters long.
- The password must contain at least one uppercase letter (A-Z).
- The password must contain at least one lowercase letter (a-z).
- The password must contain at least one number (0-9).
- The password must contain at least one special character, such as !, @, #, $, %, etc.

**Input:**
The input will be a single string representing the password to be validated.

**Output:**
Your program should return a message indicating whether the password provided by the user meets the security requirements or not, along with explanatory feedback on the criteria considered.

---

### Challenge 2: AWS Download Speed

**Folder:** "Download Speed"

Description:
You have been hired as a developer by "DIOCloudTech Solutions," which specializes in AWS-based cloud services. Your task is to create a download speed calculator that takes into account the geographical location of the source server and the user's device. The closer the server, the lower the latency, and therefore, the better the download speed. This will allow users to estimate download speed for different locations and AWS servers worldwide.

**Formula for Download Speed Calculation (in Mbps):**
The estimated download speed (VD) is given by the formula:
VD = PlanSpeed / (1 + (ServerDistance / 100))

**Note:**
- The estimated download speed cannot exceed the speed of the user's contracted internet plan.

**Input:**
The program should be able to receive two values:
1. Physical distance between the source server and the user's device (in kilometers).
2. Speed of the user's contracted internet plan (in Mbps).

**Output:**
The calculator should provide the estimated download speed (in Mbps) based on the calculation formula that takes into account the physical distance and internet plan speed.

---

### Challenge 3: Calculating Your Costs on AWS

**Folder:** "AWS Costs Calculate"

Description:
You are a newly hired software engineer at "TechCloud" company. Your team is responsible for developing applications and services that will be deployed on Amazon Web Services (AWS), the leading cloud computing platform in the market.

Your first task is to develop a simple Java program that helps developers calculate the costs of running their applications on AWS. To do this, you need to collect some information and apply a formula to determine the total cost.

**Steps:**
1. **Define the rates:**
 - The cost per hour for a server is R$ 0.15.
 - The cost per hour for a database is R$ 0.05.

2. **Collecting information:**
 - The program should ask the user for the number of servers and the number of databases required for the application to function correctly.

3. **Calculate the costs:**
 - Multiply the number of servers by the cost per hour of a server.
 - Multiply the number of databases by the cost per hour of a database.
 - Add these values to get the total cost.

**Input:**
The program should receive two inputs:
1. The number of servers required.
2. The number of databases required.

**Output:**
The output should return a text indicating the total cost of using AWS per hour.

---

### Challenge 4: Scaling Rules for EKS Infrastructure

**Folder:** "EKS Rules"

Description:
You are an engineer responsible for helping development teams calculate the minimum number of nodes and servers required to support their applications on the EKS cluster.

**Basic Rules:**
- Each node can support up to 10 pods.
- Each server (EC2) can support up to 4 pods.

**Steps:**
1. **Initialization:**
 - Define the basic scaling rules, i.e., the pods per node and pods per server capacity.

2. **Collecting information:**
 - Ask the user to enter the total number of pods required for the application.

3. **Calculation:**
 - Calculate the minimum number of nodes required by rounding up the result of dividing the total number of pods by the pods per node capacity.
 - Calculate the minimum number of servers required by rounding up the result of dividing the total number of pods by the pods per server capacity.

**Recommendations:**
- If the minimum number of nodes is less than or equal to 1, display a recommendation to use a single node.
- If the minimum number of servers is less than or equal to 1, display a recommendation to use a single server.

---

### Challenge 5: AWS Logs Monitoring and Analysis

**Folder:** "AWS Logs Monitoring"

Description:
In this challenge, you must create a Java program to monitor and analyze logs generated in the AWS (Amazon Web Services) infrastructure. The program will receive information about events from different AWS services and perform a simple analysis of these logs.

**Input:**
- Line 1: The number of logs to be analyzed.
- Subsequent lines: Each line will contain log information from a specific AWS service in the following format:

```
yyyy-MM-dd HH:mm:ss,{AWS Service Name},{Log of the Event Registered in This AWS Service}
```

**Output:**
The program will display the results of the analysis, including:
- The quantity of specific events for each AWS service log read in the input (in reading order).

```
Events per service:
{Name of the 1st AWS Service}:{Quantity of Logs for the 1st AWS Service}
{Name of the 2nd AWS Service}:{Quantity of Logs for the 2nd AWS Service}
{Name of the Nth AWS Service}:{Quantify of Logs for the Nth AWS Service}
```

- The AWS service with the highest number of recorded events.
- The AWS service with the lowest number of recorded events.

**Note:**
- Assume that there will always be one service with the highest incidence and one with the lowest, i.e., there will never be a tie.

---

Enjoy the challenges and have fun coding in Java! If you have any questions or suggestions, feel free to reach out. Happy coding!

