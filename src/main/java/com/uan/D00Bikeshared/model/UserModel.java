package com.uan.D00Bikeshared.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String username;
    private String password;
    private String email;
    private boolean estado;
    private int saldo;
}
