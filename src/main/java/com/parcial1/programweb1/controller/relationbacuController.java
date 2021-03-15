package com.parcial1.programweb1.controller;


import com.parcial1.programweb1.model.entity.RelationCuentaCbanco;
import com.parcial1.programweb1.service.RelacionBancoCuentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;



@RestController
@RequestMapping("/api/")
public class relationbacuController {


    @Autowired
    private RelacionBancoCuentaService relacion;

    @GetMapping("all")
    public List<RelationCuentaCbanco> getrelationcuentabanco(){
        return relacion.findAll();
    }

}
