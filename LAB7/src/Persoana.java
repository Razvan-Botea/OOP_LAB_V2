
public class Persoana implements Comparable{
	private String nume;
	private String prenume;
	private int varsta;
	
	public Persoana(String n, String p, int v) {
		this.nume = n;
		this.prenume = p;
		this.varsta = v;
	}
	
	public int compareTo(Object o) {
		Persoana pers = (Persoana) o;
		int rez = nume.compareTo(pers.nume);
		return rez;
	}
	
	public String toString() {
		return nume + " " + prenume + " are " + varsta + " ani.";
	}
}
