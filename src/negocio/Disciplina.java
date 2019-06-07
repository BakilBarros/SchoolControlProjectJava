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
		return "Disciplina [idDisciplina: " + idDisciplina + ", nomeDisciplina: " + nomeDisciplina + ", ementaDisciplina :"
				+ ementaDisciplina + "]\r\n";
	}

}
