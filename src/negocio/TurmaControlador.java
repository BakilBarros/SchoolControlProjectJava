package negocio;

import java.util.List;

import dados.IRepositoryTurma;
import dados.RepositoryTurma;

public class TurmaControlador{

	private IRepositoryTurma irepositoryTurma;

	public TurmaControlador() {
		irepositoryTurma = new RepositoryTurma();
	}

	public List<Turma> exibirTurmasDisponiveisProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		return irepositoryTurma.exibirTurmasDisponiveisProfessor(idProfessor);

	}

	public void inserirTurma(Turma turma) throws ExceptionElementoExiste {
		// TODO Auto-generated method stub
		irepositoryTurma.inserirTurma(turma);
	}

	public void removerTurma(int idTurma) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		irepositoryTurma.removerTurma(idTurma);
	}

	public Turma buscarTurma(int idTurma) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		return irepositoryTurma.buscarTurma(idTurma);
	}

	public List<Turma> listarTurma() {
		// TODO Auto-generated method stu
		return irepositoryTurma.listarTurma();
	}

	public List<Turma> listarTurmasProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		return irepositoryTurma.listarTurmasProfessor(idProfessor);
	}

}
