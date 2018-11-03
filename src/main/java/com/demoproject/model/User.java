package com.demoproject.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class User implements Serializable {
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    @NotNull
    private String email;

    // @Column(length = 8)
    @NotNull
    private String password;

    @NotNull
    private int amount;

    public User() {
    }

    public User(String email, String password, int amount) {
        this.email = email;
        this.password = password;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", amount=" + amount +
                '}';
    }
}



















