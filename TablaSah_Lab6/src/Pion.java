public class Pion extends Piesa{
	public Pion(String n, int x, int y) {
		super(n, x, y);
	}

	public void mutaPiesa(int x, int y) {
		if(x < 0 || x > 7 || y < 0 || y > 7) {
			System.out.println("Mutarea pionului " + numePiesa + " nu este valabila");
		}
		else if(x != coordX || y+1 != coordY) {
			System.out.println("Mutarea pionului " + numePiesa + " nu este valabila");
		}
		else {
			coordX = x;
			coordY = y;
		}
	}
}
