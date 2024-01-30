package com.myprojects.solicitudes;

import java.sql.Date;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.myprojects.solicitudes.entities.Role;
import com.myprojects.solicitudes.entities.UserLogin;
import com.myprojects.solicitudes.entities.enums.ERole;
import com.myprojects.solicitudes.repositories.IRole;
import com.myprojects.solicitudes.repositories.IUserLogin;

@SpringBootTest
class SolicitudesApplicationTests {
	
	@Autowired
	private IUserLogin iul;
	
	@Autowired
	private IRole ro;
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	

	@Test
	void contextLoads() {
		
		Set<Role> set1 = new HashSet<Role>();
		UserLogin ul = new UserLogin();
		ul.setUsername("spartako");
		ul.setPassword("123");	
		Role r = new Role();
		r.setRole(ERole.ADMINISTRADOR);
		ro.save(r);
		set1.add(r);
		ul.setRole(r);
		ul.setActive(true);
		ul.setCreated(Date.valueOf(LocalDate.now()));
		
		iul.save(ul);
	}

}
