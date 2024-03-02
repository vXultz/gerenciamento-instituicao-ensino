package br.com.fullstack.education.gerenciamentoinstituicaoensino.service;

import br.com.fullstack.education.gerenciamentoinstituicaoensino.model.CursoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    public List<CursoModel> buscarTodos() {
        return CursoModel.getCursos();
    }

    public CursoModel salvar(CursoModel curso) throws Exception {
        if (validar(curso)) {
            return CursoModel.inserir(curso);
        }
        return null;
    }

    private boolean validar(CursoModel curso) throws Exception {
        if (curso.getNome() == null || curso.getNome().isBlank()) {
            throw new Exception("Nome é obrigatório!");
        }

        if (curso.getCargaHoraria() == null) {
            throw new Exception("Carga horária é obrigatória!");
        }
        return true;
    }
}
