package com.parcial1.programweb1.service;


import com.parcial1.programweb1.model.entity.TransaccionEntidad;

import java.util.List;

public interface TransaccionService {

    public List<TransaccionEntidad> findall();
    public void save (TransaccionEntidad cuenta);
    public void delete(Long id);
    public TransaccionEntidad findOne(Long id);

}
