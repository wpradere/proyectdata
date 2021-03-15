package com.parcial1.programweb1.controller;


import com.parcial1.programweb1.model.entity.Instructor;
import com.parcial1.programweb1.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sinova/")
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    @GetMapping("/mostrartodo/")
    public List<Instructor> finall(){
        return instructorService.findAll();
    }

    @PostMapping("/guardarnuevo/")
    public Instructor saveInstructor (@RequestBody Instructor instructor){
        instructorService.safe(instructor);
        return instructor;
    }

    @DeleteMapping("/deleteins/{id}")
    public  String delete (@PathVariable Long id){
       Instructor instructor = new Instructor();
       instructor= instructorService.findOne(id);

        String resp;

        if (instructor !=null){
            instructorService.delete(instructor);
            resp= "done";
        }else{
            resp  = "no existe ";

        }
       return resp;
    }

    @PutMapping ("/updtaeins/")
    public Instructor update(@RequestBody Instructor instructor){
        instructorService.safe(instructor);
        return instructor;
    }





}
