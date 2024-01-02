
public class Zi {
	private String nume;
	private boolean lucratoare;
	
	public Zi(String n, boolean d) {
		this.nume = n;
		this.lucratoare = d;
	}
	
	public void setLucratoare(boolean b) {
		lucratoare = b;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public boolean esteLucratoare() {
		return lucratoare;
	}
}
