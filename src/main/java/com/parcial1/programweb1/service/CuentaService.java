package com.parcial1.programweb1.service;

import com.parcial1.programweb1.model.entity.CuentaEntidad;

import java.util.List;

public interface CuentaService {

    public List<CuentaEntidad> findAll();
    public void save (CuentaEntidad cuenta);
    public void delete(Long id);
    public CuentaEntidad findOne(Long id);

}
