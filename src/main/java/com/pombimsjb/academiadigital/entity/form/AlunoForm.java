package com.pombimsjb.academiadigital.entity.form;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;

    @NotEmpty(message = "Preencha o campo corretamente.")
    //@CPF(message = "'${validatedValue}' é inválido!")
    private String cpf;

    @NotEmpty(message = "Preencha o campo corretamente.")
    @Size(min = 3, max =50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String bairro;

    @Past(message = "Data '${validatedValue}' é inválida.")
    private LocalDate dataDeNascimento;

    public Object getNome() {
        return null;
    }

    public Object getCpf() {
        return null;
    }

    public Object getBairro() {
        return null;
    }

    public Object getDataDeNascimento() {
        return null;
    }
}