package br.com.fullstack.education.gerenciamentoinstituicaoensino.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class CursoModel {

    private static Integer proximoId = 1;

    @Setter(AccessLevel.NONE)
    private Integer id;
    private String nome;
    private String descricao;
    private Integer cargaHoraria;

    private Integer getProximoId() {
        return proximoId++;
    }

}
