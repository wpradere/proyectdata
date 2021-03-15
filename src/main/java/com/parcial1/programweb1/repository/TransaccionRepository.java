package com.parcial1.programweb1.repository;


import com.parcial1.programweb1.model.entity.TransaccionEntidad;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TransaccionRepository extends CrudRepository<TransaccionEntidad,Long> {

    public List<TransaccionEntidad> findAll();
    public TransaccionEntidad findAllById (Long id);
}
