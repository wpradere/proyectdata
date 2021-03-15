package com.parcial1.programweb1.service.implement;

import com.parcial1.programweb1.model.entity.Instructor;
import com.parcial1.programweb1.repository.InstructorRepository;
import com.parcial1.programweb1.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InstructorServiceiImpl implements InstructorService {
    @Autowired
    private InstructorRepository instructorRepository;

    @Override
    public List<Instructor> findAll() {
        return   instructorRepository.findAll();
    }

    @Override
    public void safe(Instructor instructor) {
        instructorRepository.save(instructor);
    }

    @Override
    public void delete(Instructor intructor) {
        instructorRepository.delete(intructor);

    }

    @Override
    public Instructor findOne(Long id) {
        return instructorRepository.findAllById(id);
    }
}
