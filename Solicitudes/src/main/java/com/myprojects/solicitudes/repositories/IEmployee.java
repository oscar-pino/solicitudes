package com.myprojects.solicitudes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myprojects.solicitudes.entities.Employee;

@Repository
public interface IEmployee extends JpaRepository<Employee, Long> {

}
