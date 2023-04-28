package com.pombimsjb.academiadigital.entity;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Aluno {
    private Long id;
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate dataDeNascimento;
    private List<AvaliacaoFisica> avaliacoes = new ArrayList<>();
}
