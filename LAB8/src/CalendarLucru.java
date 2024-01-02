
public class CalendarLucru {
	private Zi[] saptamana;
	
	public CalendarLucru() {
		saptamana = new Zi[7];
		saptamana[0] = new Zi("Luni", true);
		saptamana[1] = new Zi("Marti", true);
		saptamana[2] = new Zi("Miercuri", true);
		saptamana[3] = new Zi("Joi", true);
		saptamana[4] = new Zi("Vineri", true);
		saptamana[5] = new Zi("Sambata", false);
		saptamana[6] = new Zi("Duminica", false);
	}
	
	public void setLucratoare(Boolean b, int i) {
		saptamana[i].setLucratoare(b);
	}
	
	public boolean getLucratoare(int i) {
		return saptamana[i].esteLucratoare();
	}
	
	public String getZi(int i) {
		return saptamana[i].getNume();
	}
}
