package negocio;

import java.util.List;

import dados.IRepositoryRendimentoEscolar;
import dados.RepositoryRendimentoEscolar;

public class RendimentoEscolarControlador implements IRepositoryRendimentoEscolar{

	private IRepositoryRendimentoEscolar irendimentoEscolar;
	
	public RendimentoEscolarControlador() {
		irendimentoEscolar = new RepositoryRendimentoEscolar();
	}


	public RendimentoEscolar visualizarTrabalhos(int idAluno) {
		// TODO Auto-generated method stub
		irendimentoEscolar.visualizarTrabalhos(idAluno);
		return null;
	}

	
	public void atribuir(RendimentoEscolar rendimentoEscolar) {
		// TODO Auto-generated method stub
		irendimentoEscolar.atribuir(rendimentoEscolar);
	}

	
	public RendimentoEscolar visualizarTrabalhosEntregues() {
		// TODO Auto-generated method stub
		irendimentoEscolar.visualizarTrabalhosEntregues();
		return null;
	}

	
	public Double exibirMedias() {
		// TODO Auto-generated method stub
		return irendimentoEscolar.exibirMedias();
	
	}

	
	public List<RendimentoEscolar> exibirMediasComBonus() {
		// TODO Auto-generated method stub
		irendimentoEscolar.exibirMediasComBonus();
		return null;
	}


	@Override
	public List<RendimentoEscolar> listarTurmasAluno(int matricula) {
		// TODO Auto-generated method stub
		return irendimentoEscolar.listarTurmasAluno(matricula);
	}
	
	
}
