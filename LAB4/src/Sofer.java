public class Sofer {
	private String nume;
	private String prenume;
	private int varsta;
	private int nrPermis;
	
	public Sofer(String n, String p, int v, int nr) {
		this.nume = n;
		this.prenume = p;
		this.varsta = v;
		this.nrPermis = nr;
	}
	
	public String getNume() {
		return nume;
	}
	
	public String getPrenume() {
		return prenume;
	}
}
