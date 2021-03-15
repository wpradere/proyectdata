package com.parcial1.programweb1.controller;

import com.parcial1.programweb1.model.entity.CuentaEntidad;
import com.parcial1.programweb1.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @GetMapping("/cuenta/all")
    public List<CuentaEntidad> findall(){
        return cuentaService.findAll();
      }


     @PostMapping("/cuenta/")
    public CuentaEntidad saveCuenta (@RequestBody CuentaEntidad cuentaEntidad){
        cuentaService.save(cuentaEntidad);
        return cuentaEntidad;
     }

     @DeleteMapping("/delete/{id}")
    public String delete ( @PathVariable Long id){
        String resp;

        CuentaEntidad cuentaEntidad= cuentaService.findOne(id);
        if (cuentaEntidad !=null){
            cuentaService.delete(id);
             resp = "done";
        }else {
            resp = "no exist";
        }
        return resp;
     }

     @PutMapping("/update/")
     public CuentaEntidad update(@RequestBody CuentaEntidad cuentaEntidad){
        cuentaService.save(cuentaEntidad);
        return  cuentaEntidad;


     }

}
