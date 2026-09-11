package br.com.leticia.desafio;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Programa1 {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode dados = mapper.readTree(
                Programa1.class.getClassLoader().getResourceAsStream("test1.json")
        );

        int soma = 0;

        for (JsonNode elemento : dados) {

            if (elemento.isNumber()) {
                soma += elemento.asInt();

            } else if (elemento.isTextual()) {
                soma += Integer.parseInt(elemento.asText());
            }
        }

        System.out.println("Soma total: " + soma);
    }
}