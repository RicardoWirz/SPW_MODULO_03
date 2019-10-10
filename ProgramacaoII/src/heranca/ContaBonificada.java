package heranca;

public class ContaBonificada extends Conta{
	private double bonus;
	
	public ContaBonificada(String numero, double saldo) {
		super(numero, saldo);
	} 
	
	public double getBonus() {
		return this.bonus;
	}
	
	public void renderBonus() {
		super.creditar(this.bonus);
		this.bonus=0;
	}
	
	public void creditar(double valor) {
		this.bonus = this.bonus + (valor*0.5);
		super.creditar(valor);
	}
}
