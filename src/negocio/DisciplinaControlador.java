package negocio;

import java.util.List;

import dados.IRepositoryDisciplina;
import dados.RepositoryDisciplina;

public class DisciplinaControlador {

	private IRepositoryDisciplina irepositoryDisciplina;
	
	public DisciplinaControlador() {
		irepositoryDisciplina = new RepositoryDisciplina();
	}

	public void inserirDisciplina(Disciplina disciplina) {
		// TODO Auto-generated method stub
		irepositoryDisciplina.inserirDisciplina(disciplina);

	}

	public void removerDisciplina(int idDisciplina) {
		// TODO Auto-generated method stub
		irepositoryDisciplina.removerDisciplina(idDisciplina);
	}

	public Disciplina buscarDisciplina(int idDisciplina) {
		// TODO Auto-generated method stub
		return irepositoryDisciplina.buscarDisciplina(idDisciplina);
		 
	}

	public List<Disciplina> listarDisciplina() {
		// TODO Auto-generated method stub
		return irepositoryDisciplina.listarDisciplina();
	}

}
