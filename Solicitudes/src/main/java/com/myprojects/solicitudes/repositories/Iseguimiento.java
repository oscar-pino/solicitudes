package com.myprojects.solicitudes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myprojects.solicitudes.entities.Seguimiento;

@Repository
public interface Iseguimiento extends JpaRepository<Seguimiento, Long> {

}
