package com.parcial1.programweb1.controller;


import com.parcial1.programweb1.model.entity.CuentaEntidad;
import com.parcial1.programweb1.model.entity.TransaccionEntidad;
import com.parcial1.programweb1.service.TransaccionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class TransacitionController {

    @Autowired
    private TransaccionService transaccionService;



    @GetMapping("/transaccion/all")
    public List<TransaccionEntidad> findall(){
        return transaccionService.findall();
    }


    @PostMapping("/transaction/")
    public TransaccionEntidad saveCuenta (@RequestBody TransaccionEntidad transaccionEntidad){
        transaccionService.save(transaccionEntidad);
        return transaccionEntidad;
    }

    @DeleteMapping("/deletetrans/{id}")
    public String delete ( @PathVariable Long id){
        String resp;

        TransaccionEntidad transaccionEntidad= transaccionService.findOne(id);
        if (transaccionEntidad !=null){
            transaccionService.delete(id);
            resp = "done";
        }else {
            resp = "no exist";
        }
        return resp;
    }

    @PutMapping("/updatetrabns/")
    public TransaccionEntidad update(@RequestBody TransaccionEntidad transaccionEntidad){
        transaccionService.save(transaccionEntidad);
        return  transaccionEntidad;


    }


}
