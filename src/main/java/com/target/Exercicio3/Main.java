package com.target.Exercicio3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.target.Exercicio3.model.FaturamentoDiario;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        String json = String.join(" ",
                Files.readAllLines(
                        Paths.get("src/main/resources/lista.json"),
                        StandardCharsets.UTF_8));

        Gson gson = (new GsonBuilder().create());
        List<FaturamentoDiario> mes = Arrays.asList(gson.fromJson(json, FaturamentoDiario[].class));


      /*  Segunda possibilidade de transformar JSON para POJO
       ObjectMapper mapper = new ObjectMapper();
       List<FaturamentoDiario> mes = Arrays.asList(mapper.readValue(json, FaturamentoDiario[].class));*/

        FaturamentoDiario faturamentoMensal = new FaturamentoDiario();

        faturamentoMensal.relatorio(mes);






    }
}
