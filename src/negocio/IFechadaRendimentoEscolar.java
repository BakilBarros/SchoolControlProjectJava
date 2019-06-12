package negocio;

import java.util.List;

public interface IFechadaRendimentoEscolar {
	
	public String calculoPorcentagem ();
	
	public void atribuir(RendimentoEscolar rendimentoEscolar);

	public RendimentoEscolar exibirMediaComBonus();

	public List<RendimentoEscolar> exibirMedias();
	
	public List<RendimentoEscolar> exibirRendimentoEscolar();
	
	public List<RendimentoEscolar> exibirRendimentoEscolarDoAluno(int matricula);
	
	public List<Turma> listarTurmasAluno(int matricula);
	
	public List<Turma> listarTurmasDisponiveisAluno(int matricula);
        
        public void alterarRendimentoEscolarAluno(int idRendimento, String[] trabalhosRendimentoEscolar);
        
        public void alterarRendimentoEscolarProfessor(int idRendimento, Double nota1, Double nota2, Double[] notasDostrabalhosRendimentoEscolar);

}
