package negocio;

import java.util.List;

import dados.IRepositoryRendimentoEscolar;
import dados.RepositoryRendimentoEscolar;

public class RendimentoEscolarControlador implements IRepositoryRendimentoEscolar{

	private IRepositoryRendimentoEscolar irendimentoEscolar;
	
	public RendimentoEscolarControlador() {
		irendimentoEscolar = new RepositoryRendimentoEscolar();
	}


	public String calculoPorcentagem () {
		// TODO Auto-generated method stub
		return irendimentoEscolar.calculoPorcentagem();
		
	}

	
	public void atribuir(RendimentoEscolar rendimentoEscolar) {
		// TODO Auto-generated method stub
		irendimentoEscolar.atribuir(rendimentoEscolar);
	}

	
	public RendimentoEscolar exibirMediaComBonus() {
		// TODO Auto-generated method stub
		return irendimentoEscolar.exibirMediaComBonus();
		 
	}

	public List<RendimentoEscolar> exibirMedias() {
		// TODO Auto-generated method stub
		return irendimentoEscolar.exibirMedias();
	
	}

	
	public List<RendimentoEscolar> exibirRendimentoEscolar() {
		// TODO Auto-generated method stub
		return irendimentoEscolar.exibirRendimentoEscolar();
		 
	}


	@Override
	public List<Turma> listarTurmasAluno(int matricula) {
		// TODO Auto-generated method stub
		return irendimentoEscolar.listarTurmasAluno(matricula);
	}


	@Override
	public List<RendimentoEscolar> exibirRendimentoEscolarDoAluno(int matricula) {
		// TODO Auto-generated method stub
		return irendimentoEscolar.exibirRendimentoEscolarDoAluno(matricula);
	}


	@Override
	public List<Turma> listarTurmasDisponiveisAluno(int matricula) {
		// TODO Auto-generated method stub
		return irendimentoEscolar.listarTurmasDisponiveisAluno(matricula);
	}
	
	
}
