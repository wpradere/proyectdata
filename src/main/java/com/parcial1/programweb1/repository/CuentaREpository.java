package com.parcial1.programweb1.repository;

import com.parcial1.programweb1.model.entity.CuentaEntidad;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CuentaREpository extends CrudRepository<CuentaEntidad,Long> {

    public List<CuentaEntidad> findAll();
    public CuentaEntidad findAllById (Long id);

}
