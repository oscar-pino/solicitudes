package com.myprojects.solicitudes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myprojects.solicitudes.entities.UserLogin;

@Repository
public interface IUserLogin extends JpaRepository<UserLogin, Long> {

}
