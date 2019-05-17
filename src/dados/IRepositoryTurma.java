package dados;

import java.util.List;

import negocio.Turma;

public interface IRepositoryTurma {
	
	public List<Turma> exibirTurmasAluno(int matricula);
	
	public Turma exibirTurmasDisponiveis(int idAluno);
	
	public void inserirTurma(Turma turma);

	public void removerTurma(int idTurma);

	public Turma buscarTurma(int idTurma);

	public List<Turma> listarTurma();

	public int listarTurmasProfessor(int idProfessor);

	public Turma exibirDetalhesTurmas(int idTurma);


}
