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
@Order(1)
public class AdminSecurityConfig {
    @Bean
    public UserDetailsService userDetailsService() {
        return new CustomUserDetailsService();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        // return new BCryptPasswordEncoder();
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public SecurityFilterChain filterChain1(HttpSecurity http) throws Exception {
        // http.authorizeHttpRequests().antMatchers("/").permitAll();
        http.antMatcher("/admin/**")
                .authorizeRequests().anyRequest().hasAuthority("ADMIN").and().formLogin()
                .loginPage("/admin/login").usernameParameter("email").loginProcessingUrl("/admin/login")
                .defaultSuccessUrl("/admin/home").permitAll().and().logout().logoutUrl("/admin/logout")
                .logoutSuccessUrl("/");
        return http.build();
    }

}
