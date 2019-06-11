package negocio;

public class Turma {

	private int idTurma;
	private Disciplina disciplinaTurma;
	private Professor professorTurma;
	private int capacidadeTurma;
	
	public Turma() {
		
	}

	public Turma(int idTurma, Disciplina disciplinaTurma, Professor professorTurma, int capacidadeTurma) {
		this.idTurma = idTurma;
		this.disciplinaTurma = null;
		this.professorTurma = null;
		this.capacidadeTurma = capacidadeTurma;
	}
        
       public Turma(int idTurma, Professor professorTurma, int capacidadeTurma) {
		this.idTurma = idTurma;
		this.professorTurma = null;
		this.capacidadeTurma = capacidadeTurma;
	}     
	
	public Turma(int idTurma, int capacidadeTurma) {
		this.idTurma = idTurma;
		this.capacidadeTurma = capacidadeTurma;
	}

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

	public Disciplina getDisciplinaTurma() {
		return disciplinaTurma;
	}

	public void setDisciplinaTurma(Disciplina disciplinaTurma) {
		this.disciplinaTurma = disciplinaTurma;
	}

	public Professor getProfessorTurma() {
		return professorTurma;
	}

	public void setProfessorTurma(Professor professorTurma) {
		this.professorTurma = professorTurma;
	}

	public int getCapacidadeTurma() {
		return capacidadeTurma;
	}

	public void setCapacidadeTurma(int capacidadeTurma) {
		this.capacidadeTurma = capacidadeTurma;
	}

	@Override
	public String toString() {
		return "Turma [idTurma: " + idTurma + ", disciplinaTurma: " + disciplinaTurma + ", professorTurma: "
				+ professorTurma + ", capacidadeTurma: " + capacidadeTurma + "]\r\n";
	}

        
        
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idTurma;
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
		Turma other = (Turma) obj;
		if (idTurma != other.idTurma)
			return false;
		return true;
	}

    public Object getTurmaRedimentoEscolar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}