package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.Turma;

public class RepositoryTurma implements IRepositoryTurma {

	private List<Turma> turmasDoBanco;
	private List<Turma> armazenaVetor;

	public RepositoryTurma() {
		turmasDoBanco = new ArrayList<>();
		armazenaVetor = new ArrayList<>();
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
		for (Turma turma : turmasDoBanco) {
			if (turma.getIdTurma() == idTurma) {
				return turma;
			}
		}
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
	public List<Turma> listarTurmasProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		for (Turma turma : turmasDoBanco) {
			if (turma.getProfessorTurma().getIdProfessor() == idProfessor) {
				armazenaVetor.add(turma);
			}
		}
		return armazenaVetor;
	}
}
