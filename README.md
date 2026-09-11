# Desafio Técnico — Processo Seletivo de Estágio (BZR Group)

Solução desenvolvida em Java para os pontos técnicos do case, organizada em três programas independentes.

## Estrutura do projeto

```text
desafio-java/
├── pom.xml
└── src/main/
    ├── java/br/com/leticia/desafio/
    │   ├── Programa1.java   (ponto 1)
    │   ├── Programa2.java   (ponto 2)
    │   └── Programa3.java   (pontos 3, 4 e 5)
    └── resources/
        ├── test1.json
        ├── test2_text1.txt
        └── test2_text2.txt
```

## Ponto 1 — Soma dos valores do JSON

O `Programa1.java` realiza a leitura do arquivo `test1.json`, que contém um array com valores numéricos representados tanto como números quanto como textos, como no exemplo:

```json
[1, "2", 3, "4"]
```

Para realizar a leitura e interpretação do JSON, foi utilizada a biblioteca Jackson (`jackson-databind`).

O programa percorre cada elemento do array e verifica seu tipo:

* valores numéricos são convertidos diretamente para inteiro;
* valores textuais são convertidos para inteiro utilizando `Integer.parseInt()`.

Após o processamento, os valores são somados.

**Resultado obtido:**

```text
Soma total: 10
```

## Ponto 2 — Comparação dos arquivos

O `Programa2.java` realiza a leitura dos arquivos `test2_text1.txt` e `test2_text2.txt` utilizando UTF-8.

Após a leitura, os conteúdos são armazenados como `String` e comparados utilizando o método `.equals()`.

Como existe uma diferença entre os caracteres presentes nos arquivos, a comparação retorna `false`.

**Resultado obtido:**

```text
Os arquivos possuem os mesmos caracteres? false
```

## Pontos 3, 4, 5 e 6 — Diferença entre datas

O `Programa3.java` calcula a quantidade de dias entre 15 de fevereiro e 15 de outubro dos anos solicitados no case.

Para isso, foram utilizadas as classes `LocalDate` e `ChronoUnit.DAYS`, da API de datas do Java.

| Ano  | Dias |
| ---- | ---- |
| 2000 | 243  |
| 2001 | 242  |
| 1900 | 242  |
| 1582 | 232  |

Os resultados são calculados utilizando:

```java
ChronoUnit.DAYS.between(dataInicial, dataFinal)
```

O uso de `LocalDate` permite trabalhar com as regras de calendário sem a necessidade de realizar manualmente os cálculos de quantidade de dias de cada mês.

### Observação sobre o ano de 1582

Para o ano de 1582, foi considerado o contexto histórico da reforma do calendário Gregoriano. Durante a adoção do novo calendário, 10 dias foram suprimidos em determinados locais, com a passagem de 4 de outubro para 15 de outubro.

Como o `LocalDate` utiliza o calendário Gregoriano de forma contínua, o cálculo padrão retorna 242 dias. Para representar a diferença considerando a supressão histórica desses 10 dias, foi realizado o ajuste de 10 dias no resultado, chegando a **232 dias**.

Esse ajuste foi aplicado de forma explícita no código para deixar clara a regra considerada no cálculo.

## Tecnologias utilizadas

* Java
* Maven
* Jackson
* Java Time API
* Spring Tools Suite (STS)

## Como executar

Os três programas possuem métodos `main` independentes e podem ser executados individualmente pela IDE.

### Programa 1

Executar a classe:

```text
br.com.leticia.desafio.Programa1
```

### Programa 2

Executar a classe:

```text
br.com.leticia.desafio.Programa2
```

### Programa 3

Executar a classe:

```text
br.com.leticia.desafio.Programa3
```

Os arquivos utilizados pelos programas devem permanecer dentro de:

```text
src/main/resources/
```

## Dependência utilizada

O projeto utiliza a biblioteca Jackson para leitura do arquivo JSON.

A dependência está configurada no `pom.xml`.

## Autora

Leticia Gabrielle Claudino da Paz
