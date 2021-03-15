package com.parcial1.programweb1.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "transaccion")
public class TransaccionEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_transaccion")
    Long idTransaccion;

    @Temporal(TemporalType.DATE)
    @Column (name ="fercha_transaccion" )
    Date fecha;

    @Column(name = "valor_transaccion")
    Long valorTransaccion;

    public TransaccionEntidad(Long id, Long idTransaccion, Date fecha, Long valorTransaccion) {
        this.id = id;
        this.idTransaccion = idTransaccion;
        this.fecha = fecha;
        this.valorTransaccion = valorTransaccion;
    }

    public TransaccionEntidad() {

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Long idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getValorTransaccion() {
        return valorTransaccion;
    }

    public void setValorTransaccion(Long valorTransaccion) {
        this.valorTransaccion = valorTransaccion;
    }

    @Override
    public String toString() {
        return "TransaccionEntidad{" +
                "id=" + id +
                ", idTransaccion=" + idTransaccion +
                ", fecha=" + fecha +
                ", valorTransaccion=" + valorTransaccion +
                '}';
    }
}
