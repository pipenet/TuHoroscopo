package com.example.fmoya.tuhoroscopo;

/**
 * Created by fmoya on 23-10-2017.
 */

public class User {
    private String nombre;
    private String password;

    public User(String nombre, String password) {
        this.nombre = nombre;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
