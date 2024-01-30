package com.myprojects.solicitudes.entities;

import java.util.Date;

import org.hibernate.annotations.Columns;

import com.myprojects.solicitudes.entities.enums.ECategory;
import com.myprojects.solicitudes.entities.enums.EDepartment;
import com.myprojects.solicitudes.entities.enums.EState;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="seguimientos")
public class Seguimiento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date created;
	
	private String title;
	
	private String detail;
}
