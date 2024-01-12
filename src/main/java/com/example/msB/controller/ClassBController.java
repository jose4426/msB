package com.example.msB.controller;


import com.example.msB.entity.ClassB;
import com.example.msB.service.ClassBService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class ClassBController {
    final ClassBService service;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClassB> findAll() {
        List<ClassB> response = service.findAll();
        return response;
    }
    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ClassB save(@RequestBody ClassB classb){
        return service.save(classb);
    }


}
