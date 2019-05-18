package dados;

import java.util.List;

import negocio.Turma;

public interface IRepositoryTurma {
	
	public List<Turma> exibirTurmasDisponiveisProfessor(int idProfessor);
	
	public void inserirTurma(Turma turma);

	public void removerTurma(int idTurma);

	public Turma buscarTurma(int idTurma);

	public List<Turma> listarTurma();

	public List<Turma> listarTurmasProfessor(int idProfessor);


}
