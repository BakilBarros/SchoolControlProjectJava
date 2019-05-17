package negocio;

import java.util.List;

public class FechadaAluno implements IFechadaAluno {

	private AlunoControlador alunoControlador;

	public FechadaAluno() {
		alunoControlador = new AlunoControlador();
	}

	@Override
	public Aluno logar(String login, String senha) {
		// TODO Auto-generated method stub
		return alunoControlador.logar(login, senha);
	}

	@Override
	public void inserirAluno(Aluno aluno) {
		// TODO Auto-generated method stub
		alunoControlador.inserirAluno(aluno);
	}

	@Override
	public Aluno exibirAluno(int matricula) {
		// TODO Auto-generated method stub
		alunoControlador.exibirAluno(matricula);
		return null;
	}

	@Override
	public void removerAluno(int idTurma) {
		// TODO Auto-generated method stub
		alunoControlador.removerAluno(idTurma);

	}

	@Override
	public Aluno buscarAluno(int matricula) {
		// TODO Auto-generated method stub
		alunoControlador.buscarAluno(matricula);
		return alunoControlador.buscarAluno(matricula);
	}

	@Override
	public List<Aluno> listarAluno() {
		// TODO Auto-generated method stub
		return alunoControlador.listarAluno();
	}

	@Override
	public List<Aluno> exibirReprovados() {
		// TODO Auto-generated method stub
		alunoControlador.exibirReprovados();
		return null;
	}

	@Override
	public List<Aluno> exibirAprovados() {
		// TODO Auto-generated method stub
		alunoControlador.exibirAprovados();
		return null;
	}

	@Override
	public List<Aluno> calcularFinal() {
		// TODO Auto-generated method stub
		alunoControlador.calcularFinal();
		return null;
	}

}
