package ui;

import java.util.Date;

import negocio.Aluno;
import negocio.Disciplina;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Disciplina disc = new Disciplina(1, "Português", "Importância, contribuições e fatores relevantes do processo de construção do saberes.");
		Disciplina disc1 = new Disciplina(2, "Matemática", "Importância, contribuições e fatores relevantes do processo de construção do saberes.");
		Disciplina disc2 = new Disciplina(3, "Química", "Importância, contribuições e fatores relevantes do processo de construção do saberes.");

		Professor prof = new Professor(1, "Calos Maia", "Professor", "1", "1", new Date(13, 10, 1996));
		Professor prof2 = new Professor(2, "João Marcelo", "Professor", "1234", "Joao2019", new Date(18, 12, 1986));

		Turma Tur = new Turma(1, disc, prof2, 20);
		Turma Tur2 = new Turma(2, disc1, prof, 20);
		Turma Tur3 = new Turma(3, disc, prof, 20);
		Turma Tur4 = new Turma(4, disc1, prof, 20);
		Turma Tur5 = new Turma(5, disc2, prof, 20);
		Turma Tur6 = new Turma(6, disc, prof, 20);
		Turma Tur7 = new Turma(7, disc1, prof, 20);

		Aluno alu = new Aluno(1, "Thiago", new Date(12, 10, 2000), 1, "1", "1");
		Aluno alu2 = new Aluno(2, "Juliana", new Date(16, 11, 2000), 1, "2", "2");

		String[] t = { "1", "2", "3", "4" };
		Double[] n = { 0.1, 0.2, 0.3, 0.4 };
		RendimentoEscolar renEsc = new RendimentoEscolar(Tur, alu, 0.0, 0.0, t, n);
		RendimentoEscolar renEsc2 = new RendimentoEscolar(Tur, alu2, 0.0, 0.0, t, n);

		
		// Teste turma
		trm.inserirTurma(Tur);
		trm.inserirTurma(Tur2);
		trm.inserirTurma(Tur3);
		trm.inserirTurma(Tur4);

		// Teste professor
		iprof.inserirProfessor(prof);
		iprof.inserirProfessor(prof2);
//		System.out.println(iprof.logar("1", "1"));
//		System.out.println(iprof.buscarProfessor(2));
		System.out.println(trm.listarTurmasProfessor(1));
		System.out.println();
		
		
		// Teste aluno
		alun.inserirAluno(alu);
		alun.inserirAluno(alu2);

//		 System.out.println(alun.buscarAluno(2));
//		 System.out.println(alun.listarAluno());
//		 System.out.println(alun.logar("2", "2"));

		// Teste Disciplina
		ds.inserirDisciplina(disc);
		ds.inserirDisciplina(disc1);
		ds.inserirDisciplina(disc2);

//		System.out.println(ds.buscarDisciplina(1));
//		System.out.println(ds.listarDisciplina());
		
		
		
		
		
		// Teste Rendimento escolar
		rd.atribuir(renEsc);
		rd.atribuir(renEsc2);
		
		
	
		
		
		
		
		
	}

}
