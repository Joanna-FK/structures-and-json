package com.jgdy4.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jgdy4.structures.zad1.Person;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Person pawelek = new Person( "Paweł", "Recław", 20);

        //klasa dokonująca mapowania/serializacji json -> obiekt obiekt -> json
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            //konwersja obiektu do formatu json (String)
            String result = objectMapper.writeValueAsString(pawelek);
            //wypisanie na ekran
            System.out.println(result);

            //zapis do pliku
            objectMapper.writeValue(new File("person.json"), pawelek);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
