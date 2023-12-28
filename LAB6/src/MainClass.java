
public class MainClass {

	public static void main(String[] args) {
		Ghiozdan g = new Ghiozdan(6);
		
		Caiet c1 = new Caiet();
		c1.eticheta = "numarul 1";
		
		Caiet c2 = new Caiet();
		c2.eticheta = "numarul 2";
		
		Caiet c3 = new Caiet();
		c3.eticheta = "numarul 3";
		
		Manual m1 = new Manual();
		m1.eticheta = "numarul 1";
		
		Manual m2 = new Manual();
		m2.eticheta = "numarul 2";
		
		Manual m3 = new Manual();
		m3.eticheta = "numarul 3";
		
		g.addCaiet(c1);
		g.addCaiet(c3);
		g.addManual(m2);
		g.addManual(m1);
		g.addCaiet(c2);
		g.addManual(m3);
		
		g.getNrRechizite();
		g.getNrCaiete();
		g.getNrManuale();
	}

}
