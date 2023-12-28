public class Tura extends Piesa{
	public Tura(String n, int x, int y) {
		super(n, x, y);
	}

	public void mutaPiesa(int x, int y) {
		if(x < 0 || x > 7 || y < 0 || y > 7) {
			System.out.println("Mutarea nebunului " + numePiesa + " nu este valabila");
		}
		else if(x != coordX && y != coordY) {
			System.out.println("Mutarea nebunului " + numePiesa + " nu este valabila");
		}
		else {
			coordX = x;
			coordY = y;
		}
	}
}
