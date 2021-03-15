package com.parcial1.programweb1.repository;


import com.parcial1.programweb1.model.entity.DocumentoEntidad;
import com.parcial1.programweb1.model.entity.TransaccionEntidad;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DocumentoRepository extends CrudRepository<DocumentoEntidad,Long> {

    public List<DocumentoEntidad> findAll();

    public DocumentoEntidad findAllById (Long id);

    @Query("select p from DocumentoEntidad p where p.descripcion not like  ?1%")
    public List<DocumentoEntidad> findnotdescription(String description);
}
