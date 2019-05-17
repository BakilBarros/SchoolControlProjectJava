package negocio;

import java.util.Date;

public class Professor {

	private int idProfessor;
	private String nomeProfessor;
	private String cargoProfessor;
	private String loginProfessor;
	private String senhaProfessor;
	private Date dataNascimentoProfessor;

	public Professor(int idProfessor, String nomeProfessor, String cargoProfessor, String loginProfessor,
			String senhaProfessor, Date dataNascimentoProfessor) {
		this.idProfessor = idProfessor;
		this.nomeProfessor = nomeProfessor;
		this.cargoProfessor = cargoProfessor;
		this.loginProfessor = loginProfessor;
		this.senhaProfessor = senhaProfessor;
		this.dataNascimentoProfessor = dataNascimentoProfessor;
	}

	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	public String getNomeProfessor() {
		return nomeProfessor;
	}

	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}

	public String getCargoProfessor() {
		return cargoProfessor;
	}

	public void setCargoProfessor(String cargoProfessor) {
		this.cargoProfessor = cargoProfessor;
	}

	public String getLoginProfessor() {
		return loginProfessor;
	}

	public void setLoginProfessor(String loginProfessor) {
		this.loginProfessor = loginProfessor;
	}

	public String getSenhaProfessor() {
		return senhaProfessor;
	}

	public void setSenhaProfessor(String senhaProfessor) {
		this.senhaProfessor = senhaProfessor;
	}

	public Date getDataNascimentoProfessor() {
		return dataNascimentoProfessor;
	}

	public void setDataNascimentoProfessor(Date dataNascimentoProfessor) {
		this.dataNascimentoProfessor = dataNascimentoProfessor;
	}

	@Override
	public String toString() {
		return "Professor [idProfessor=" + idProfessor + ", nomeProfessor=" + nomeProfessor + ", cargoProfessor="
				+ cargoProfessor + ", loginProfessor=" + loginProfessor + ", senhaProfessor=" + senhaProfessor
				+ ", dataNascimentoProfessor=" + dataNascimentoProfessor + "]";
	}

}
