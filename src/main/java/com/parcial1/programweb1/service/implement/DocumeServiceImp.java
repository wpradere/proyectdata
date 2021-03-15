package com.parcial1.programweb1.service.implement;

import com.parcial1.programweb1.model.entity.CuentaEntidad;
import com.parcial1.programweb1.model.entity.DocumentoEntidad;
import com.parcial1.programweb1.repository.DocumentoRepository;
import com.parcial1.programweb1.service.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class DocumeServiceImp  implements DocumentoService {
    @Autowired
    private DocumentoRepository documentoRepository ;

    @Override
    public List<DocumentoEntidad> findall() {
        return documentoRepository.findAll();
    }

    @Override
    public void save(DocumentoEntidad documento) {documentoRepository.save(documento);

    }

    @Override
    public void delete(Long id) {
        DocumentoEntidad documentoEntidad = new DocumentoEntidad();
        documentoEntidad = documentoRepository.findAllById(id);
        documentoRepository.delete(documentoEntidad);


    }

    @Override
    public DocumentoEntidad findOne(Long id) {
        DocumentoEntidad documentoEntidad = documentoRepository.findAllById(id);
        return documentoEntidad;
    }

    @Override
    public List<DocumentoEntidad> findnotdescription(String description) {
        return documentoRepository.findnotdescription(description);
    }
}



