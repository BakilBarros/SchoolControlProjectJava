package negocio;

import java.util.List;

import dados.IRepositoryProfessor;
import dados.RepositoryProfessor;

public class ProfessorControlador {

	private IRepositoryProfessor irepositoryProfessor;

	public ProfessorControlador() {
		irepositoryProfessor = new RepositoryProfessor();
	}

	public Professor logar(String login, String senha) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
		return irepositoryProfessor.logar(login, senha);

	}

	public void inserirProfessor(Professor professor) throws ExceptionElementoExiste{
		// TODO Auto-generated method stub
		irepositoryProfessor.inserirProfessor(professor);
	}

	public void removerProfessor(int idProfessor) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
		irepositoryProfessor.removerProfessor(idProfessor);
	}

	public Professor buscarProfessor(int idProfessor) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
		return irepositoryProfessor.buscarProfessor(idProfessor);

	}

	public List<Professor> listarProfessor() {
		// TODO Auto-generated method stub
		return irepositoryProfessor.listarProfessor();
		
	}

}
