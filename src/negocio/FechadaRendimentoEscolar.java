package negocio;

import java.util.List;

public class FechadaRendimentoEscolar implements IFechadaRendimentoEscolar {

	private RendimentoEscolarControlador rendimentoEscolarControlador;

	public FechadaRendimentoEscolar() {
		rendimentoEscolarControlador = new RendimentoEscolarControlador();
	}

	@Override
	public RendimentoEscolar visualizarTrabalhos(int idAluno) {
		// TODO Auto-generated method stub
		rendimentoEscolarControlador.visualizarTrabalhos(idAluno);
		return null;
	}

	@Override
	public void atribuir(RendimentoEscolar rendimentoEscolar) {
		// TODO Auto-generated method stub
		rendimentoEscolarControlador.atribuir(rendimentoEscolar);
	}

	@Override
	public RendimentoEscolar visualizarTrabalhosEntregues() {
		// TODO Auto-generated method stub
		rendimentoEscolarControlador.visualizarTrabalhosEntregues();
		return null;
	}

	@Override
	public Double exibirMedias() {
		// TODO Auto-generated method stub
		return rendimentoEscolarControlador.exibirMedias();
		
	}

	@Override
	public List<RendimentoEscolar> exibirMediasComBonus() {
		// TODO Auto-generated method stub
		rendimentoEscolarControlador.exibirMediasComBonus();
		return null;
	}

	@Override
	public List<RendimentoEscolar> listarTurmasAluno(int matricula) {
		// TODO Auto-generated method stub
		return rendimentoEscolarControlador.listarTurmasAluno(matricula);
	}

}
