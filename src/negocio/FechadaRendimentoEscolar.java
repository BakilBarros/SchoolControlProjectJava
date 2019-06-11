package negocio;

import java.util.List;

public class FechadaRendimentoEscolar implements IFechadaRendimentoEscolar {

	private RendimentoEscolarControlador rendimentoEscolarControlador;
        private static FechadaRendimentoEscolar instancia;
        

	public FechadaRendimentoEscolar() {
		rendimentoEscolarControlador = new RendimentoEscolarControlador();
	}
        
          public static FechadaRendimentoEscolar getInstancia(){
            if (instancia == null) {
                instancia = new FechadaRendimentoEscolar();
            }         
            return instancia;     
        }

	@Override
	public String calculoPorcentagem() {
		// TODO Auto-generated method stub
		return rendimentoEscolarControlador.calculoPorcentagem();
		
	}

	@Override
	public void atribuir(RendimentoEscolar rendimentoEscolar) {
		// TODO Auto-generated method stub
		rendimentoEscolarControlador.atribuir(rendimentoEscolar);
	}

	@Override
	public RendimentoEscolar exibirMediaComBonus() {
		// TODO Auto-generated method stub
		return rendimentoEscolarControlador.exibirMediaComBonus();
		 
	}

	@Override
	public List<RendimentoEscolar> exibirMedias() {
		// TODO Auto-generated method stub
		return rendimentoEscolarControlador.exibirMedias();
		
	}

	@Override
	public List<RendimentoEscolar> exibirRendimentoEscolar() {
		// TODO Auto-generated method stub
		return rendimentoEscolarControlador.exibirRendimentoEscolar();
		 
	}

	@Override
	public List<Turma> listarTurmasAluno(int matricula) {
		// TODO Auto-generated method stub
		return rendimentoEscolarControlador.listarTurmasAluno(matricula);
	}

	@Override
	public List<RendimentoEscolar> exibirRendimentoEscolarDoAluno(int matricula) {
		// TODO Auto-generated method stub
		return rendimentoEscolarControlador.exibirRendimentoEscolarDoAluno(matricula);
	}

	@Override
	public List<Turma> listarTurmasDisponiveisAluno(int matricula) {
		// TODO Auto-generated method stub
		return rendimentoEscolarControlador.listarTurmasDisponiveisAluno(matricula);
	}


}
