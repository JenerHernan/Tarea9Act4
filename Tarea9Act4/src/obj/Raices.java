package obj;

public class Raices {
	private double a;
	private double b;
	private double c;
	
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void obtenerRaices() {
		double determinante = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		
		System.out.println("Las raices con " + ((-b + determinante) / (2 * a)) + " y " +  ((-b - determinante) / (2 * a)));
	}
	
	public void obtenerRaiz() {
		System.out.println("La raiz es " + (-b/(2 * a)));
	}
	
	
	public double getDeterminante() {
		return Math.sqrt(Math.pow(b, 2) - 4 * a * c);
	}
	
	public boolean tieneRaices() {
		return this.getDeterminante() >= 0;
	}
	
	public boolean tieneRaiz() {
		return this.getDeterminante() == 0;
	}
	
	public void calcular() {
		if(this.tieneRaices())
			if(this.tieneRaiz())
				this.obtenerRaiz();
			else
				this.obtenerRaices();
		else
			System.out.println("Esta ecuacion no tiene solucion");
	}
	
}
