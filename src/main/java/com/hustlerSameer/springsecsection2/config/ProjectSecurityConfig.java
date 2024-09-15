package com.hustlerSameer.springsecsection2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.FormLoginConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {
	
	
	
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception
	{
//		http.authorizeHttpRequests((request)-> request.anyRequest().denyAll());
//		http.authorizeHttpRequests((request)-> request.anyRequest().permitAll());
		http.authorizeHttpRequests((request)-> request
				.requestMatchers("/myAccount","/myBalance","myLoans","myCards").authenticated()
				// we have secured above 4 endpoints 
				.requestMatchers("/notices","/contact").permitAll()
				// we have this endpoints open for all users 
				
				);
		
		http.formLogin(t ->t.disable());
		// above lines have disabled form login and the method is lambda expression
		http.httpBasic();
		return http.build();
		
	}

	

}
