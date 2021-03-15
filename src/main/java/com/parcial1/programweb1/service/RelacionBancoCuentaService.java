package com.parcial1.programweb1.service;



import com.parcial1.programweb1.model.entity.RelationCuentaCbanco;

import java.util.List;


public interface RelacionBancoCuentaService {

    public List<RelationCuentaCbanco> findAll();
    public void save(RelationCuentaCbanco relationCuentaCbanco);

}
