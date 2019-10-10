package exemploAluno;

public class Professor extends Pessoa{
	private double salario;
	
	public Professor(String nome, String cpf, int idade) {
		super(nome, cpf, idade);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
