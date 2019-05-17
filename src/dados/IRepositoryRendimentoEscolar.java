package dados;

import java.util.List;

import negocio.RendimentoEscolar;

public interface IRepositoryRendimentoEscolar {
	
	public RendimentoEscolar visualizarTrabalhos(int idAluno);
	
	public void atribuir(RendimentoEscolar rendimentoEscolar);

	public RendimentoEscolar visualizarTrabalhosEntregues();

	public Double exibirMedias();
	
	public List<RendimentoEscolar> exibirMediasComBonus();

	public List<RendimentoEscolar> listarTurmasAluno(int matricula);
	
	

}
