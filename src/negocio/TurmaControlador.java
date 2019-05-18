package negocio;

import java.util.List;

import dados.IRepositoryTurma;
import dados.RepositoryTurma;

public class TurmaControlador implements IRepositoryTurma {

	private IRepositoryTurma irepositoryTurma;
	

	public TurmaControlador() {
		irepositoryTurma = new RepositoryTurma();
	}

	public List<Turma> exibirTurmasAluno(int matricula) {
		// TODO Auto-generated method stub
		irepositoryTurma.exibirTurmasAluno(matricula);
		return null;
	}

	public Turma exibirTurmasDisponiveis(int idAluno) {
		// TODO Auto-generated method stub
		irepositoryTurma.exibirTurmasDisponiveis(idAluno);
		return null;
	}

	public void inserirTurma(Turma turma) {
		// TODO Auto-generated method stub
		irepositoryTurma.inserirTurma(turma);
	}

	public void removerTurma(int idTurma) {
		// TODO Auto-generated method stub
		irepositoryTurma.removerTurma(idTurma);
	}

	public Turma buscarTurma(int idTurma) {
		// TODO Auto-generated method stub
		return irepositoryTurma.buscarTurma(idTurma);
	}

	public List<Turma> listarTurma() {
		// TODO Auto-generated method stu 	
		return irepositoryTurma.listarTurma();
	}


	public Turma exibirDetalhesTurmas(int idTurma) {
		// TODO Auto-generated method stub
		irepositoryTurma.exibirDetalhesTurmas(idTurma);
		return null;
	}

	@Override
	public List<Turma> listarTurmasProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		return irepositoryTurma.listarTurmasProfessor(idProfessor);
	}

}
