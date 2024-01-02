
public class Complex implements Numeric{
	private int parteRe;
	private int parteIm;
	
	public Complex(int re, int im) {
		this.parteRe = re;
		this.parteIm = im;
	}
	
	public Complex inmultire(Numeric n) {
		Complex c = (Complex) n;
		Complex rez = new Complex(0, 0);
		rez.parteIm = parteRe * c.parteIm + parteIm * c.parteRe;
		rez.parteRe = parteRe * c.parteRe - parteIm * c.parteIm;
		return rez;
	}
	
	public Complex adunare(Numeric n) {
		Complex c = (Complex) n;
		Complex rez = new Complex(0, 0);
		rez.parteIm = parteIm + c.parteIm;
		rez.parteRe  =parteRe + c.parteRe;
		return rez;
	}
	
	public Complex scadere(Numeric n) {
		Complex c = (Complex) n;
		Complex rez = new Complex(0, 0);
		rez.parteIm = parteIm - c.parteIm;
		rez.parteRe = parteRe - c.parteRe;
		return rez;
	}
	
	public String toString() {
		return parteRe + " + " + parteIm + "j";
	}
}
