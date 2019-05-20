package dados;

import java.util.List;

import negocio.Disciplina;
import negocio.ExceptionElementoExiste;
import negocio.ExceptionElementoInvalido;

public interface IRepositoryDisciplina {
	
	public void inserirDisciplina(Disciplina disciplina) throws ExceptionElementoExiste;

	public void removerDisciplina(int idDisciplina) throws ExceptionElementoInvalido;

	public Disciplina buscarDisciplina(int idDisciplina) throws ExceptionElementoInvalido;

	public List<Disciplina> listarDisciplina();
	
	public boolean verificarExistenciaElemento(int idDisciplina);

}
