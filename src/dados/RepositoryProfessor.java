package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.Professor;

public class RepositoryProfessor implements IRepositoryProfessor {

	private List<Professor> professoresDoBanco;

	public RepositoryProfessor() {
		professoresDoBanco = new ArrayList<>();
	}

	@Override
	public Professor logar(String login, String senha) {
		// TODO Auto-generated method stub
		for (Professor professor : professoresDoBanco) {
			if (professor.getLoginProfessor().equals(login) && professor.getSenhaProfessor().equals(senha)) {
				return professor;
			}
		}
		return null;
	}

	@Override
	public void inserirProfessor(Professor professor) {
		// TODO Auto-generated method stub
		professoresDoBanco.add(professor);
	}

	@Override
	public void removerProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		for (Professor professor : professoresDoBanco) {
			if (professor.getIdProfessor()==idProfessor) {
				professoresDoBanco.remove(professor);
			}
		}
	}

	@Override
	public Professor buscarProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		for (Professor professor : professoresDoBanco) {
			if (professor.getIdProfessor()==idProfessor) {
				return professor;
			}
		}
		return null;
	}

	@Override
	public List<Professor> listarProfessor() {
		// TODO Auto-generated method stub
		return professoresDoBanco;
	}

}
