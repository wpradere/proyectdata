package com.parcial1.programweb1.service.implement;


import com.parcial1.programweb1.model.entity.RelationCuentaCbanco;
import com.parcial1.programweb1.repository.RelacionBancoCuentaRepository;

import com.parcial1.programweb1.service.RelacionBancoCuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RelacionBancoCuentaimple implements RelacionBancoCuentaService {

    @Autowired
    private RelacionBancoCuentaRepository relacionBancoCuenta;


    public List<RelationCuentaCbanco> findAll() {
        return relacionBancoCuenta.findAll();
    }

    @Override
    public void save(RelationCuentaCbanco relationCuentaCbanco) {
        relacionBancoCuenta.save(relationCuentaCbanco);
    }
}
