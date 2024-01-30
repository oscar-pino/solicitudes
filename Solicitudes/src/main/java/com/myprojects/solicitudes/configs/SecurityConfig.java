package com.myprojects.solicitudes.configs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	BCryptPasswordEncoder passwordEnconder() {
		
		return new BCryptPasswordEncoder();
	}


    @Bean
    public UserDetailsService userDetailsService() {
            UserDetails user = User.withDefaultPasswordEncoder()
                    .username("oscar")
                    .password("123")
                    .roles("USER")
                    .build();
            return new InMemoryUserDetailsManager(user);
    }

	
	//@Bean
  /*  SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        return httpSecurity
                .csrf(config -> config.disable())
                .authorizeHttpRequests(auth -> {
                    auth.requestMatchers("/api").permitAll();
                    auth.anyRequest().authenticated();
                })
                .sessionManagement(session -> {
                    session.sessionCreationPolicy(SessionCreationPolicy.STATELESS);
                }) */
//                .addFilter(jwtAuthenticationFilter)
//                .addFilterBefore(authorizationFilter, UsernamePasswordAuthenticationFilter.class)
       /*         .build();
    }*/
	
//	@Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//            http.authorizeHttpRequests().requestMatchers("/**").hasRole("USER").and().formLogin();
//            return http.build();
//    }


}
