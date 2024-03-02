package br.com.fullstack.education.gerenciamentoinstituicaoensino.service;

import br.com.fullstack.education.gerenciamentoinstituicaoensino.model.AlunoModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    public List<AlunoModel> buscarTodos() {
        return AlunoModel.getAlunos();
    }

    public AlunoModel salvar(AlunoModel aluno) throws Exception {
        if (validar(aluno)) {
            return AlunoModel.inserir(aluno);
        }
        return null;
    }

    private boolean validar(AlunoModel aluno) throws Exception {
        if (aluno.getNome() == null || aluno.getNome().isBlank()) {
            throw new Exception("Nome é obrigatório!");
        }

        if (aluno.getDataNascimento() == null) {
            throw new Exception("Data de nascimento é obrigatório!");
        }
        return true;
    }
}
