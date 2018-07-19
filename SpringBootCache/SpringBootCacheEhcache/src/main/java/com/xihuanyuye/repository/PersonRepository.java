package com.xihuanyuye.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xihuanyuye.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}