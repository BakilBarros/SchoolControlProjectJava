package negocio;

import java.util.List;

public interface IFechadaRendimentoEscolar {
	
	public RendimentoEscolar visualizarTrabalhos(int idAluno);
	
	public void atribuir(RendimentoEscolar rendimentoEscolar);

	public RendimentoEscolar visualizarTrabalhosEntregues();

	public Double exibirMedias();
	
	public List<RendimentoEscolar> exibirMediasComBonus();
	
	public List<RendimentoEscolar> listarTurmasAluno(int matricula);

}
