package sobrecarga;

public class TesteCalculo {

	public static void main(String[] args) {
		Calculo c = new Calculo();
		
		System.out.println("Soma 3 inteiros: " + c.soma(3, 5, 7));
		System.out.println("Soma float: " + c.soma(4.5f, 5.8f));
		System.out.println("Soma 2 inteiros: " + c.soma(7, 9));	
	}

}
