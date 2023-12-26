import java.awt.Color;

public class MainClass {

	public static void main(String[] args) {
		Sofer s = new Sofer("Popescu", "Ion", 35, 12345);
		Rezervor r = new Rezervor(500, 0);
		
		r.umpleRezervor(45.6);
		
		Autovehicul a = new Autovehicul("Ford", Color.BLUE, 200, 6, s, r);
		System.out.println(a);
		
		r.golesteRezervor(23.5);
		
		a.accelerare(25);
		a.cresteTreapta();
		System.out.println(a);
		a.cresteTreapta(3);
		a.accelerare(200);
		System.out.println(a);
		
		a.oprire();
		System.out.println(a);
	}

}
