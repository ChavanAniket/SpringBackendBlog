package com.chavan.blog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;

import com.chavan.blog.security.CustomUserDetailService;

@Configuration
@Controller
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
	private CustomUserDetailService customUserDetailService;

	@Bean
	    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		 	
		 	http.csrf(csrf -> csrf.disable())
		 	.cors(cors -> cors.disable())
		 	.authorizeHttpRequests(auth -> auth.anyRequest().authenticated())
		 	.httpBasic(httpBasic ->
	        httpBasic.realmName("your-realm")
	    );
		 	
		 	
		 	return http.build();
		 	
	    }
	
	// Define the AuthenticationManager bean
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
    
    // Define a PasswordEncoder bean
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
