package dados;

import java.util.List;

import negocio.RendimentoEscolar;

public interface IRepositoryRendimentoEscolar {
	
	public String calculoPorcentagem ();
	
	public void atribuir(RendimentoEscolar rendimentoEscolar);

	public RendimentoEscolar exibirMediaComBonus();

	public List<RendimentoEscolar> exibirMedias();
	
	public List<RendimentoEscolar> exibirRendimentoEscolar();

	public List<RendimentoEscolar> listarTurmasAluno(int matricula);
	
	

}
