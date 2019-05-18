package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.Aluno;

public class RepositoryAluno implements IRepositoryAluno {

	private List<Aluno> alunosDoBanco;

	public RepositoryAluno() {
		alunosDoBanco = new ArrayList<>();

	}

	@Override
	public Aluno logar(String login, String senha) {
		// TODO Auto-generated method stub
		for (Aluno aluno : alunosDoBanco) {
			if (aluno.getLoginAluno().equals(login) && aluno.getSenhaAluno().equals(senha)) {
				return aluno;
			}

		}
		return null;
	}

	@Override
	public void inserirAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		alunosDoBanco.add(aluno);
	}

	@Override
	public Aluno exibirAluno(int idAluno) {
		// TODO Auto-generated method stub
		for (Aluno aluno : alunosDoBanco) {
			if (aluno.getMatricula() == idAluno) {
				return aluno;
			}
		}
		return null;
	}

	@Override
	public void removerAluno(int matricula) {
		// TODO Auto-generated method stub
		for (Aluno aluno : alunosDoBanco) {
			if (aluno.getMatricula() == matricula) {
				alunosDoBanco.remove(aluno);
				break;
			}
		}

	}

	@Override
	public Aluno buscarAluno(int matricula) {
		// TODO Auto-generated method stub
		for (Aluno aluno : alunosDoBanco) {
			if (aluno.getMatricula() == matricula) {
				return aluno;
			}
		}
		return null;
	}

	@Override
	public List<Aluno> listarAluno() {
		// TODO Auto-generated method stub
		return alunosDoBanco;
	}

	@Override
	public List<Aluno> calcularFinal() {
		// TODO Auto-generated method stub
		return null;
	}

}
