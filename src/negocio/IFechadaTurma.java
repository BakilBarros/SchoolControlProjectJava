package negocio;

import java.util.List;

public interface IFechadaTurma {
	
	public List<Turma> exibirTurmasDisponiveisProfessor(int idProfessor);
	
	public void inserirTurma(Turma turma);

	public void removerTurma(int idTurma);

	public Turma buscarTurma(int idTurma);

	public List<Turma> listarTurma();

	public List<Turma> listarTurmasProfessor(int idProfessor);
	

}
