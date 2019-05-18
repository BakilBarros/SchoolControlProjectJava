package dados;

import java.util.ArrayList;
import java.util.List;

import negocio.RendimentoEscolar;
import negocio.Turma;

public class RepositoryRendimentoEscolar implements IRepositoryRendimentoEscolar {

	private List<RendimentoEscolar> rendimentoEscolarDoBanco;
	private List<RendimentoEscolar> armazenaVetorRendimentoEscolar;
	private List<Turma> armazenaVetor;
	

	public RepositoryRendimentoEscolar() {
		rendimentoEscolarDoBanco = new ArrayList<>();
		armazenaVetor = new ArrayList<>();
		armazenaVetorRendimentoEscolar = new ArrayList<>();
		
	}

	@Override
	public String calculoPorcentagem() {
		// TODO Auto-generated method stub
		int contadorReprovado = 0, contadorAprovado = 0, contadorfinal = 0, somaAluno = 0;
		for (RendimentoEscolar rendimentoEscolar : rendimentoEscolarDoBanco) {
			if (rendimentoEscolar.getMediaAluno()>7.0) {
				contadorAprovado++;
			} else if(rendimentoEscolar.getMediaAluno()<7.0 && rendimentoEscolar.getMediaAluno()>3.0) {
				contadorfinal++;
			}else{
				contadorReprovado++;
			}
		}
		somaAluno = contadorAprovado + contadorReprovado + contadorfinal;
		
		return "Aprovados: "+(contadorAprovado*100)/somaAluno+"% Reprovados: "+(contadorReprovado*100)/somaAluno+"%  Final "+(contadorfinal*100)/somaAluno+ "% ";
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
	public List<Turma> listarTurmasAluno(int matricula) {
		// TODO Auto-generated method stub
		for (RendimentoEscolar rendimentoEscolar : rendimentoEscolarDoBanco) {
			if (rendimentoEscolar.getAlunoRedimentoEscolar().getMatricula()==matricula) {
				armazenaVetor.add(rendimentoEscolar.getTurmaRedimentoEscolar());
			}
		}
		return armazenaVetor;

	}

	@Override
	public List<RendimentoEscolar> exibirRendimentoEscolarDoAluno(int matricula) {
		// TODO Auto-generated method stub
		for (RendimentoEscolar rendimentoEscolar : rendimentoEscolarDoBanco) {
			if (rendimentoEscolar.getAlunoRedimentoEscolar().getMatricula()==matricula) {
				armazenaVetorRendimentoEscolar.add(rendimentoEscolar);
			}
		}
		return armazenaVetorRendimentoEscolar;
	}

	@Override
	public List<Turma> listarTurmasDisponiveisAluno(int matricula) {
		for (RendimentoEscolar rendimentoEscolar : rendimentoEscolarDoBanco) {
			if (rendimentoEscolar.getAlunoRedimentoEscolar().getMatricula() != matricula) {
				armazenaVetor.add(rendimentoEscolar.getTurmaRedimentoEscolar());
			}
		}
		return armazenaVetor;
	}

}
