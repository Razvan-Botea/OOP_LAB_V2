
public class MainClass {

	public static void main(String[] args) {
		Piesa[] piese = new Piesa[5];
		
		Pion p1 = new Pion("p1", 1, 6);
		piese[0] = p1;
		
		Pion p2 = new Pion("p2", 2, 6);
		piese[1] = p2;
		
		Nebun n1 = new Nebun("n1", 6, 6);
		piese[2] = n1;
		
		Tura t1 = new Tura("t1", 0, 6);
		piese[3] = t1;
		
		CreareTabla t = new CreareTabla();
		t.creare(piese, 4);
		
		t1.mutaPiesa(0, 0);
		p1.mutaPiesa(1,  5);
		p2.mutaPiesa(2,  5);
		n1.mutaPiesa(7,  5);
		
		t.creare(piese,  4);
		
	}

}
