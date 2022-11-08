package com.kodasfiledata;

import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) {
//    }
    
//    @Override
//    public void configure(WebSecurity web) {
//	}

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	http.headers().frameOptions();
    	http.authorizeHttpRequests().mvcMatchers("/").permitAll();
    	http.csrf().disable();
	}
}