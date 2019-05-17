package negocio;

import java.util.List;

public class FechadaTurma implements IFechadaTurma {

	private TurmaControlador turmaControlador;

	public FechadaTurma() {
		 turmaControlador = new TurmaControlador();
	}

	@Override
	public List<Turma> exibirTurmasAluno(int matricula) {
		// TODO Auto-generated method stub
		turmaControlador.exibirTurmasAluno(matricula);
		return null;
		
	}

	@Override
	public Turma exibirTurmasDisponiveis(int idAluno) {
		// TODO Auto-generated method stub
		turmaControlador.exibirTurmasDisponiveis(idAluno);
		return null;
	}


	@Override
	public void inserirTurma(Turma turma) {
		// TODO Auto-generated method stub
		turmaControlador.inserirTurma(turma);
	}

	@Override
	public void removerTurma(int idTurma) {
		// TODO Auto-generated method stub
		turmaControlador.removerTurma(idTurma);
	}

	@Override
	public Turma buscarTurma(int idTurma) {
		// TODO Auto-generated method stub
		turmaControlador.buscarTurma(idTurma);
		return null;
	}

	@Override
	public List<Turma> listarTurma() {
		// TODO Auto-generated method stub
		return turmaControlador.listarTurma();
	}


	@Override
	public Turma exibirDetalhesTurmas(int idTurma) {
		// TODO Auto-generated method stub
		turmaControlador.exibirDetalhesTurmas(idTurma);
		return null;
	}

	@Override
	public int listarTurmasProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		return turmaControlador.listarTurmasProfessor(idProfessor);
	}



}
