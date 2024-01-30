package com.myprojects.solicitudes.entities;

import java.util.Date;

import org.springframework.data.annotation.CreatedDate;

import com.myprojects.solicitudes.entities.enums.EDepartment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "employees")
public class Employee {

	@Id	
	private Long id;
	
	@OneToOne
	@JoinColumn(name="login_id",referencedColumnName="id")
	private UserLogin login;
	
	@OneToOne
	@JoinColumn(name="depto_id",referencedColumnName="id")
	private Department depto;
	
	@NotBlank
	@Size(min = 3)
	private String name;
	
	@NotBlank
	@Size(min = 6)
	private String lastName;
	
	@Size(min = 10)
	@Null
	private String phone;
	
	@Email
	@Null
	private String email;
	
	@NotBlank
	private String gender;
	
	@NotNull
	private Date birthDate;	
	
}
