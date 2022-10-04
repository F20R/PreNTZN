package com.app.prentzn.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hola")
public class hola {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String nombre;


    public hola(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public hola() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        hola hola = (hola) o;
        return id == hola.id && Objects.equals(nombre, hola.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "hola{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }




}

