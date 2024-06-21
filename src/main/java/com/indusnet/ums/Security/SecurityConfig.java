package com.indusnet.ums.Security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {


    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .requestMatchers("/api/public/**").permitAll() // Allow access to public endpoints
                .anyRequest().authenticated() // All other endpoints require authentication
                ; // Enable form based login (default login form provided by Spring Security)
    }
}
