package negocio;

import java.util.List;

public interface IFechadaTurma {
	
	public List<Turma> exibirTurmasDisponiveisProfessor(int idProfessor);
	
	public void inserirTurma(Turma turma) throws ExceptionElementoExiste;

	public void removerTurma(int idTurma) throws ExceptionElementoInvalido;

	public Turma buscarTurma(int idTurma) throws ExceptionElementoInvalido;

	public List<Turma> listarTurma();

	public List<Turma> listarTurmasProfessor(int idProfessor);
	

}
