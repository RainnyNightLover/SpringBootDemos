package com.xihuanyuye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xihuanyuye.entity.Person;
import com.xihuanyuye.service.PersonService;

@RestController
public class CacheController {

    @Autowired
    PersonService personService;

    @RequestMapping("/put")
    public long put(@RequestBody Person person) {
        Person p = personService.save(person);
        return p.getId();
    }

    @RequestMapping("/able")
    public Person cacheable(Person person) {

        return personService.findOne(person);
    }

    @RequestMapping("/evit")
    public String evit(Long id) {

        personService.remove(id);
        return "ok";
    }

}