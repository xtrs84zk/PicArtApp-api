package com.four.picartapp.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Integrante")
public class Integrante {
    @Column
    @Id
    @GeneratedValue
    private int idIntegrante;
    @Column
    private String name;

    @Length(min = 5, message = "*Your password must have at least 5 characters")
    private String password;

    @Column(unique = true, length = 40)
    private String username;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Role> roles;

    private boolean enabled;
    private boolean tokenExpired;

    public Integrante() {
    }

    public Integrante(int idIntegrante, String name, String password, String username, Set<Role> roles) {
        this.idIntegrante = idIntegrante;
        this.name = name;
        this.password = password;
        this.username = username;
        this.roles = roles;
    }

    public int getIdIntegrante() {
        return idIntegrante;
    }

    public void setIdIntegrante(int idIntegrante) {
        this.idIntegrante = idIntegrante;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isTokenExpired() {
        return tokenExpired;
    }

    public void setTokenExpired(boolean tokenExpired) {
        this.tokenExpired = tokenExpired;
    }
}
