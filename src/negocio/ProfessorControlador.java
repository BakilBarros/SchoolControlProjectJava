package negocio;

import java.util.List;

import dados.IRepositoryProfessor;
import dados.RepositoryProfessor;

public class ProfessorControlador {

	private IRepositoryProfessor irepositoryProfessor;

	public ProfessorControlador() {
		irepositoryProfessor = new RepositoryProfessor();
	}

	public Professor logar(String login, String senha) {
		// TODO Auto-generated method stub
		return irepositoryProfessor.logar(login, senha);

	}

	public void inserirProfessor(Professor professor) {
		// TODO Auto-generated method stub
		irepositoryProfessor.inserirProfessor(professor);
	}

	public void removerProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		irepositoryProfessor.removerProfessor(idProfessor);
	}

	public Professor buscarProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		return irepositoryProfessor.buscarProfessor(idProfessor);

	}

	public List<Professor> listarProfessor() {
		// TODO Auto-generated method stub
		irepositoryProfessor.listarProfessor();
		return null;
	}

}
