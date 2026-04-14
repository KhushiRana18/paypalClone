package com.paypal.user_service.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    // ID
    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    // NAME ✅
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // EMAIL ✅
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    // PASSWORD ✅
    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }
    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}