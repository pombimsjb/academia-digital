package com.pombimsjb.academiadigital.controller;

import com.pombimsjb.academiadigital.entity.Aluno;
import com.pombimsjb.academiadigital.entity.AvaliacaoFisica;
import com.pombimsjb.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.pombimsjb.academiadigital.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @GetMapping
    public List<AvaliacaoFisica> getAll() {
        return service.getAll();
    }

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {

        return service.create(form);
    }

}
