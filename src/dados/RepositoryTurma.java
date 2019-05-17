package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.Turma;

public class RepositoryTurma implements IRepositoryTurma {

	private List<Turma> turmasDoBanco;

	public RepositoryTurma() {
		turmasDoBanco = new ArrayList<>();
	}

	@Override
	public List<Turma> exibirTurmasAluno(int matricula) {
		// TODO Auto-generated method stub
		return turmasDoBanco;
	}

	@Override
	public Turma exibirTurmasDisponiveis(int idAluno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void inserirTurma(Turma turma) {
		// TODO Auto-generated method stub
		turmasDoBanco.add(turma);
	}

	@Override
	public void removerTurma(int idTurma) {
		// TODO Auto-generated method stub

	}

	@Override
	public Turma buscarTurma(int idTurma) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Turma> listarTurma() {
		// TODO Auto-generated method stub
		return turmasDoBanco;
	}

	@Override
	public Turma exibirDetalhesTurmas(int idTurma) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int listarTurmasProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		for (Turma turma : turmasDoBanco) {
			return turmasDoBanco.indexOf(turma.getIdTurma());
			
		}
		return 0;
	}
}
