package negocio;

import java.util.List;

public interface IFechadaAluno {
	
	public Aluno logar(String login, String senha);

	public void inserirAluno(Aluno aluno);
	
	public Aluno exibirAluno(int idAluno);
	
	public void removerAluno(int idTurma);

	public Aluno buscarAluno(int matricula);

	public List<Aluno> listarAluno();
	
	public List<Aluno> calcularFinal();

}
