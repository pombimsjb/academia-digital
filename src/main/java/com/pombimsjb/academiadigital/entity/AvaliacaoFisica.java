package com.pombimsjb.academiadigital.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_avaliacoes")
public class AvaliacaoFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

    private LocalDateTime dataDaAvaliacao = LocalDateTime.now();

    @Column(name="peso_atual")
    private double peso;

    @Column(name="altura_atual")
    private double altura;
    public void setAluno(Aluno aluno2) {
    }

    public LocalDateTime getDataDaAvaliacao() {
        return dataDaAvaliacao;
    }

    public void setDataDaAvaliacao(LocalDateTime dataDaAvaliacao) {
        this.dataDaAvaliacao = dataDaAvaliacao;
    }

    public void setAluno(Object peso2) {
    }

    public void setAltura(Object altura2) {
    }

}
