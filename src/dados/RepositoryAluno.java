package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.Aluno;
import negocio.ExceptionElementoExiste;
import negocio.ExceptionElementoInvalido;

public class RepositoryAluno implements IRepositoryAluno {

	private List<Aluno> alunosDoBanco;

	public RepositoryAluno() {
		alunosDoBanco = new ArrayList<>();

	}

	@Override
	public Aluno logar(String login, String senha) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		for (Aluno aluno : alunosDoBanco) {
			if (aluno.getLoginAluno().equals(login) && aluno.getSenhaAluno().equals(senha)) {
				return aluno;
			}else{
                throw new ExceptionElementoInvalido("Login Inválido");        
                        }
		}
            return null;
		
	}

	@Override
	public void inserirAluno(Aluno aluno) throws ExceptionElementoExiste {
		// TODO Auto-generated method stub
		if (!verificarExistenciaElemento(aluno.getMatricula())) {
			alunosDoBanco.add(aluno);
		} else {
			throw new ExceptionElementoExiste("Aluno já cadastrado");
		}
	}

	@Override
	public Aluno exibirAluno(int matricula) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		for (Aluno aluno : alunosDoBanco) {
			if (aluno.getMatricula() == matricula) {
				return aluno;
			}
		}
		throw new ExceptionElementoInvalido("Matr�cula Inv�lida!!");
	}

	@Override
	public void removerAluno(int matricula) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		for (Aluno aluno : alunosDoBanco) {
			if (aluno.getMatricula() == matricula) {
				alunosDoBanco.remove(aluno);
				break;
			}
		}
		throw new ExceptionElementoInvalido("Matr�cula Inv�lida!!");
	}

	@Override
	public Aluno buscarAluno(int matricula) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		for (Aluno aluno : alunosDoBanco) {
			if (aluno.getMatricula() == matricula) {
				return aluno;
			}
		}
		throw new ExceptionElementoInvalido("Matr�cula Inv�lida!!");

	}

	@Override
	public List<Aluno> listarAluno() {
		// TODO Auto-generated method stub
		return alunosDoBanco;
	}

	@Override
	public boolean verificarExistenciaElemento(int matricula) {
		// TODO Auto-generated method stub
		for (Aluno aluno : alunosDoBanco) {
			if (aluno.getMatricula() == matricula) {
				return true;
			}
		}
		return false;
	}

}
