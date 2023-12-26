public class Rezervor {
	private int maxCapacitate;
	private double nivelCurent;
	
	public Rezervor(int max, double nivel) {
		this.maxCapacitate = max;
		this.nivelCurent = nivel;
	}
	
	public void umpleRezervor(double c) {
		nivelCurent += c;
		if(nivelCurent > maxCapacitate) {
			System.out.println("Rezervorul este plin.");
			nivelCurent = maxCapacitate;
		}
	}
	
	public void golesteRezervor(double c) {
		nivelCurent -= c;
		if(nivelCurent < 0) {
			System.out.println("Rezervorul este gol");
			nivelCurent = 0;
		}
	}
	
	public double getNivel() {
		return nivelCurent;
	}
	
}
