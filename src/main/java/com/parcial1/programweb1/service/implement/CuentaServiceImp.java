package com.parcial1.programweb1.service.implement;

import com.parcial1.programweb1.model.entity.CuentaEntidad;
import com.parcial1.programweb1.repository.CuentaREpository;
import com.parcial1.programweb1.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CuentaServiceImp implements CuentaService {
    @Autowired
    private  CuentaREpository cuentaREpository;

    @Override
    public List<CuentaEntidad> findAll() {
        return cuentaREpository.findAll();
    }

    @Override
    public void save(CuentaEntidad cuenta) {
        cuentaREpository.save(cuenta);
    }

    @Override
    public CuentaEntidad findOne(Long id) {
        CuentaEntidad cuentaEntidad =  cuentaREpository.findAllById(id);
        return cuentaEntidad;
    }

    @Override
    public void delete(Long id) {
        CuentaEntidad cuentaEntidad = new CuentaEntidad();
        cuentaEntidad = cuentaREpository.findAllById(id);
        cuentaREpository.delete(cuentaEntidad);
    }
}
