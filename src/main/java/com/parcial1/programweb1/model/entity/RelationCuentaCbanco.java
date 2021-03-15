package com.parcial1.programweb1.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name ="relation_cuenta_banco")
public class RelationCuentaCbanco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name ="numero_de_cuenta" )
    String numeroCuenta;

    @Column(name ="Tipo_Cuenta" )
    String tipoCuenta;

    @Column(name ="id_Transaccion" )
    String idTransaccion;

    @Temporal(TemporalType.DATE)
    @Column(name ="Fecha_Transaccion" )
    Date fechaTrans;

    @Column(name ="Valor_Transaccion" )
    Long valorTrans;

    @Column(name ="Tipo_Documento" )
    String tipoDocumrnt;

    @Column(name ="Descripcion_Documento" )
    String description;

    @Column(name ="IdClienteCuenta")
    String idClienteCuenta;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(String idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Date getFechaTrans() {
        return fechaTrans;
    }

    public void setFechaTrans(Date fechaTrans) {
        this.fechaTrans = fechaTrans;
    }

    public Long getValorTrans() {
        return valorTrans;
    }

    public void setValorTrans(Long valorTrans) {
        this.valorTrans = valorTrans;
    }

    public String getTipoDocumrnt() {
        return tipoDocumrnt;
    }

    public void setTipoDocumrnt(String tipoDocumrnt) {
        this.tipoDocumrnt = tipoDocumrnt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdClienteCuenta() {
        return idClienteCuenta;
    }

    public void setIdClienteCuenta(String idClienteCuenta) {
        this.idClienteCuenta = idClienteCuenta;
    }
}
