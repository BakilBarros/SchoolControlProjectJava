package negocio;

import java.util.List;

public interface IFechadaProfessor {
	
	public Professor logar(String login, String senha);

	public void inserirProfessor(Professor professor);
	
	public void removerProfessor(int idProfessor);

	public Professor buscarProfessor(int idProfessor);

	public List<Professor> listarProfessor();

}
