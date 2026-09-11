package br.com.leticia.desafio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Programa2 {

    public static void main(String[] args) throws IOException {

        String texto1 = Files.readString(
                Path.of("src/main/resources/test2_text1.txt"),
                StandardCharsets.UTF_8
        );

        String texto2 = Files.readString(
                Path.of("src/main/resources/test2_text2.txt"),
                StandardCharsets.UTF_8
        );

        boolean mesmosCaracteres = texto1.equals(texto2);

        System.out.println(
                "Os arquivos possuem os mesmos caracteres? "
                + mesmosCaracteres
        );
    }
}