package negocio;

import java.util.Date;

public class Professor {

	private int idProfessor;
	private String nomeProfessor;
	private String cargoProfessor;
	private String loginProfessor;
	private String senhaProfessor;
	private Date dataNascimentoProfessor;
	
	

	public Professor() {
	
	}

	public Professor(int idProfessor, String nomeProfessor, String cargoProfessor, String loginProfessor,
			String senhaProfessor, Date dataNascimentoProfessor) {
		this.idProfessor = idProfessor;
		this.nomeProfessor = nomeProfessor;
		this.cargoProfessor = cargoProfessor;
		this.loginProfessor = loginProfessor;
		this.senhaProfessor = senhaProfessor;
		this.dataNascimentoProfessor = dataNascimentoProfessor;
	}
        
        public Professor(String nomeProfessor, String cargoProfessor, String loginProfessor,
			String senhaProfessor, Date dataNascimentoProfessor) {
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
		return "Professor [idProfessor:" + idProfessor + ", Nome Professor: " + nomeProfessor + ", Cargo Professor: "
				+ cargoProfessor + ", Login: " + loginProfessor + ", Senha: " + senhaProfessor + "]";
	}
        
        	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProfessor;
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
		Professor other = (Professor) obj;
		if (idProfessor != other.idProfessor)
			return false;
		return true;
	}
	

}
