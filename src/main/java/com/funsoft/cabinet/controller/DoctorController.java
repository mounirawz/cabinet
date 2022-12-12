package com.funsoft.cabinet.controller;

import com.funsoft.cabinet.entities.Doctor;
import com.funsoft.cabinet.entities.Speciality;
import com.funsoft.cabinet.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/doctors")

public class DoctorController {

    @Autowired
    DoctorService doctorService ;

    @GetMapping(value = "/welcome")
    public String welcome(){
        return "welcome, I am a robot, I will help you to manage doctors .";
    }

}
