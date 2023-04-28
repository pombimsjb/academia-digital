package com.pombimsjb.academiadigital.service;

import com.pombimsjb.academiadigital.entity.Matricula;
import com.pombimsjb.academiadigital.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {
    Matricula create(MatriculaForm form);
    Matricula get(Long id);
    List<Matricula> getAll();
    void delete(Long id);
}
