package com.myprojects.solicitudes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myprojects.solicitudes.entities.Role;

@Repository
public interface IRole extends JpaRepository<Role, Long> {

}
