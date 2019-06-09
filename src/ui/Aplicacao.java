package ui;

import java.util.Date;

import negocio.Aluno;
import negocio.Disciplina;
import negocio.ExceptionElementoExiste;
import negocio.ExceptionElementoInvalido;
import negocio.FechadaAluno;
import negocio.FechadaDisciplina;
import negocio.FechadaProfessor;
import negocio.FechadaRendimentoEscolar;
import negocio.FechadaTurma;
import negocio.IFechadaAluno;
import negocio.IFechadaDisciplina;
import negocio.IFechadaProfessor;
import negocio.IFechadaRendimentoEscolar;
import negocio.IFechadaTurma;
import negocio.Professor;
import negocio.RendimentoEscolar;
import negocio.Turma;

public class Aplicacao {

	private static IFechadaAluno alun = new FechadaAluno();
	private static IFechadaTurma trm = new FechadaTurma();
	private static IFechadaDisciplina ds = new FechadaDisciplina();
	private static IFechadaRendimentoEscolar rd = new FechadaRendimentoEscolar();
	private static IFechadaProfessor iprof = new FechadaProfessor();

	public static void main(String[] args) throws ExceptionElementoExiste {
		// TODO Auto-generated method stub

		Disciplina disc = new Disciplina(1, "Portugu�s",
				"Import�ncia, contribui��es e fatores relevantes do processo de constru��o do saberes.");
		Disciplina disc1 = new Disciplina(2, "Matem�tica",
				"Import�ncia, contribui��es e fatores relevantes do processo de constru��o do saberes.");
		Disciplina disc2 = new Disciplina(3, "Qu�mica",
				"Import�ncia, contribui��es e fatores relevantes do processo de constru��o do saberes.");
		Disciplina disc3 = new Disciplina(4, "Qu�mica",
				"Import�ncia, contribui��es e fatores relevantes do processo de constru��o do saberes.");

		Professor prof = new Professor(1, "Calos Maia", "Professor", "1", "1", new Date(13, 10, 1996));
		Professor prof2 = new Professor(2, "Jo�o Marcelo", "Professor", "1234", "Joao2019", new Date(18, 12, 1986));

		Turma Tur = new Turma(1,disc, prof,  20);
		Turma Tur2 = new Turma(2, 20);
		Turma Tur3 = new Turma(3, 20);
		Turma Tur4 = new Turma(4,  20);
		Turma Tur5 = new Turma(5, 20);
		Turma Tur6 = new Turma(6,  20);
		Turma Tur7 = new Turma(7, 20);

		Aluno alu = new Aluno(1, "Thiago", new Date(12, 10, 2000), 1, "1", "1");
		Aluno alu2 = new Aluno(2, "Juliana", new Date(16, 11, 2000), 1, "2", "2");

		String[] t = { "1", "2", "3", "4" };
		Double[] n = { 10.0, 10.0, 10.0, 10.0 };
		RendimentoEscolar renEsc = new RendimentoEscolar(Tur, alu, 8.0, 8.0, t, n);
		RendimentoEscolar renEsc2 = new RendimentoEscolar(Tur, alu2, 5.0, 5.0, t, n);

            
                // Teste turma
                 trm.inserirTurma(Tur);
                 trm.inserirTurma(Tur2);
                 trm.inserirTurma(Tur3);
                 trm.inserirTurma(Tur4);
                 trm.inserirTurma(Tur5);
                 trm.inserirTurma(Tur6);
                
                // Teste Disciplina
                // ds.inserirDisciplina(disc);
                // ds.inserirDisciplina(disc1);
                // ds.inserirDisciplina(disc2);
                
                // System.out.println(ds.buscarDisciplina(1));
                // System.out.println(ds.listarDisciplina());
                
                // Teste Rendimento escolar
                 rd.atribuir(renEsc);
                
                // Teste professor
               
                try {
                iprof.inserirProfessor(prof);
            } catch (ExceptionElementoExiste ex) {
                System.out.println(ex.getMessage());
            }
            try {
                iprof.logar("1", "1");
                   } catch (ExceptionElementoInvalido ex) {
                System.out.println(ex.getMessage());
            }
                
                
                
                // System.out.println(iprof.buscarProfessor(2));
                // System.out.println(trm.listarTurma());
                // System.out.println(trm.buscarTurma(1));
                // System.out.println(trm.listarTurmasProfessor(1));
                // System.out.println(rd.exibirRendimentoEscolar());
                // System.out.println(rd.exibirMedias());
                // System.out.println(rd.calculoPorcentagem());
                // System.out.println(trm.exibirTurmasDisponiveisProfessor(1));
                
                // Teste aluno
                 alun.inserirAluno(alu);
                 alun.inserirAluno(alu2);
                
            try {
                //  try {
                // System.out.println(alun.buscarAluno(2));
                // System.out.println(alun.listarAluno());
                // System.out.println(alun.logar("2", "2"));
                // System.out.println(rd.listarTurmasAluno(2));
                // System.out.println(rd.exibirRendimentoEscolarDoAluno(2));
                 System.out.println(rd.listarTurmasDisponiveisAluno(2));
                
                // Teste Administrador
                
                // ds.inserirDisciplina(disc3);
                // ds.removerDisciplina(1);
                // System.out.println(ds.buscarDisciplina(4));
                // System.out.println(ds.listarDisciplina());
                
                // trm.inserirTurma(Tur7);
                // trm.removerTurma(1);
                // System.out.println(trm.buscarTurma(7));
                // System.out.println(trm.listarTurma());
                
                // rd.atribuir(renEsc2);
                // iprof.removerProfessor(1);
                //  System.out.println(iprof.buscarProfessor(1));
                // } catch (ExceptionElementoInvalido ex) {
                //     Logger.getLogger(Aplicacao.class.getName()).log(Level.SEVERE, null, ex);
                //  }
                //  System.out.println(iprof.listarProfessor());
                
                // alun.inserirAluno(alu2);
                // alun.removerAluno(2);
                // System.out.println(alun.buscarAluno(2));
                // System.out.println(alun.listarAluno());
                trm.alterarTurma(3, disc, prof);
            } catch (ExceptionElementoInvalido ex) {
           System.out.println(ex.getMessage());
            }
                 
            try {
              System.out.println(trm.buscarTurma(3));
            } catch (ExceptionElementoInvalido ex) {
                 System.out.println(ex.getMessage());
            }
         

	}

}
