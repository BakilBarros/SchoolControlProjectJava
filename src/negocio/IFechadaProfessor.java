package negocio;

import java.util.List;

public interface IFechadaProfessor {
	
	public Professor logar(String login, String senha);

	public void inserirProfessor(Professor professor) throws ExceptionElementoExiste;

	public void removerProfessor(int idProfessor) throws ExceptionElementoInvalido;

	public Professor buscarProfessor(int idProfessor) throws ExceptionElementoInvalido;

	public List<Professor> listarProfessor();

}
