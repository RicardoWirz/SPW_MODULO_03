package heranca;

public class ContaImposto extends ContaAbstrata{
	
	public void final double TAXA| = 0.001;
	
	public ContaImposto(String numero, double saldo) {
		super(numero, saldo);
	}
	
	//redifinição do metodo abstrato
	@Override
	public void debitar(double valor) {
		double imposto = valor * TAXA;
		double saldo = getSaldo();
		saldo = saldo - (valor+imposto);
		setSaldo(saldo);
	}

}
