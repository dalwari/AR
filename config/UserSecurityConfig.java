package com.dalwaricorps.managapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.dalwaricorps.managapp.service.CustomUserDetailsService;

import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@Order(2)
public class UserSecurityConfig {
  
   
    @Bean
    public SecurityFilterChain filterChain2(HttpSecurity http) throws Exception {
        // http.authorizeHttpRequests().antMatchers("/").permitAll();
        http.antMatcher("/user/**")
                .authorizeRequests().anyRequest().hasAuthority("USER").and().formLogin()
                .loginPage("/user/login").usernameParameter("email").loginProcessingUrl("/user/login")
                .defaultSuccessUrl("/user/home").permitAll().and().logout().logoutUrl("/user/logout")
                .logoutSuccessUrl("/");
        return http.build();
    }

}
