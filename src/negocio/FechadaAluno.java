package negocio;

import java.util.List;

public class FechadaAluno implements IFechadaAluno {

	private AlunoControlador alunoControlador;
        private static FechadaAluno instancia;

	public FechadaAluno() {
		alunoControlador = new AlunoControlador();
	}
        
        
        public static FechadaAluno getInstancia(){
         
            if (instancia == null) {
                instancia = new FechadaAluno();
            }         
            return instancia;     
        }

	@Override
	public Aluno logar(String login, String senha) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
		return alunoControlador.logar(login, senha);
	}

	@Override
	public void inserirAluno(Aluno aluno) throws ExceptionElementoExiste{
		// TODO Auto-generated method stub
		alunoControlador.inserirAluno(aluno);
	}

	@Override
	public Aluno exibirAluno(int matricula) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
		alunoControlador.exibirAluno(matricula);
		return null;
	}

	@Override
	public void removerAluno(int idTurma) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
		alunoControlador.removerAluno(idTurma);

	}

	@Override
	public Aluno buscarAluno(int matricula) throws ExceptionElementoInvalido{
		// TODO Auto-generated method stub
		return alunoControlador.buscarAluno(matricula);
	}

	@Override
	public List<Aluno> listarAluno() { 
		// TODO Auto-generated method stub
		return alunoControlador.listarAluno();
	}

}
