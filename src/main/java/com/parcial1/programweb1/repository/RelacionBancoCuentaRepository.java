package com.parcial1.programweb1.repository;


import com.parcial1.programweb1.model.entity.RelationCuentaCbanco;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RelacionBancoCuentaRepository extends CrudRepository <RelationCuentaCbanco,Long> {
 //   public List<RelationCuentaCbanco> findAll();


    @Override
    <S extends RelationCuentaCbanco> S save(S s);

    @Override
    Optional<RelationCuentaCbanco> findById(Long aLong);

    @Override
    List<RelationCuentaCbanco> findAll();

    @Override
    void deleteById(Long aLong);
}
