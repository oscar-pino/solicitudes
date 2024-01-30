package com.myprojects.solicitudes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myprojects.solicitudes.entities.Category;

@Repository
public interface ICategory extends JpaRepository<Category, Long> {

}
