package negocio;

import java.util.List;

public class FechadaDisciplina implements IFechadaDisciplina {

	private DisciplinaControlador disciplinaControlador;

	public FechadaDisciplina() {
		disciplinaControlador = new DisciplinaControlador();
	}

	@Override
	public void inserirDisciplina(Disciplina disciplina) throws ExceptionElementoExiste{
		// TODO Auto-generated method stub
		disciplinaControlador.inserirDisciplina(disciplina);
	}

	@Override
	public void removerDisciplina(int idDisciplina) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
		disciplinaControlador.removerDisciplina(idDisciplina);
	}

	@Override
	public Disciplina buscarDisciplina(int idDisciplina) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
		return disciplinaControlador.buscarDisciplina(idDisciplina);
	}

	@Override
	public List<Disciplina> listarDisciplina() {
		// TODO Auto-generated method stub
		return disciplinaControlador.listarDisciplina();
		
	}

}
