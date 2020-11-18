package com.example.bonusexercise1;

import com.example.bonusexercise1.pojo.Person;

public interface NameExtractor<T extends Person> {
    String getName(T type);


}
