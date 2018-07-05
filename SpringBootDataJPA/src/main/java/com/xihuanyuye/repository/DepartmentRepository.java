package com.xihuanyuye.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xihuanyuye.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{}
