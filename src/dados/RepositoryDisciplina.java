package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.Disciplina;

public class RepositoryDisciplina implements IRepositoryDisciplina {

	private List<Disciplina> disciplinaDoBanco;

	public RepositoryDisciplina() {

		disciplinaDoBanco = new ArrayList<>();
	}

	@Override
	public void inserirDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		disciplinaDoBanco.add(disciplina);

	}

	@Override
	public void removerDisciplina(int idDisciplina) {
		// TODO Auto-generated method stub
		for (Disciplina disciplina : disciplinaDoBanco) {
			if (disciplina.getIdDisciplina() == idDisciplina) {
				disciplinaDoBanco.remove(disciplina);
				break;
			}
		}
	}

	@Override
	public Disciplina buscarDisciplina(int idDisciplina) {
		// TODO Auto-generated method stub
		for (Disciplina disciplina : disciplinaDoBanco) {
			if (disciplina.getIdDisciplina() == idDisciplina) {
				return disciplina;
			}
		}
		return null;
	}

	@Override
	public List<Disciplina> listarDisciplina() {
		// TODO Auto-generated method stub
		return disciplinaDoBanco;
	}

}
