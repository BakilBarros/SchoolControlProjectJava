package negocio;

import java.util.Arrays;

public class RendimentoEscolar {

	private Turma turmaRedimentoEscolar;
	private Aluno alunoRedimentoEscolar;
	private Double nota1RedimentoEscolar;
	private Double nota2RedimentoEscolar;
	private String[] trabalhosRendimentoEscolar = new String[3];
	private Double[] notasDostrabalhosRendimentoEscolar = new Double[3];
	private Double mediaAluno;
	
	public RendimentoEscolar() {
		
	}

	public RendimentoEscolar(Turma turmaRedimentoEscolar, Aluno alunoRedimentoEscolar, Double nota1RedimentoEscolar,
			Double nota2RedimentoEscolar, String[] trabalhosRendimentoEscolar,
			Double[] notasDostrabalhosRendimentoEscolar, Double mediaAluno) {
		this.turmaRedimentoEscolar = turmaRedimentoEscolar;
		this.alunoRedimentoEscolar = alunoRedimentoEscolar;
		this.nota1RedimentoEscolar = nota1RedimentoEscolar;
		this.nota2RedimentoEscolar = nota2RedimentoEscolar;
		this.trabalhosRendimentoEscolar = trabalhosRendimentoEscolar;
		this.notasDostrabalhosRendimentoEscolar = notasDostrabalhosRendimentoEscolar;
		this.mediaAluno = 0.0;
	}
	
	public RendimentoEscolar(Turma turmaRedimentoEscolar, Aluno alunoRedimentoEscolar, Double nota1RedimentoEscolar,
			Double nota2RedimentoEscolar, String[] trabalhosRendimentoEscolar,
			Double[] notasDostrabalhosRendimentoEscolar) {
		this.turmaRedimentoEscolar = turmaRedimentoEscolar;
		this.alunoRedimentoEscolar = alunoRedimentoEscolar;
		this.nota1RedimentoEscolar = nota1RedimentoEscolar;
		this.nota2RedimentoEscolar = nota2RedimentoEscolar;
		this.trabalhosRendimentoEscolar = trabalhosRendimentoEscolar;
		this.notasDostrabalhosRendimentoEscolar = notasDostrabalhosRendimentoEscolar;
		
	}
	
	

	public Turma getTurmaRedimentoEscolar() {
		return turmaRedimentoEscolar;
	}

	public void setTurmaRedimentoEscolar(Turma turmaRedimentoEscolar) {
		this.turmaRedimentoEscolar = turmaRedimentoEscolar;
	}

	public Aluno getAlunoRedimentoEscolar() {
		return alunoRedimentoEscolar;
	}

	public void setAlunoRedimentoEscolar(Aluno alunoRedimentoEscolar) {
		this.alunoRedimentoEscolar = alunoRedimentoEscolar;
	}

	public Double getNota1RedimentoEscolar() {
		return nota1RedimentoEscolar;
	}

	public void setNota1RedimentoEscolar(Double nota1RedimentoEscolar) {
		this.nota1RedimentoEscolar = nota1RedimentoEscolar;
	}

	public Double getNota2RedimentoEscolar() {
		return nota2RedimentoEscolar;
	}

	public void setNota2RedimentoEscolar(Double nota2RedimentoEscolar) {
		this.nota2RedimentoEscolar = nota2RedimentoEscolar;
	}

	public String[] getTrabalhosRendimentoEscolar() {
		return trabalhosRendimentoEscolar;
	}

	public void setTrabalhosRendimentoEscolar(String[] trabalhosRendimentoEscolar) {
		this.trabalhosRendimentoEscolar = trabalhosRendimentoEscolar;
	}

	public Double[] getNotasDostrabalhosRendimentoEscolar() {
		return notasDostrabalhosRendimentoEscolar;
	}

	public void setNotasDostrabalhosRendimentoEscolar(Double[] notasDostrabalhosRendimentoEscolar) {
		this.notasDostrabalhosRendimentoEscolar = notasDostrabalhosRendimentoEscolar;
	}

	public Double getMediaAluno() {
		Double v0, v1;
		v0 = (notasDostrabalhosRendimentoEscolar[0]+notasDostrabalhosRendimentoEscolar[1])/2;
		v1 = (notasDostrabalhosRendimentoEscolar[2]+notasDostrabalhosRendimentoEscolar[3])/2;
		v0 = (v0*10)/100;
		v1 = (v1*10)/100;
		mediaAluno = ((this.nota1RedimentoEscolar+v0)+(this.nota2RedimentoEscolar+v1))/2;
		return mediaAluno;
	}

	public void setMediaAluno(Double mediaAluno) {
		this.mediaAluno = mediaAluno;
	}

	@Override
	public String toString() {
		return "RendimentoEscolar [turmaRedimentoEscolar=" + turmaRedimentoEscolar + ", alunoRedimentoEscolar="
				+ alunoRedimentoEscolar + ", nota1RedimentoEscolar=" + nota1RedimentoEscolar
				+ ", nota2RedimentoEscolar=" + nota2RedimentoEscolar + ", trabalhosRendimentoEscolar="
				+ Arrays.toString(trabalhosRendimentoEscolar) + ", notasDostrabalhosRendimentoEscolar="
				+ Arrays.toString(notasDostrabalhosRendimentoEscolar) + ", mediaAluno=" + mediaAluno + "]\n";
	}
	
	
	
}
