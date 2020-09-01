package com.example.sopservice.service;

import com.example.sopservice.entity.Person;

import java.util.List;

public interface PersonService {

    void save(Person person);

    int delete(List<Integer> ids);

    int update(Person person);

    Person getById(Long id);

    List<Person> getByCondition(Person person);


}
