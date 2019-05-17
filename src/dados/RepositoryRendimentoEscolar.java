package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.RendimentoEscolar;

public class RepositoryRendimentoEscolar implements IRepositoryRendimentoEscolar {

	private List<RendimentoEscolar> rendimentoEscolarDoBanco;

	public RepositoryRendimentoEscolar() {
		rendimentoEscolarDoBanco = new ArrayList<>();
	}

	@Override
	public RendimentoEscolar visualizarTrabalhos(int idAluno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atribuir(RendimentoEscolar rendimentoEscolar) {
		// TODO Auto-generated method stub
		rendimentoEscolarDoBanco.add(rendimentoEscolar);
	}
	public RendimentoEscolar teste() {
		// TODO Auto-generated method stub
		for (RendimentoEscolar rendimentoEscolar : rendimentoEscolarDoBanco) {
			return rendimentoEscolar;
		}
		return null;
	}

	@Override
	public RendimentoEscolar visualizarTrabalhosEntregues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double exibirMedias() {
		// TODO Auto-generated method stub
		Double media;
		for (RendimentoEscolar rendimentoEscolar : rendimentoEscolarDoBanco) {
			media = (rendimentoEscolar.getNota1RedimentoEscolar() + rendimentoEscolar.getNota2RedimentoEscolar())/2;
			return media;
		}
		return null;
	}

	@Override
	public List<RendimentoEscolar> exibirMediasComBonus() {
		// TODO Auto-generated method stub
		return rendimentoEscolarDoBanco;
	}

	@Override
	public List<RendimentoEscolar> listarTurmasAluno(int matricula) {
		// TODO Auto-generated method stub
		return null;
		
	}

}
