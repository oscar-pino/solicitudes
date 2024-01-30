package com.myprojects.solicitudes.entities;

import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.CreatedDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
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
@Table(name="user_login")
public class UserLogin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "campo solicitado")
	@Size(min = 3, message = "debe ingresar mas de 2 caracteres")
	private String username;
	
	@NotBlank(message = "campo solicitado")
	@Size(min = 3, message = "debe ingresar mas de 2 caracteres")
	private String password;
	
	@OneToOne
	@JoinColumn(name = "role_id", referencedColumnName = "id")
	private Role role;
	
	@Value(value = "true")
	private boolean active;
	
	@CreatedDate
	private Date created;
	
}
