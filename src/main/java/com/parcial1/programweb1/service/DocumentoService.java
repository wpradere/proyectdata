package com.parcial1.programweb1.service;


import com.parcial1.programweb1.model.entity.DocumentoEntidad;

import java.util.List;

public interface DocumentoService {
    public List<DocumentoEntidad> findall();

    public void save (DocumentoEntidad cuenta);
    public void delete(Long id);
    public DocumentoEntidad findOne(Long id);
    public List<DocumentoEntidad>findnotdescription (String description);
}
