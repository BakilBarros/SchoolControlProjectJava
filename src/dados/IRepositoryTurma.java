package dados;

import java.util.List;
import negocio.Disciplina;

import negocio.ExceptionElementoExiste;
import negocio.ExceptionElementoInvalido;
import negocio.Professor;
import negocio.Turma;

public interface IRepositoryTurma {
	
	public List<Turma> exibirTurmasDisponiveisProfessor(int idProfessor);
	
	public void inserirTurma(Turma turma) throws ExceptionElementoExiste;

	public void removerTurma(int idTurma) throws ExceptionElementoInvalido;

	public Turma buscarTurma(int idTurma) throws ExceptionElementoInvalido;

	public void alterarTurma (int idTurma, Disciplina disciplina, Professor professor) throws ExceptionElementoInvalido ;
        
        public List<Turma> listarTurma();

	public List<Turma> listarTurmasProfessor(int idProfessor);
	
	public boolean verificarExistenciaElemento(int idTurma);
        
        


}
