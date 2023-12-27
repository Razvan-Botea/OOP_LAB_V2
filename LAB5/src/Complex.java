public class Complex {
	private int parteRe;
	private int parteIm;
	
	public Complex(int re, int im) {
		this.parteRe = re;
		this.parteIm = im;
	}
	
	public Complex adunare(Complex x) {
		Complex rez = new Complex(0, 0);
		rez.parteIm = parteIm + x.parteIm;
		rez.parteRe = parteRe + x.parteRe;
		return rez;
	}
	
	public Complex scadere(Complex x) {
		Complex rez = new Complex(0, 0);
		rez.parteIm = parteIm - x.parteIm;
		rez.parteRe = parteRe - x.parteRe;
		return rez;
	}
	
	public Complex inmultireScalar(int x) {
		Complex rez = new Complex(0, 0);
		rez.parteIm = parteIm * x;
		rez.parteRe = parteRe * x;
		return rez;
	}
	
	public Complex inmultire(Complex x) {
		Complex rez = new Complex(0, 0);
		rez.parteIm = parteRe * x.parteIm + parteIm * x.parteRe;
		rez.parteRe = parteRe * x.parteRe - parteIm * x.parteIm;
		return rez;
	}
	
	public String toString() {
		return parteRe + " + " + parteIm + "j";
	}
}
