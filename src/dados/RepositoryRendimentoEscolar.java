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
	public String calculoPorcentagem() {
		// TODO Auto-generated method stub
		int contador = 0;
		for (RendimentoEscolar rendimentoEscolar : rendimentoEscolarDoBanco) {
			if (rendimentoEscolar.getMediaAluno()>7.0) {
				contador++;
			} else if(rendimentoEscolar.getMediaAluno()>7.0) {

			}else{
				
			}
		}
		return null;
	}

	@Override
	public void atribuir(RendimentoEscolar rendimentoEscolar) {
		// TODO Auto-generated method stub
		rendimentoEscolarDoBanco.add(rendimentoEscolar);
	}

	@Override
	public RendimentoEscolar exibirMediaComBonus() {
		// TODO Auto-generated method stub
		for (RendimentoEscolar rendimentoEscolar : rendimentoEscolarDoBanco) {
			rendimentoEscolar.getMediaAluno();
		}

		return null;
	}

	@Override
	public List<RendimentoEscolar> exibirMedias() {
		for (RendimentoEscolar rendimentoEscolar : rendimentoEscolarDoBanco) {
			rendimentoEscolar.getMediaAluno();
		}

		return rendimentoEscolarDoBanco;

	}

	@Override
	public List<RendimentoEscolar> exibirRendimentoEscolar() {
		// TODO Auto-generated method stub
		return rendimentoEscolarDoBanco;
	}

	@Override
	public List<RendimentoEscolar> listarTurmasAluno(int matricula) {
		// TODO Auto-generated method stub
		return null;

	}

}
