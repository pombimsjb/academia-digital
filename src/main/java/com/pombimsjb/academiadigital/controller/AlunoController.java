package com.pombimsjb.academiadigital.controller;

import com.pombimsjb.academiadigital.entity.Aluno;
import com.pombimsjb.academiadigital.entity.AvaliacaoFisica;
import com.pombimsjb.academiadigital.entity.form.AlunoForm;
import com.pombimsjb.academiadigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form) {
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisica(@PathVariable Long id){
        return service.getAllAvaliacaoFisicaId(id);
    }

    @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false) String dataDenascimento){
        return service.getAll(dataDenascimento);
    }

}
