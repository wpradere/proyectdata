package com.parcial1.programweb1.controller;

import com.parcial1.programweb1.model.entity.CuentaEntidad;
import com.parcial1.programweb1.model.entity.DocumentoEntidad;
import com.parcial1.programweb1.service.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class DocumentController {

    @Autowired
    private DocumentoService documentoService;


    @GetMapping("/documento/all")
    public List<DocumentoEntidad> findall(){
        return documentoService.findall();
    }

    @PostMapping("/document/")
    public DocumentoEntidad saveCuenta (@RequestBody DocumentoEntidad documentoEntidad){
        documentoService.save(documentoEntidad);
        return documentoEntidad;
    }


    @DeleteMapping("/deletedoc/{id}")
    public String delete ( @PathVariable Long id){
        String resp;

        DocumentoEntidad documentoEntidad= documentoService.findOne(id);
        if (documentoEntidad !=null){
            documentoService.delete(id);
            resp = "done";
        }else {
            resp = "no exist";
        }
        return resp;
    }

    @PutMapping("/updateDoc/")
    public DocumentoEntidad update(@RequestBody DocumentoEntidad documentoEntidad){
        documentoService.save(documentoEntidad);
        return  documentoEntidad;
    }

    @GetMapping("/documenoby")
    public List<DocumentoEntidad> findallpordescr(){
        return documentoService.findnotdescription("abono");
    }



}
