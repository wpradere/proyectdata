package com.parcial1.programweb1.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "cuenta")
public class CuentaEntidad  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Id_ClienteCuenta")
    String idClienteCuenta;

    @Column(name = "numero_cuenta")
    Long numeroCuenta;

    @Column(name = "tipo_cuenta")
    String tipoCuenta;

    public CuentaEntidad(Long id, String idClienteCuenta, Long numeroCuenta, String tipoCuenta) {
        this.id = id;
        this.idClienteCuenta = idClienteCuenta;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaEntidad() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return idClienteCuenta;
    }

    public void setName(String name) {
        this.idClienteCuenta = name;
    }

    public Long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    @Override
    public String toString() {
        return "CuentaEntiad{" +
                "id=" + id +
                ", name='" + idClienteCuenta + '\'' +
                ", numeroCuenta=" + numeroCuenta +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                '}';
    }
}