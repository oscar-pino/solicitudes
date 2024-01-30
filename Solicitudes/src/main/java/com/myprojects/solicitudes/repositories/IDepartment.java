package com.myprojects.solicitudes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myprojects.solicitudes.entities.Department;

@Repository
public interface IDepartment extends JpaRepository<Department, Long> {

}
