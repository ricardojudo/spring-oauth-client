package com.example;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.AnonymousConfigurer;

@EnableWebSecurity()
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests(authorize->authorize.antMatchers("/ui/secured/**")
				.authenticated()).oauth2Login();
		
	}

	protected void anonymous(AnonymousConfigurer<HttpSecurity> configurer) {
		configurer.disable();
	}

}
