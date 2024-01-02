
public class Fractie implements Numeric {
	private int numarator;
	private int numitor;
	
	public Fractie(int numa, int numi) {
		this.numarator = numa;
		this.numitor = numi;
	}
	
	public Fractie inmultire(Numeric n) {
		Fractie f = (Fractie) n;
		Fractie rez = new Fractie(0, 0);
		rez.numarator = numarator * f.numarator;
		rez.numitor = numitor * f.numitor;
		return rez;
	}
	
	public Fractie adunare(Numeric n) {
		Fractie f = (Fractie) n;
		Fractie rez = new Fractie(0, 0);
		if(numitor == f.numitor) {
			rez.numitor = numitor;
			rez.numarator = numarator + f.numarator;
		}
		else {
			rez.numitor = f.numitor * numitor;
			rez.numarator = numarator * f.numitor + f.numarator * numitor;
		}
		return rez;
	}
	
	public Fractie scadere(Numeric n) {
		Fractie f = (Fractie) n;
		Fractie rez = new Fractie(0, 0);
		if(numitor == f.numitor) {
			rez.numitor = numitor;
			rez.numarator = numarator - f.numarator;
		}
		else {
			rez.numitor = f.numitor * numitor;
			rez.numarator = numarator * f.numitor - f.numarator * numitor;
		}
		return rez;
	}
	public String toString() {
		return numarator + "/" + numitor;
	}
}
