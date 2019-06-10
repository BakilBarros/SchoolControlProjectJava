package negocio;

import java.util.Date;

public class Aluno {

	private int matricula;
	private String nomeAluno;
	private Date dataNascimentoAluno;
	private int periodoAluno;
	private String loginAluno;
	private String senhaAluno;

	public Aluno() {

	}

	public Aluno(int matricula, String nomeAluno, Date dataNascimentoAluno, int periodoAluno, String loginAluno,
			String senhaAluno) {
		this.matricula = matricula;
		this.nomeAluno = nomeAluno;
		this.dataNascimentoAluno = dataNascimentoAluno;
		this.periodoAluno = periodoAluno;
		this.loginAluno = loginAluno;
		this.senhaAluno = senhaAluno;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public Date getDataNascimentoAluno() {
		return dataNascimentoAluno;
	}

	public void setDataNascimentoAluno(Date dataNascimentoAluno) {
		this.dataNascimentoAluno = dataNascimentoAluno;
	}

	public int getPeriodoAluno() {
		return periodoAluno;
	}

	public void setPeriodoAluno(int periodoAluno) {
		this.periodoAluno = periodoAluno;
	}

	public String getLoginAluno() {
		return loginAluno;
	}

	public void setLoginAluno(String loginAluno) {
		this.loginAluno = loginAluno;
	}

	public String getSenhaAluno() {
		return senhaAluno;
	}

	public void setSenhaAluno(String senhaAluno) {
		this.senhaAluno = senhaAluno;
	}

	@Override
	public String toString() {
		return "Aluno [Matricula: " + matricula + ", Nome Aluno: " + nomeAluno + ", Período:" + periodoAluno + ", Login: " + loginAluno
				+ ", Senha: " + senhaAluno + "]";
	}
        
        
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula != other.matricula)
			return false;
		return true;
	}

}
