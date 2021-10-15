package milanddois;

public class Circulo {

	private double raio;
	
	public Circulo(double raio) {
		this.raio=raio;
	
	}
	
	public void setRaio(double r) {
		this.raio=r;
	}
	public double getRaio() {
		return this.raio;
		
	}
	public double getArea() {
		double pi=3.14159;
		return pi*Math.pow(raio, 2.0);
	}
	
}
