package asbtracao;

public class Principal {
 	
	public static void main(String[] args) {
		Conta c = new ContaPoupanca();
		c.setSaldo(2345);
		c.imprimeExtrato();
 	}
}
