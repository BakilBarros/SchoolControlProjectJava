package negocio;

import java.util.List;

public class FechadaTurma implements IFechadaTurma {

	private TurmaControlador turmaControlador;
        private static FechadaTurma instancia;

	public FechadaTurma() {
		turmaControlador = new TurmaControlador();
	}
        
        public static FechadaTurma getInstancia(){
            if (instancia == null) {
                instancia = new FechadaTurma();
            }         
            return instancia;     
        }

	@Override
	public List<Turma> exibirTurmasDisponiveisProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		return turmaControlador.exibirTurmasDisponiveisProfessor(idProfessor);

	}

	@Override
	public void inserirTurma(Turma turma) throws ExceptionElementoExiste {
		// TODO Auto-generated method stub
		turmaControlador.inserirTurma(turma);
	}

	@Override
	public void removerTurma(int idTurma) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		turmaControlador.removerTurma(idTurma);
	}

	@Override
	public Turma buscarTurma(int idTurma) throws ExceptionElementoInvalido {
		// TODO Auto-generated method stub
		return turmaControlador.buscarTurma(idTurma);
	}

	@Override
	public List<Turma> listarTurma() {
		// TODO Auto-generated method stub
		return turmaControlador.listarTurma();
	}

	@Override
	public List<Turma> listarTurmasProfessor(int idProfessor) {
		// TODO Auto-generated method stub
		return turmaControlador.listarTurmasProfessor(idProfessor);
	}

}
