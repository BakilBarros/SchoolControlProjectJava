package negocio;

import java.util.List;

import dados.IRepositoryAluno;
import dados.RepositoryAluno;

public class AlunoControlador{

	private IRepositoryAluno irepositoryAluno;

	public AlunoControlador() {
		irepositoryAluno = new RepositoryAluno();
	}

	public Aluno logar(String login, String senha) throws ExceptionElementoInvalido {
		return irepositoryAluno.logar(login, senha);
	}

	public void inserirAluno(Aluno aluno) throws ExceptionElementoExiste {
		// TODO Auto-generated method stub
		irepositoryAluno.inserirAluno(aluno);

	}

	public Aluno exibirAluno(int matricula) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		return irepositoryAluno.exibirAluno(matricula);

	}

	public void removerAluno(int matricula) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		irepositoryAluno.removerAluno(matricula);
	}

	public Aluno buscarAluno(int matricula) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		return irepositoryAluno.buscarAluno(matricula);
	}

	public List<Aluno> listarAluno() {
		return irepositoryAluno.listarAluno();
	}

}
