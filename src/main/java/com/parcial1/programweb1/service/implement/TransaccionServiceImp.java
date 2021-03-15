package com.parcial1.programweb1.service.implement;

import com.parcial1.programweb1.model.entity.TransaccionEntidad;
import com.parcial1.programweb1.repository.TransaccionRepository;
import com.parcial1.programweb1.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TransaccionServiceImp implements TransaccionService {
    @Autowired
    private TransaccionRepository transaccionRepository;

    @Override
    public List<TransaccionEntidad> findall() {
        return transaccionRepository.findAll();
    }

    @Override
    public void save(TransaccionEntidad cuenta) {
        transaccionRepository.save(cuenta);

    }

    @Override
    public void delete(Long id) {
        TransaccionEntidad transaccionEntidad = new TransaccionEntidad();
        transaccionEntidad = transaccionRepository.findAllById(id);
        transaccionRepository.delete(transaccionEntidad);

    }

    @Override
    public TransaccionEntidad findOne(Long id) {
        TransaccionEntidad transaccionEntidad = transaccionRepository.findAllById(id);
        return transaccionEntidad;
    }
}
