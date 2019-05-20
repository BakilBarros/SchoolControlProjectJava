package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.ExceptionElementoExiste;
import negocio.ExceptionElementoInvalido;
import negocio.Turma;

public class RepositoryTurma implements IRepositoryTurma {

	private List<Turma> turmasDoBanco;
	private List<Turma> armazenaVetor;

	public RepositoryTurma() {
		turmasDoBanco = new ArrayList<>();
		armazenaVetor = new ArrayList<>();
	}

	@Override
	public List<Turma> exibirTurmasDisponiveisProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		for (Turma turma : turmasDoBanco) {
			if (turma.getProfessorTurma().getIdProfessor() != idProfessor) {
				armazenaVetor.add(turma);
			}
		}
		return armazenaVetor;
	}

	@Override
	public void inserirTurma(Turma turma) throws ExceptionElementoExiste {
		// TODO Auto-generated method stub
		if (!verificarExistenciaElemento(turma.getIdTurma())) {
			turmasDoBanco.add(turma);
		} else {
			throw new ExceptionElementoExiste("Turma jÃ¡ cadastrado");
		}
	}

	@Override
	public void removerTurma(int idTurma) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		for (Turma turma : turmasDoBanco) {
			if (turma.getIdTurma() == idTurma) {
				turmasDoBanco.remove(turma);
				break;
			}
		}
		throw new ExceptionElementoInvalido("Matrícula Inválida!!");

	}

	@Override
	public Turma buscarTurma(int idTurma) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		for (Turma turma : turmasDoBanco) {
			if (turma.getIdTurma() == idTurma) {
				return turma;
			}
		}
		throw new ExceptionElementoInvalido("Matrícula Inválida!!");
	}

	@Override
	public List<Turma> listarTurma() {
		// TODO Auto-generated method stub
		return turmasDoBanco;
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

	@Override
	public boolean verificarExistenciaElemento(int idTurma) {
		// TODO Auto-generated method stub
		for (Turma turma : turmasDoBanco) {
			if (turma.getIdTurma() == idTurma) {
				return true;
			}
		}
		return false;
	}
}
