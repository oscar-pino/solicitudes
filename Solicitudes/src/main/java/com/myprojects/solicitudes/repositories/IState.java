package com.myprojects.solicitudes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myprojects.solicitudes.entities.State;

@Repository
public interface IState extends JpaRepository<State, Long> {

}
