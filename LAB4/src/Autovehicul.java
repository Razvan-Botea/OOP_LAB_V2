import java.awt.Color;

public class Autovehicul {
	private String marca;
	private Color culoare;
	private double cViteza;
	private int cTreapta;
	private int maxVit;
	private int nrTrepte;
	
	private Sofer sofer;
	private Rezervor rezervor;
	
	public Autovehicul() {
		
	}
	
	public Autovehicul(String m, Color c, int maxV, int nrT, Sofer s, Rezervor r) {
		this.marca = m;
		this.culoare = c;
		this.cViteza = 0;
		this.cTreapta = 0;
		this.maxVit = maxV;
		this.nrTrepte = nrT;
		
		this.sofer = s;
		this.rezervor = r;
	}
	
	public void accelerare(double a) {
		cViteza += a;
		if(cViteza > maxVit) {
			System.out.println("Ati atins viteza maxima.");
			cViteza = maxVit;
		}
	}
	
	public void franare(double f) {
		cViteza -= f;
		if(cViteza < 0) {
			System.out.println("Autoturismul este oprit.");
			cViteza = 0;
		}
	}
	
	public void cresteTreapta() {
		cTreapta++;
		if(cTreapta > nrTrepte) {
			System.out.println("Ati atins ultima treapta de viteza.");
			cTreapta = nrTrepte;
		}
	}
	
	public void cresteTreapta(int c) {
		cTreapta += c;
		if(cTreapta > nrTrepte) {
			System.out.println("Ati atins ultima treapta de viteza.");
			cTreapta = nrTrepte;
		}
	}
	
	public void scadeTrepte() {
		cTreapta--;
		if(cTreapta < 0) {
			System.out.println("Autoturismul este scos din viteza.");
			cTreapta = 0;
		}
	}
	
	public void oprire() {
		cTreapta = 0;
		cViteza = 0;
		System.out.println("Autoturismul a fost oprit.");
	}
	
	public String numeSofer() {
		return sofer.getNume();
	}
	
	public String prenumeSofer() {
		return sofer.getPrenume();
	}
	
	public double nivelComb() {
		return rezervor.getNivel();
	}
	
	public String toString() {
		return marca + "-ul " + " condus de " + numeSofer()  + " " + prenumeSofer() + " se afla in treapta " + cTreapta + " ,se deplaseaza cu " + cViteza + " km/h si are " + nivelComb() + " litrii de combusitbil in rezervor.";
	}
}
