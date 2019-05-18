package negocio;

import java.util.List;

public interface IFechadaRendimentoEscolar {
	
	public String calculoPorcentagem ();
	
	public void atribuir(RendimentoEscolar rendimentoEscolar);

	public RendimentoEscolar exibirMediaComBonus();

	public List<RendimentoEscolar> exibirMedias();
	
	public List<RendimentoEscolar> exibirRendimentoEscolar();
	
	public List<RendimentoEscolar> listarTurmasAluno(int matricula);

}
