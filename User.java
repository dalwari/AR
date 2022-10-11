package com.dalwaricorps.managapp.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@ToString



@NoArgsConstructor
@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    public Integer id;
    @Column(nullable=false, unique=true)
    private String email;
    @Column(nullable=false)
    private String password;
   @Enumerated(EnumType.STRING)
    private Role role;

    public User( String email, String password, Role role) {
    
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    // @Column(nullable=false)
    // private String username;
    // @Column(nullable=false)
    // private String mobileNumber;
    // @Column(nullable=false)
    // private String userRole;
}
