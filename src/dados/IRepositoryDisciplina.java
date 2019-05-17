package dados;

import java.util.List;

import negocio.Disciplina;

public interface IRepositoryDisciplina {
	
	public void inserirDisciplina(Disciplina disciplina);

	public void removerDisciplina(int idDisciplina);

	public Disciplina buscarDisciplina(int idDisciplina);

	public List<Disciplina> listarDisciplina();

}
