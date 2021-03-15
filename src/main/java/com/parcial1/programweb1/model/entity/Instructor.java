package com.parcial1.programweb1.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Instructor")
public class Instructor {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "nombre_apellido")
    private String nombreApellido;

    @Column(name = "Celular")
    private Long celular;


    @Column(name = "email")
    private String email;

    public Instructor(Long id, String nombreApellido, Long celular, String email) {
        this.id = id;
        this.nombreApellido = nombreApellido;
        this.celular = celular;
        this.email = email;
    }

    public Instructor(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Long getCelular() {
        return celular;
    }

    public void setCelular(Long celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "id=" + id +
                ", nombreApellido='" + nombreApellido + '\'' +
                ", celular=" + celular +
                ", email='" + email + '\'' +
                '}';
    }
}
