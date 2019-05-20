package negocio;

import java.util.List;

public interface IFechadaDisciplina {
	
	public void inserirDisciplina(Disciplina disciplina) throws ExceptionElementoExiste;

	public void removerDisciplina(int idDisciplina) throws ExceptionElementoInvalido;

	public Disciplina buscarDisciplina(int idDisciplina) throws ExceptionElementoInvalido;

	public List<Disciplina> listarDisciplina();
	
}
