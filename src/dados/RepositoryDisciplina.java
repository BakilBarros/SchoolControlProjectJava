package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.Disciplina;
import negocio.ExceptionElementoExiste;
import negocio.ExceptionElementoInvalido;

public class RepositoryDisciplina implements IRepositoryDisciplina {

	private List<Disciplina> disciplinaDoBanco;

	public RepositoryDisciplina() {

		disciplinaDoBanco = new ArrayList<>();
	}

	@Override
	public void inserirDisciplina(Disciplina disciplina) throws ExceptionElementoExiste {
		// TODO Auto-generated method stub
		if (!verificarExistenciaElemento(disciplina.getIdDisciplina())) {
			disciplinaDoBanco.add(disciplina);
		} else {
			throw new ExceptionElementoExiste("Disciplina já cadastrado");
		}
	}

	@Override
	public void removerDisciplina(int idDisciplina) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
		for (Disciplina disciplina : disciplinaDoBanco) {
			if (disciplina.getIdDisciplina() == idDisciplina) {
				disciplinaDoBanco.remove(disciplina);
				break;
			}else{
                throw new ExceptionElementoInvalido("Identificador Inválido");        
                        }
		}
		
	}

	@Override
	public Disciplina buscarDisciplina(int idDisciplina) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
		for (Disciplina disciplina : disciplinaDoBanco) {
			if (disciplina.getIdDisciplina() == idDisciplina) {
				return disciplina;
			}
		}
		throw new ExceptionElementoInvalido("Identificador Inv�lido");
	}

	@Override
	public List<Disciplina> listarDisciplina() {
		// TODO Auto-generated method stub
		return disciplinaDoBanco;
	}

	@Override
	public boolean verificarExistenciaElemento(int idDisciplina) {
		// TODO Auto-generated method stub
		for (Disciplina disciplina : disciplinaDoBanco) {
			if (disciplina.getIdDisciplina() == idDisciplina) {
				return true;
			}
		}
		return false;
	}

}
