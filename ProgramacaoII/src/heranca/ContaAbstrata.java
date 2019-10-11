package heranca;

public class ContaAbstrata {
	
	private String numero;
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
		public void creditar(double valor) {
			this.saldo = valor;
	}
		
	@Override
	public String toString() {
		return "Conta [Numero = "+ numero + " Saldo = " + saldo + "]\n";
	}
	public abstract void debitar(double valor);
}
