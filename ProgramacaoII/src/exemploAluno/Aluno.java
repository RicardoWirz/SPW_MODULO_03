package exemploAluno;

public class Aluno extends Pessoa{
	private String matricula;
	
	public Aluno (String nome, String cpf, int idade, String matricula) {
		super(nome, cpf, idade);		
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	
}
