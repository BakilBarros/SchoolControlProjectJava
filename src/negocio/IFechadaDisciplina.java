package negocio;

import java.util.List;

public interface IFechadaDisciplina {
	
	public void inserirDisciplina(Disciplina disciplina);

	public void removerDisciplina(int idDisciplina);

	public Disciplina buscarDisciplina(int idDisciplina);

	public List<Disciplina> listarDisciplina();
	
}
