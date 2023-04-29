package com.pombimsjb.academiadigital.service.impl;

import com.pombimsjb.academiadigital.entity.Aluno;
import com.pombimsjb.academiadigital.entity.AvaliacaoFisica;
import com.pombimsjb.academiadigital.entity.form.AvaliacaoFisicaForm;
import com.pombimsjb.academiadigital.entity.form.AvaliacaoFisicaUpdateForm;
import com.pombimsjb.academiadigital.repository.AlunoRepository;
import com.pombimsjb.academiadigital.repository.AvaliacaoFisicaRepository;
import com.pombimsjb.academiadigital.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoFisicaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        //avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoFisicaRepository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
