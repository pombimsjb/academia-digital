package com.pombimsjb.academiadigital.service;

import com.pombimsjb.academiadigital.entity.Aluno;
import com.pombimsjb.academiadigital.entity.form.AlunoForm;
import com.pombimsjb.academiadigital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {
    Aluno create (AlunoForm form);
    Aluno get(Long id);
    List<Aluno> getAll();
    Aluno update(Long id, AlunoUpdateForm formUpdate);
    void delete(Long id);

}
