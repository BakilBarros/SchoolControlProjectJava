package negocio;

import java.util.List;

public interface IFechadaAluno {
	
	public Aluno logar(String login, String senha);

	public void inserirAluno(Aluno aluno) throws ExceptionElementoExiste;
	
	public Aluno exibirAluno(int matricula) throws ExceptionElementoInvalido;
	
	public void removerAluno(int matricula) throws ExceptionElementoInvalido;

	public Aluno buscarAluno(int matricula) throws ExceptionElementoInvalido;

	public List<Aluno> listarAluno();

}
