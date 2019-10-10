package heranca;

public class TestaConta {

	public static void main(String[] args) {
		Conta c = new Conta("111-2", 90);
		//Conta p = new Poupanca("6666-1, 50);
		Conta cb = new ContaBonificada("4444-2", 80);
		
		c.creditar(30);
		//c.debitar(20);
		//((Poupanca) c).renderJuros(0.5);
		cb.creditar(50);
				
		((ContaBonificada) cb).renderBonus();

		System.out.println("Saldo conta Comun: "+ c.getSaldo());
		System.out.println("Saldo Conta Bonificada: " + cb.getSaldo());
		
	}

}
