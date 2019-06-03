package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.ExceptionElementoExiste;
import negocio.ExceptionElementoInvalido;
import negocio.Professor;

public class RepositoryProfessor implements IRepositoryProfessor {

	private List<Professor> professoresDoBanco;

	public RepositoryProfessor() {
		professoresDoBanco = new ArrayList<>();
	}

	@Override
	public Professor logar(String login, String senha) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		for (Professor professor : professoresDoBanco) {
			if (professor.getLoginProfessor().equals(login) && professor.getSenhaProfessor().equals(senha)) {
				return professor;
			}else{
                throw new ExceptionElementoInvalido("Login Inválido");        
                        }
		}
		return null;
	}

	@Override
	public void inserirProfessor(Professor professor) throws ExceptionElementoExiste {
		// TODO Auto-generated method stub
		if (!verificarExistenciaElemento(professor.getIdProfessor())) {
			professoresDoBanco.add(professor);
		} else {
			throw new ExceptionElementoExiste("Professor já cadastrado");
		}
	}

	@Override
	public void removerProfessor(int idProfessor) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		for (Professor professor : professoresDoBanco) {
			if (professor.getIdProfessor() == idProfessor) {
				professoresDoBanco.remove(professor);
				break;
			}else{
                            
                throw new ExceptionElementoInvalido("Pesquisa Inválida!!"); 
                
                        }
                        
		}
		
	}

	@Override
	public Professor buscarProfessor(int idProfessor) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		for (Professor professor : professoresDoBanco) {
			if (professor.getIdProfessor() == idProfessor) {
				return professor;
			}
		}
		throw new ExceptionElementoInvalido("Pesquisa Inv�lida!!");
	}

	@Override
	public List<Professor> listarProfessor() {
		// TODO Auto-generated method stub
		return professoresDoBanco;
	}

	@Override
	public boolean verificarExistenciaElemento(int idProfessor) {
		// TODO Auto-generated method stub
		for (Professor professor : professoresDoBanco) {
			if (professor.getIdProfessor() == idProfessor) {
				return true;
			}
		}
		return false;
	}

}
