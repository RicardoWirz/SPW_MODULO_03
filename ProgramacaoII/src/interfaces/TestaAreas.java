package interfaces;

public class TestaAreas {
	
	public static void main(String[] args) {
		
		AreaCalculavel quadrado = new Quadrado(7);
		System.out.println("Area Total:" + quadrado.calculaArea());
		AreaCalculavel retangulo = new Retangulo(7,10);
		System.out.println("Area Total:" + retangulo.calculaArea());
		AreaCalculavel triangulo = new Triangulo(7,10);
		System.out.println("Area Total:" + triangulo.calculaArea());
		
	}

}
