package com.parcial1.programweb1.service;

import com.parcial1.programweb1.model.entity.Instructor;

import java.util.List;

public interface InstructorService {

    public List<Instructor> findAll();
    public void safe (Instructor instructor);
    public void  delete (Instructor intructor);
    public Instructor findOne(Long id);

}
