package com.pombimsjb.academiadigital.service.impl;

import com.pombimsjb.academiadigital.entity.Aluno;
import com.pombimsjb.academiadigital.entity.AvaliacaoFisica;
import com.pombimsjb.academiadigital.entity.form.AlunoForm;
import com.pombimsjb.academiadigital.entity.form.AlunoUpdateForm;
import com.pombimsjb.academiadigital.infra.utils.JavaTimeUtils;
import com.pombimsjb.academiadigital.repository.AlunoRepository;
import com.pombimsjb.academiadigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {


    @Autowired
    private AlunoRepository repository;

   @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome((String) form.getNome());
        aluno.setCpf((String) form.getCpf());
        aluno.setBairro((String) form.getBairro());
        aluno.setDataDeNascimento((LocalDate) form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataDeNascimento) {

        if (dataDeNascimento == null) {
            return repository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dataDeNascimento, JavaTimeUtils.LOCAL_DATE_FORMATTER);
            return repository.findByDataDeNascimento(localDate);
        }

    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

        Aluno aluno = repository.findById(id).get();

        return aluno.getAvaliacoes();

    }

}
