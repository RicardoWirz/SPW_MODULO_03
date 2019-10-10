package asbtracao;

public class ContaPoupanca extends Conta{
	
	
	@Override
	public void imprimeExtrato() {
		System.out.println("Extrato de Conta");
		
		System.out.println("Saldo: "+ this.getSaldo());
	}

}
