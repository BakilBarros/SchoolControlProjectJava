package negocio;

import java.util.List;

public class FechadaProfessor implements IFechadaProfessor {

	private ProfessorControlador professorControlador;

	public FechadaProfessor() {
		professorControlador = new ProfessorControlador();
	}

	@Override
	public Professor logar(String login, String senha) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
		return professorControlador.logar(login, senha);
	
	}

	@Override
	public void inserirProfessor(Professor professor) throws ExceptionElementoExiste{
		// TODO Auto-generated method stub
		professorControlador.inserirProfessor(professor);
	}

	@Override
	public void removerProfessor(int idProfessor) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
		professorControlador.removerProfessor(idProfessor);
	}

	@Override
	public Professor buscarProfessor(int idProfessor) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
	return	professorControlador.buscarProfessor(idProfessor);
	
	}

	@Override
	public List<Professor> listarProfessor() {
		// TODO Auto-generated method stub
		return professorControlador.listarProfessor();
		
	}

}
