package com.myprojects.solicitudes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myprojects.solicitudes.entities.Solicitud;

@Repository
public interface ISolicitud extends JpaRepository<Solicitud, Long> {

}
