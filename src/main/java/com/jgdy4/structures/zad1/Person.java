package com.jgdy4.structures.zad1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Comparable<Person>{
    private String name;
    private String surname;
    private int age;

    public  int  compareTo(Person person){
//        int result = Integer.compare(age, person.getAge());
//        if(result!=0){
//            return result;
//        }return name.compareTo(person.getName());
        return Integer.compare(age, person.getAge());
    }

}
