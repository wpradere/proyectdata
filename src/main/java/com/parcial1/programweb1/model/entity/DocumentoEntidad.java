package com.parcial1.programweb1.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "Documento")
public class DocumentoEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo_documento")
    String tipoDocumento;

    @Column(name = "descripcion")
    String descripcion;

    public DocumentoEntidad(Long id, String tipoDocumento, String descripcion) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.descripcion = descripcion;
    }
    public DocumentoEntidad (){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "DocumentoEntidad{" +
                "id=" + id +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
