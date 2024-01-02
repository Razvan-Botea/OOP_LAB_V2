import java.awt.Color;

public class Masina {
	private String marca;
	private Color culoare;
	
	public Masina(String m, Color c) {
		this.marca = m;
		this.culoare = c;
	}
	
	public void revopsire(Color c) {
		culoare = c;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public Color getCuloare() {
		return culoare;
	}
	
	public Masina clone() {
		try {
			return (Masina) super.clone();
			}
			catch(Exception e) {
				System.out.println("NOT CLONABLE");
				return null;
			}
	}
	
	public String toString() {
		return marca + " are culoarea " + culoare;
	}
}
