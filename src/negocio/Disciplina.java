package negocio;

public class Disciplina {

	private int idDisciplina;
	private String nomeDisciplina;
	private String ementaDisciplina;

	public Disciplina() {

	}

	public Disciplina(int idDisciplina, String nomeDisciplina, String ementaDisciplina) {
		this.idDisciplina = idDisciplina;
		this.nomeDisciplina = nomeDisciplina;
		this.ementaDisciplina = ementaDisciplina;
        }

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}

	public String getEmentaDisciplina() {
		return ementaDisciplina;
	}

	public void setEmentaDisciplina(String ementaDisciplina) {
		this.ementaDisciplina = ementaDisciplina;
	}

	@Override
	public String toString() {
		return "Disciplina [idDisciplina: " + idDisciplina + ", Nome Disciplina: " + nomeDisciplina + ", Ementa Disciplina :"
				+ ementaDisciplina + "]\r\n";
	}
        
        
        	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idDisciplina;
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
		Disciplina other = (Disciplina) obj;
		if (idDisciplina != other.idDisciplina)
			return false;
		return true;
	}

}
