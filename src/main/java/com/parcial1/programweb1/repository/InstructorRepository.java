package com.parcial1.programweb1.repository;

import com.parcial1.programweb1.model.entity.Instructor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface InstructorRepository extends CrudRepository<Instructor,Long> {

    public List<Instructor> findAll();
    public Instructor findAllById(Long id);

}
