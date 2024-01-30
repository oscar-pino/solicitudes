package com.myprojects.solicitudes.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "solicitudes")
@Entity
public class Solicitud {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name = "employee_id", referencedColumnName = "id")
	private Employee employee;
	
	@OneToOne
	@JoinColumn(name = "state_id", referencedColumnName = "id")
	private State state;

	@OneToOne
	@JoinColumn(name = "category_id", referencedColumnName = "id")
	private Category category;

	@OneToMany
	@JoinColumn(name = "seguimiento_id", referencedColumnName = "id")
	private Set<Seguimiento> seguimientos;

	private String title;
	private String detail;
	private Date created;
	private String encargado;
	private String responsible;

}
