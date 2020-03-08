package com.jgdy4.json.zad2;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            List <IngredientsResponse> response = objectMapper.readValue(new File("ingredients.json"), new TypeReference<List<IngredientsResponse>>() {

                }
            );
            response.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

