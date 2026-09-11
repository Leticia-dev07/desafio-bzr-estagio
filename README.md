# Desafio Técnico — Processo Seletivo de Estágio (BZR Group)

Solução em Java para os pontos técnicos do case, organizada em três programas independentes.

## Estrutura

```
desafio-java/
├── pom.xml
└── src/main/
    ├── java/br/com/leticia/desafio/
    │   ├── Programa1.java   (ponto 1)
    │   ├── Programa2.java   (ponto 2)
    │   └── Programa3.java   (pontos 3, 4, 5 e 6)
    └── resources/
        ├── test1.json
        ├── test2_text1.txt
        └── test2_text2.txt
```

## Ponto 1 — Soma de um array em JSON (`Programa1.java`)

Lê o arquivo `test1.json`, que contém um array com números representados tanto como inteiros quanto como texto (ex.: `[1, "2", 3, "4"]`), e soma todos os valores.

- Usa a biblioteca **Jackson** (`jackson-databind`) para parsear o JSON.
- Para cada elemento do array, verifica o tipo: se for numérico, soma diretamente; se for texto, converte para inteiro antes de somar.
- Lê o arquivo via `getResourceAsStream`, o que o torna independente do diretório de onde o programa é executado.

**Saída esperada:** `Soma total: 10`

## Ponto 2 — Comparação de arquivos (`Programa2.java`)

Lê os arquivos `test2_text1.txt` e `test2_text2.txt` e verifica se possuem o mesmo conteúdo.

- Carrega os dois arquivos como `String` (UTF-8) e compara com `.equals()`.
- Os arquivos são visualmente quase idênticos, mas diferem no último caractere (um caractere especial diferente ao final de cada um), então a comparação corretamente retorna `false`.

**Saída esperada:** `Os arquivos possuem os mesmos caracteres? false`

> Observação: o programa lê os arquivos por caminho relativo (`src/main/resources/...`), então precisa ser executado a partir da raiz do projeto.

## Pontos 3 a 6 — Diferença em dias entre 15/02 e 15/10 (`Programa3.java`)

Calcula quantos dias há entre 15 de fevereiro e 15 de outubro nos anos **2000**, **2001**, **1900** e **1582**, usando `java.time.LocalDate` e `ChronoUnit.DAYS`.

| Ano  | Dias | Motivo |
|------|------|--------|
| 2000 | 243  | Ano bissexto — divisível por 400 (regra especial dos anos de virada de século) |
| 2001 | 242  | Ano comum |
| 1900 | 242  | **Não** é bissexto — divisível por 100, mas não por 400 |
| 1582 | 232  | Ano da reforma do calendário Gregoriano — ver observação abaixo |

### Sobre o ano de 1582

`LocalDate` usa o calendário Gregoriano *proléptico*, ou seja, trata como se o calendário Gregoriano sempre tivesse existido — o que não é historicamente correto para 1582. Nesse ano, o Papa Gregório XIII implementou a reforma do calendário: a quinta-feira **4 de outubro** (calendário Juliano) foi seguida diretamente pela sexta-feira **15 de outubro** (calendário Gregoriano), eliminando **10 dias** que nunca existiram.

Por isso, o cálculo puro do `LocalDate` (242 dias) foi ajustado subtraindo esses 10 dias, resultando no valor histórico correto de **232 dias**.

## Como executar

Com Maven instalado, a partir da pasta `desafio-java`:

```bash
mvn compile
mvn exec:java -Dexec.mainClass="br.com.leticia.desafio.Programa1"
mvn exec:java -Dexec.mainClass="br.com.leticia.desafio.Programa2"
mvn exec:java -Dexec.mainClass="br.com.leticia.desafio.Programa3"
```

##Autora
Leticia Gabrielle Caaudino da Paz
