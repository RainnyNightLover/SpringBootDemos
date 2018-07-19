package com.xihuanyuye.service;

import com.xihuanyuye.entity.Person;


public interface PersonService {
    Person save(Person person);

    void remove(Long id);

    Person findOne(Person person);
}
