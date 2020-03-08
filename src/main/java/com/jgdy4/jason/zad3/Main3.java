package com.jgdy4.jason.zad3;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
           MenuResponse menuResponse =  objectMapper.readValue(new File("menuItems.json"), MenuResponse.class);
            menuResponse.getMenuItems().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
