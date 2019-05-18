package negocio;

import java.util.List;

public interface IFechadaTurma {
	
	public List<Turma> exibirTurmasAluno(int matricula);
	
	public Turma exibirTurmasDisponiveis(int idAluno);
	
	public void inserirTurma(Turma turma);

	public void removerTurma(int idTurma);

	public Turma buscarTurma(int idTurma);

	public List<Turma> listarTurma();
	
	public List<Turma> listarTurmasProfessor(int idProfessor);

	public Turma exibirDetalhesTurmas(int idTurma);
	

}
