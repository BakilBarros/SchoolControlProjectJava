package dados;

import java.util.List;

import negocio.ExceptionElementoExiste;
import negocio.ExceptionElementoInvalido;
import negocio.Professor;

public interface IRepositoryProfessor {

	public Professor logar(String login, String senha) throws ExceptionElementoInvalido;

	public void inserirProfessor(Professor professor) throws ExceptionElementoExiste;

	public void removerProfessor(int idProfessor) throws ExceptionElementoInvalido;

	public Professor buscarProfessor(int idProfessor) throws ExceptionElementoInvalido;

	public List<Professor> listarProfessor();
	
	public boolean verificarExistenciaElemento(int idProfessor);

}
