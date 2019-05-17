package dados;

import java.util.List;

import negocio.Professor;

public interface IRepositoryProfessor {
	
	public Professor logar(String login, String senha);

	public void inserirProfessor(Professor professor);
	
	public void removerProfessor(int idProfessor);

	public Professor buscarProfessor(int idProfessor);

	public List<Professor> listarProfessor();

}
