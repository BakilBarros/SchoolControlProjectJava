package negocio;

import java.util.List;

import dados.IRepositoryAluno;
import dados.RepositoryAluno;

public class AlunoControlador {
	
	private IRepositoryAluno irepositoryAluno;
	
	public AlunoControlador() {
		irepositoryAluno = new RepositoryAluno();
	}

	public Aluno logar(String login, String senha) {
		return irepositoryAluno.logar(login, senha);
	}

	public void inserirAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		irepositoryAluno.inserirAluno(aluno);
		
	}

	public Aluno exibirAluno(int idAluno) {
		// TODO Auto-generated method stub
		irepositoryAluno.exibirAluno(idAluno);
		return null;
	}

	public void removerAluno(int idTurma) {
		// TODO Auto-generated method stub
		irepositoryAluno.removerAluno(idTurma);
	}

	public Aluno buscarAluno(int matricula) {
		// TODO Auto-generated method stub
		irepositoryAluno.buscarAluno(matricula);
		return irepositoryAluno.buscarAluno(matricula);
	}

	public List<Aluno> listarAluno() {
		return irepositoryAluno.listarAluno();
	}

	public List<Aluno> exibirReprovados() {
		// TODO Auto-generated method stub
		irepositoryAluno.exibirReprovados();
		return null;
	}

	public List<Aluno> exibirAprovados() {
		// TODO Auto-generated method stub
		irepositoryAluno.exibirAprovados();
		return null;
	}

	public List<Aluno> calcularFinal() {
		// TODO Auto-generated method stub
		irepositoryAluno.calcularFinal();
		return null;
	}
	
	

}
