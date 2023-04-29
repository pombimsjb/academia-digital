package com.pombimsjb.academiadigital.controller;

import com.pombimsjb.academiadigital.entity.Matricula;
import com.pombimsjb.academiadigital.entity.form.MatriculaForm;
import com.pombimsjb.academiadigital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form){
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro){
        return service.getAll(bairro);
    }

}
